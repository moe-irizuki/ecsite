package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.ProductDetailsDAO;
import com.internousdev.ecsite2.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductDetailsAction extends ActionSupport implements SessionAware{

	//セッション情報取得
	public Map<String, Object> session;
	private int id;
	private int product_id;
	private String itemName;
	private String image;
	private String itemPrice;
	private int count;
	private int item_stock;
	private int remainingCount;

//	private List<Integer> stockList = new ArrayList<Integer>();

	public BuyItemDTO detail = new BuyItemDTO();
//	public List<BuyItemDTO> detailsList = new ArrayList<BuyItemDTO>();

	private ProductDetailsDAO productDetailsDAO = new ProductDetailsDAO();

	public String execute() throws SQLException{
		try {
			System.out.println(product_id);
			detail = productDetailsDAO.getProductDetailsInfo(product_id);
			if(detail != null) {
				product_id = detail.getProduct_id();
				itemName = detail.getItemName();
				image = detail.getImage();
				itemPrice = detail.getItemPrice();
				item_stock = detail.getItem_stock();
			}else {
				return ERROR;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	//在庫判定
//	String userId;
//	boolean loginFlg;
//	loginFlg = (boolean) session.get("loginFlg");
//
//	if(loginFlg) {
//		userId = session.get("userId").toString();
//	}
//
//	CartInfoDAO cartInfoDAO = new CartInfoDAO();
//	count = cartInfoDAO.getCartProductCount(userId, product_id);
//	remainingCount = item_stock - count;
//	//1から在庫数までの選択表示用List
//	for(int i = 1; i <= remainingCount; i++) {
//		stockList.add(i);
//	}
	String result = SUCCESS;
	return result;
}

public Map<String, Object> getSession(){
	return session;
}

public void setSession(Map<String, Object> session) {
	this.session = session;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int product_id() {
	return product_id;
}

public void setProduct_id(int product_id) {
	this.product_id = product_id;
}

public String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	this.itemName = itemName;
}

public String getImage() {
	return image;
}

public void setImage(String image) {
	this.image = image;
}

public String getItemPrice() {
	return itemPrice;
}

public void setItemPrice(String itemPrice) {
	this.itemPrice = itemPrice;
}

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}

public int getItem_stock() {
	return item_stock;
}

public void setItem_stock(int item_stock) {
	this.item_stock = item_stock;
}

public int getRemainingCount() {
	return remainingCount;
}

public void setRemainingCount(int remainingCount) {
	this.remainingCount = remainingCount;
}
}
