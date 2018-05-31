package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.BuyItemCompleteDAO;
import com.internousdev.ecsite2.dao.CartDeleteDAO;
import com.internousdev.ecsite2.dao.CartInfoDAO;
import com.internousdev.ecsite2.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemCompleteAction extends ActionSupport implements SessionAware {
	//userId格納
	private String userId;
	//cartInfoDAO格納List
	private Map<String,Object> session;

	private int cartTotalPrice;
	private ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();
	private ArrayList<CartInfoDTO> cartInfoList = new ArrayList<CartInfoDTO>();
	private String errorMessage;


	public String execute() throws SQLException{
		String result = SUCCESS;
		userId = (String) session.get("userId");
		BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
		CartInfoDAO dao = new CartInfoDAO();

		CartDeleteDAO cartDeleteDAO = new CartDeleteDAO();

		//カート情報取得
		cartList = buyItemCompleteDAO.getCartInfo(userId);

		//在庫を更新
		int productResult = 0;
		productResult = buyItemCompleteDAO.updateProductCount(cartList);

		if(productResult < 0){
			return ERROR;
		}

		//履歴にいれる
		int count = 0;
		count = buyItemCompleteDAO.setPurchseHistory(cartList);

		if(count <= 0){
			return ERROR;
		}

		cartList = dao.getUserCartList((String) session.get("userId"));

			//カートの中身を削除
			int deleteCount = 0;
			deleteCount = cartDeleteDAO.deleteAllCartInfo(session.get("userId").toString());

			if(deleteCount <= 0){
				return ERROR;
			}

			cartTotalPrice = cartTotalPrice(getCartList());

		return result;
	}

	public int cartTotalPrice(ArrayList<CartInfoDTO> cartList){
		int totalPrice = 0;
		for(CartInfoDTO dto : cartList){
			totalPrice += dto.getPrice() * dto.getProductCount();
		}

		return totalPrice;
	}

	public String getUserId(){
		return userId;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public ArrayList<CartInfoDTO> getCartList(){
		return cartList;
	}

	public void setCartInfoDTOList(ArrayList<CartInfoDTO> cartList){
		this.cartList = cartList;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public int getCartTotalPrice(){
		return cartTotalPrice;
	}

	public void setCartTotalPrice(int cartTotalPrice){
		this.cartTotalPrice = cartTotalPrice;
	}

	public String getErrormessage(){
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}

	public ArrayList<CartInfoDTO> getCartInfoList(){
		return cartInfoList;
	}

	public void setCartInfoList(ArrayList<CartInfoDTO> cartInfoList){
		this.cartInfoList = cartInfoList;
	}
}
