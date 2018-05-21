package com.internousdev.ecsite2.dto;

public class ItemInsertDTO {

	//商品追加用の情報格納DTO

	private String itemName;

	private String itemPrice;

	private String itemStock;

	private String image;

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
}
