package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.UserUpdateDAO;
import com.internousdev.ecsite2.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateConfirmAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;

	public UserUpdateDAO userUpdateDAO = new UserUpdateDAO();

	/**
	 * 実行メソッド
	 * UserUpdateDAOで作ったメソッドで値を更新する
	 */

	public String execute() throws SQLException{

		String result = ERROR;

		//UserUpdateActionでsessionに保管した値を取得してObject→Stringに変換
		boolean checkUpdate = userUpdateDAO.userUpdateInfo(session.get("loginUserId").toString(),
				session.get("loginPassword").toString(),
				session.get("userName").toString(),
				session.get("userAddress").toString(),
				session.get("userGender").toString(),
				session.get("userTell").toString(),
				session.get("userMail").toString(),
				((LoginDTO) session.get("loginUser")).getUserNumber().toString());

		if(checkUpdate){

			result = SUCCESS;

		}

		return result;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
