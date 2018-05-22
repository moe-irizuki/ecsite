package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.ItemInventoryDAO;
import com.internousdev.ecsite2.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemInventoryConfirmAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;

	//後で数値を入れるので空のbuyItemDTOListを宣言しておく
	private ArrayList<BuyItemDTO> buyItemDTOList = new ArrayList<>();

	//実行メソッド

	public String execute() throws SQLException{

		//ItemInvedtoryControlActionで定義した"list"から値を取得
		@SuppressWarnings("unchecked")
		List<BuyItemDTO> list = (ArrayList<BuyItemDTO>) session.get("list");

		for(int i=0; i < list.size(); i++){

			int count = list.get(i).getCount();

			int totalCount = list.get(i).getTotal_count();

			String itemName = list.get(i).getItemName();

			String image = list.get(i).getImage();

			//DBに値を格納するメソッドで使用するのでidも取得しておく
			int id = list.get(i).getId();

			BuyItemDTO buyItemDTO = new BuyItemDTO();
			buyItemDTO.setItemName(itemName);
			buyItemDTO.setImage(image);
			buyItemDTO.setTotal_count(totalCount);
			buyItemDTO.setCount(count);

			buyItemDTOList.add(buyItemDTO);

			//ItemInvestoryDAOのメソッドを使ってDBに値を保管

			ItemInventoryDAO itemInventoryDAO = new ItemInventoryDAO();

			itemInventoryDAO.itemInfo(totalCount, id);

		}

		String result = SUCCESS;

		return result;

	}

	public ArrayList<BuyItemDTO> getBuyItemDTOList(){
		return buyItemDTOList;
	}

	public void setBuyItemDTOList(ArrayList<BuyItemDTO> buyItemDTOList){
		this.buyItemDTOList = buyItemDTOList;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
