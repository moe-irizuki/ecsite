package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;
	private int totalPrice = 0;//合計金額
	private int productCount;//個数
	private List<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();//カート情報一覧

	private int finallyTotalPrice;
	private ArrayList<CartInfoDTO> cartInfoList = new ArrayList<CartInfoDTO>();
	private int cartTotalPrice;
	private String errorMessage;

	public  String execute() throws SQLException{
		String result = ERROR;
		String userId;
	if((boolean)session.get("loginFlg")) {
		userId = session.get("userId").toString();
	}

//	CartInfoDAO cartInfoDAO = new CartInfoDAO();
//	cartList = cartInfoDAO.getUserCartList(userId);

	for(CartInfoDTO dto:cartList) {
		totalPrice += dto.getPrice();
	}
	for(int i = 0; i < cartList.size(); i++) {
		finallyTotalPrice += cartList.get(i).getTotalPrice();
	}
	result = SUCCESS;
	return result;
	}

	public List<CartInfoDTO> getCartList(){
		return cartList;
	}

	public void setCartList(List<CartInfoDTO> cartList) {
		this.cartList = cartList;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getFinallyTotalPrice() {
		return finallyTotalPrice;
	}

	public void setFinallyTotalPrice(int finallyTotalPrice) {
		this.finallyTotalPrice = finallyTotalPrice;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public Map<String, Object>getSession(){
		return session;
	}

	public void setSession(Map<String, Object>session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public ArrayList<CartInfoDTO> getCartInfoList(){
		return cartInfoList;
	}

	public void setCartInfoList(ArrayList<CartInfoDTO> cartInfoList) {
		this.cartInfoList = cartInfoList;
	}

	public int getCartTotalPrice() {
		return cartTotalPrice;
	}

	public void setCartTotalPrice(int cartTotalPrice) {
		this.cartTotalPrice = cartTotalPrice;
	}

//	//商品購入情報登録メソッド
//
//	@SuppressWarnings("unchecked")
//	public String execute() throws SQLException{
//
//		String result = ERROR;
//
//		//BuyItemActionの"list"の値を取得
//		buyItemDTOList = (ArrayList<BuyItemDTO>) session.get("list");
//
//		for(int i = 0; i<buyItemDTOList.size(); i++){
//
//			int stock = buyItemDTOList.get(i).getItem_stock();
//
//			int id = buyItemDTOList.get(i).getId();
//
//			int total_price = buyItemDTOList.get(i).getTotal_price();
//
//			int count = buyItemDTOList.get(i).getCount();
//
//			int item_stock = stock - count;
//
//			System.out.println(item_stock);
//
//			if(item_stock < 0){
//
//				result = ERROR;
//
//			}else{
//
//				//BuyItemCompleteDAOで定義したメソッドを使用
//				BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
//
//				buyItemCompleteDAO.buyItemInfo(id, session.get("login_user_id").toString(), total_price, count, buyItemDTOList.get(i).getPay(), item_stock);
//
//				result = SUCCESS;
//			}
//		}
//
//		return result;
//	}
//
//	@Override
//	public void setSession(Map<String,Object> session) {
//		this.session = session;
//	}

}
