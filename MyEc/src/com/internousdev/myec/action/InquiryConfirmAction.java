package com.internousdev.myec.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class InquiryConfirmAction extends ActionSupport implements SessionAware{

	private String inquiry_name;

	private String inquiry_mail;

	private String qtype;

	private String body;

	private String master_id;

	public Map<String, Object> session;

	private String errorMessage;


	public String execute(){

		String result = ERROR;

		if(!(inquiry_name.equals(""))
				&& !(inquiry_mail.equals(""))
				&& !(body.equals(""))){

			session.put("inquiryName", inquiry_name);
			session.put("inquiryMail", inquiry_mail);
			session.put("inquiryBody", body);
			session.put("inquiryQtype", qtype);

			result = SUCCESS;

		}else{

			setErrorMessage("未入力の項目があります。");
			result = ERROR;

			}return result;

	}


	public String getInquiry_name() {
		return inquiry_name;
	}


	public void setInquiry_name(String inquiry_name) {
		this.inquiry_name = inquiry_name;
	}


	public String getInquiry_mail() {
		return inquiry_mail;
	}


	public void setInquiry_mail(String inquiry_mail) {
		this.inquiry_mail = inquiry_mail;
	}


	public String getQtype() {
		return qtype;
	}


	public void setQtype(String qtype) {
		this.qtype = qtype;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}


	public String getMaster_id() {
		return master_id;
	}


	public void setMaster_id(String master_id) {
		this.master_id = master_id;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



}
