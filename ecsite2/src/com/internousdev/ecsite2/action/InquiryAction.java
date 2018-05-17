package com.internousdev.ecsite2.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dto.InquiryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class InquiryAction extends ActionSupport implements SessionAware{

	List<InquiryDTO> inquiryDTOList = new ArrayList<InquiryDTO>();

	private Map<String, Object> session;

	public String execute(){

		return SUCCESS;

	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
