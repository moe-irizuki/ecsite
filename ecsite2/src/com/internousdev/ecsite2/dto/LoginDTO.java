package com.internousdev.ecsite2.dto;

public class LoginDTO {

	private String loginId;
	private String loginPassword;
	private String userName;
	private String userAddress;
	private String userGender;
	private String userTell;
	private String userMail;
	private String userNumber;
	private boolean loginFlg = false;
	private boolean loginMaster = false;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginUserId) {
		this.loginId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddress(){
		return userAddress;
	}

	public void setUserAddress(String userAddress){
		this.userAddress = userAddress;
	}

	public String getUserGender(){
		return userGender;
	}

	public void setUserGender(String userGender){
		this.userGender = userGender;
	}

	public String getUserTell(){
		return userTell;
	}

	public void setUserTell(String userTell){
		this.userTell = userTell;
	}

	public String getUserMail(){
		return userMail;
	}

	public void setUserMail(String userMail){
		this.userMail = userMail;
	}

	public String getUserNumber(){
		return userNumber;
	}

	public void setUserNumber(String userNumber){
		this.userNumber = userNumber;
	}

	public boolean getLoginFlg() {
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}

	public boolean getLoginMaster(){
		return loginMaster;
	}

	public void setLoginMaster(boolean loginMaster){
		this.loginMaster = loginMaster;
	}

}
