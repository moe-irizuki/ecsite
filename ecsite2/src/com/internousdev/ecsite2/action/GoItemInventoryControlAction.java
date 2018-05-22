package com.internousdev.ecsite2.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.BuyItemDAO;
import com.internousdev.ecsite2.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoItemInventoryControlAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;

	private BuyItemDAO buyItemDAO = new BuyItemDAO();

	private BuyItemDTO buyItemDTO = new BuyItemDTO();

	private List<BuyItemDTO> buyItemDTOList;

	//実行メソッド
	public String execute(){

		String result;

		//アイテム情報を取得
		buyItemDTOList = buyItemDAO.getBuyItemInfo();

		//BuyItemActionで利用したいので"buyItemDTOList"という
		//鍵の名前でbuyItemDTOListのデータを保管する。
		session.put("buyItemDTOList", buyItemDTOList);

		session.put("id", buyItemDTO.getId());

		result = SUCCESS;

		return result;

	}

	public List<BuyItemDTO> getBuyItemDTOList(){
		return buyItemDTOList;
	}

	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList){
		this.buyItemDTOList = buyItemDTOList;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
