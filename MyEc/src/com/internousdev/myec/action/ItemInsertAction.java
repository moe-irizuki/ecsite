package com.internousdev.myec.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.myec.dao.ItemInsertDAO;
import com.internousdev.myec.dto.ItemInsertDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemInsertAction extends ActionSupport implements SessionAware{

	private String itemName;

	private String itemPrice;

	private String itemStock;

	private String itemCategory;

	private String itemDescription;

	private String imageFilePath;

	public Map<String,Object> session;

	private ItemInsertDTO dto = new ItemInsertDTO();

	private ItemInsertDAO dao = new ItemInsertDAO();


	public String execute() throws SQLException{

		String result = ERROR;

		//入力内容の文字数が0でなければsuccess
		//→sessionを使って他でも利用できるようにする
		if(itemName.length() != 0 && itemPrice.length() != 0 && itemStock.length() != 0 && itemCategory.length() != 0 && itemDescription.length() != 0 && imageFilePath.length() != 0 ){

			dto = dao.itemInsertInfo(itemName, itemPrice, itemStock, itemCategory, itemDescription, imageFilePath);

			session.put("itemInsertDTO", dto);
			session.put("itemName",itemName);
			session.put("itemPrice", itemPrice);
			session.put("itemStock",itemStock);
			session.put("itemCategory",itemCategory);
			session.put("itemDescription",itemDescription);
			session.put("imageFilePath",imageFilePath);

			result = SUCCESS;

		}return result;

	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}


	public String getItemStock() {
		return itemStock;
	}


	public void setItemStock(String itemStock) {
		this.itemStock = itemStock;
	}


	public String getItemCategory() {
		return itemCategory;
	}


	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}


	public String getItemDescription() {
		return itemDescription;
	}


	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}


	public String getImageFilePath() {
		return imageFilePath;
	}


	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}


}
