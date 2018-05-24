package com.internousdev.ecsite2.dto;

public class BuyItemDTO {

	//商品情報を保管する変数

	private int id;

	private String itemName;

	private String itemPrice;

	private int total_price;

	private int count;

	private int total_count;

	private String pay;

	private int item_stock;

	private String image;

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
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

	public int getTotal_price() {
		return total_price;
	}
	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal_count() {
		return total_count;
	}
	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}

	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}

	public int getItem_stock() {
		return item_stock;
	}
	public void setItem_stock(int item_stock) {
		this.item_stock = item_stock;
	}

	public String getImage(){
		return image;
	}
	public void setImage(String image){
		this.image = image;
	}



}
