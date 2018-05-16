package com.internousdev.ecsite2.dto;

public class BuyItemDTO {
	public int id;
	public String itemName;
	public String image;
	public String itemPrice;
	public int count;
	public int total_price;
	public String pay;
	public int item_stock;
	public int total_count;

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

	public String getImage(){
		return image;
	}
	public void setImage(String image){
		this.image = image;
	}

	public String getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(String itemPrice){
		this.itemPrice = itemPrice;
	}

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal_price() {
		return total_price;
	}
	public void setTotal_price(int total_price) {
		this.total_price = total_price;
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

	public int getTotal_count() {
		return total_count;
	}
	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}


}
