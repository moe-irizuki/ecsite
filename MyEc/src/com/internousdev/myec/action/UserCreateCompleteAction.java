package com.internousdev.myec.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.myec.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	private String loginUserId;

	private String loginPassword;

	private String userName;

	private String userSex;

	private String userTell;

	private String userMail;

	public Map<String,Object> session;

	private UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();

	public String execute() throws SQLException {

		userCreateCompleteDAO.createUser(

				session.get("loginUserId").toString(),
				session.get("loginPassword").toString(),
				session.get("userName").toString(),
				session.get("userAddress").toString(),
				session.get("userSex").toString(),
				session.get("userTell").toString(),
				session.get("userMail").toString());

		String result = SUCCESS;

		return result ;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserTell() {
		return userTell;
	}

	public void setUserTell(String userTell) {
		this.userTell = userTell;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}

