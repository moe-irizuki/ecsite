package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.CartDeleteDAO;
import com.internousdev.ecsite2.dao.CartInfoDAO;
import com.internousdev.ecsite2.dao.LoginDAO;
import com.internousdev.ecsite2.dto.BuyItemDTO;
import com.internousdev.ecsite2.dto.CartInfoDTO;
import com.internousdev.ecsite2.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session.

	private String userId;

	private String tempUserId;

	private String password;

	private boolean saveIdFlg;

	private String errorMessage;

	private String idErrorMessage;

	private String passwordErrorMessage;

	private ArrayList<BuyItemtDTO> productDTOList = new ArrayList<BuyItemDTO>();
	//実行メソッド
	public String execute() throws SQLException{

		LoginDAO loginDAO = new LoginDAO();
		LoginDTO loginDTO = new LoginDTO();
		CartInfoDAO = cartInfoDAO = new CartInfoDAO();
		ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();


		//ID保持
		if(saveIdFlg){
			session.put("saveId", userId);
		}else{
			session,remove("saveId");
		}

		//入力チェック
		if(userId.equals("")){
			idErrorMessage = ("USER IDを入力してください。");
		}

		if(password.equals("")){
			passwordErrorMessage = ("PASSWORDを入力してください。");
		}

		if(idErrorMessage != null || passwordErrorMessage != null){
			return ERROR;
		}

		userInfoDTO = loginDAO.getLoginUserInfo(userId, password);
		if(userInfoDTO.getUserId() == null){
			errorMessage = ("入力されたPASSWORDが異なります。")
		}

		//管理者ユーザーか一般ユーザーか判定
		if(userInfoDTO.getMasterFlg().equals("1")){
			session.put("MasterFlg", 1);
			MasterDAO dao = newMasterDAO();
			productDTOList = dao.getProductInfo();
			return "master"
		}else{
			session.put("userId", userId);
			session.put("loginFlg", true);
			session.put("userInfoDTO", userInfoDTO);

		}
		return SUCCESS;
//		String result = ERROR;
//
//		// ログイン実行
//		loginDTO = loginDAO.getLoginUserInfo(loginUserId, loginPassword);
//
//		session.put("loginUser", loginDTO);
//
//
//		// ログイン情報を比較
//		if(((LoginDTO) session.get("loginUser")).getLoginMaster()){
//			buyItemDTOList=buyItemDAO.getBuyItemInfo();
//			session.put("buyItemDTOList", buyItemDTOList);
//			session.put("masterId",loginUserId);
//			result = "master";
//
//		}
//
//		if(result != "master"){
//			if(((LoginDTO) session.get("loginUser")).getLoginFlg()) {
//				result = SUCCESS;
//
//				// アイテム情報を取得
//
//				buyItemDTOList=buyItemDAO.getBuyItemInfo();
//
//				// BuyItemActionで利用したいから"buyItemDTOList"という鍵の名前でbuyItemDTOListのデータを保管する。
//				session.put("buyItemDTOList", buyItemDTOList);
//				session.put("id", buyItemDTO.getId());
//				session.put("login_user_id",loginDTO.getLoginId());
//				session.put("login_password", loginDTO.getLoginPassword());
//				session.put("userName", loginDTO.getUserName());
//				session.put("userAddress", loginDTO.getUserAddress());
//				session.put("userGender", loginDTO.getUserGender());
//				session.put("userTell", loginDTO.getUserTell());
//				session.put("userMail", loginDTO.getUserMail());
//			}
//
//		}
//
//
//		return result;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getIdErrorMessage() {
		return idErrorMessage;
	}
	public void setIdErrorMessage(String idErrorMessage) {
		this.idErrorMessage = idErrorMessage;
	}

	public String getPasswordErrorMessage(){
		return passwordErrorMessage;
	}

	public void setPasswordErrorMessage(String passwordErrorMessage){
		this.passwordErrorMessage = passwordErrorMessage;
	}

	public String getUserId(){
		return userId;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public ArrayList<BuyItemDTO> getBuyItemDTOList(){
		return buyItemDTOList;
	}
	public void setBuyItemDTOList(ArrayList<BuyItemDTO> buyItemDTOList){
		this.buyItemDTOList=buyItemDTOList;
	}

	public boolean isSaveIdFlg(){
		return saveIdFlg;
	}

	public void setSaveIdFlg(boolean saveIdFlg){
		this.saveIdFlg = saveIdFlg;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
