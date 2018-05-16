package com.internousdev.myec.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.myec.dao.BuyItemDAO;
import com.internousdev.myec.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoHomeAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	private BuyItemDAO buyItemDAO = new BuyItemDAO();

	private List<BuyItemDTO> buyItemDTOList;

	public String execute() {

		String result = SUCCESS;

		if(session.containsKey("masterId")){

			buyItemDTOList = buyItemDAO.getBuyItemInfo();

			session.put("buyItemDTOList", buyItemDTOList);

			result = "master";
		}
		return result;
	}


	public Map<String, Object> getSession() {

		return this.session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
