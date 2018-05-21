package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.ItemInsertDAO;
import com.internousdev.ecsite2.dto.ItemInsertDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemInsertAction extends ActionSupport implements SessionAware{

	private String itemName;

	private String itemPrice;

	private String itemStock;

	private String image;

	public Map<String, Object> session;

	private ItemInsertDTO dto = new ItemInsertDTO();

	private ItemInsertDAO dao = new ItemInsertDAO();


	public String execute() throws SQLException{

		String result = ERROR;

		//入力内容の文字数が0でなければsuccess
		//sessionを使って他でも利用できるようにする
		if(itemName.length() != 0 && itemPrice.length() != 0 && itemStock.length() != 0 && image.length() != 0){

			dto = dao.itemInsertInfo(itemName, itemPrice, itemStock, image);

			session.put("itemInsertDTO", dto);
			session.put("itemName", itemName);
			session.put("itemPrice", itemPrice);
			session.put("itemStock", itemStock);
			session.put("image", image);

			result = SUCCESS;

		}return result;

	}

	public String getItemName(){
		return itemName;
	}

	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public String getItemPrice(){
		return itemPrice;
	}

	public void setItemPrice(String itemPrice){
		this.itemPrice = itemPrice;
	}

	public String getItemStock(){
		return itemStock;
	}

	public void setItemStock(String itemStock){
		this.itemStock = itemStock;
	}

	public String getImage(){
		return image;
	}

	public void setImage(String image){
		this.image = image;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
