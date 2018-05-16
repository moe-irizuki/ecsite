package com.internousdev.myec.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.myec.dao.BuyItemDAO;
import com.internousdev.myec.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;


public class GoItemDeleteAction  extends ActionSupport implements SessionAware{

	public Map<String, Object> session;

	private BuyItemDAO buyItemDAO=new BuyItemDAO();

	private BuyItemDTO buyItemDTO=new BuyItemDTO();

	private List<BuyItemDTO> buyItemDTOList;


	/**
	 * 実行メソッド
	 */
		public String execute(){

			String result;

			// アイテム情報を取得

			buyItemDTOList=buyItemDAO.getBuyItemInfo();

			session.put("buyItemDTOList", buyItemDTOList);

			session.put("id", buyItemDTO.getId());

			result = SUCCESS;

			return result;
	}


	public List<BuyItemDTO> getBuyItemDTOList() {

		return buyItemDTOList;
	}


	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList) {

		this.buyItemDTOList = buyItemDTOList;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}