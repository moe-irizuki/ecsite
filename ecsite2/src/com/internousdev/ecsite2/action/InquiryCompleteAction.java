package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.InquiryCompleteDAO;
import com.internousdev.ecsite2.dto.InquiryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class InquiryCompleteAction extends ActionSupport implements SessionAware{

	private String inquiry_name;

	private String inquiry_mail;

	private String qtype;

	private String body;

	private String master_id;

	List<InquiryDTO> inquiryDTOList = new ArrayList<InquiryDTO>();

	private Map<String, Object> session;

	//実行メソッド

	public String execute() throws SQLException{

		String ret = ERROR;
		InquiryCompleteDAO inquiryCompleteDAO = new InquiryCompleteDAO();

		int count = inquiryCompleteDAO.insert(
				session.get("inquiryName").toString(),
				session.get("inquiryMail").toString(),
				session.get("inquiryQtype").toString(),
				session.get("inquiryBody").toString(),
				master_id);

				session.put("master_id",  master_id);

		if(count > 0){
			inquiryDTOList = inquiryCompleteDAO.select();
			session.put("inquiryDTOList", inquiryDTOList);
			session.put("master_id", master_id);

			ret = SUCCESS;
		}

		return ret;

	}

	public String getInquiry_name(){
		return inquiry_name;
	}

	public void setInquiry_name(String inquiry_name){
		this.inquiry_name = inquiry_name;
	}

	public String getInquiry_mail(){
		return inquiry_mail;
	}

	public void setInquiry_mail(String inquiry_mail){
		this.inquiry_mail = inquiry_mail;
	}

	public String getQtype(){
		return qtype;
	}

	public void setQtype(String qtype){
		this.qtype = qtype;
	}

	public String getBody(){
		return body;
	}

	public void setBody(String body){
		this.body = body;
	}

	public String getMaster_id(){
		return master_id;
	}

	public void setMaster_id(String master_id){
		this.master_id = master_id;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
