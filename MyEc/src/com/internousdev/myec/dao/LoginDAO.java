package com.internousdev.myec.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.myec.dto.LoginDTO;
import com.internousdev.myec.util.DBConnector;

public class LoginDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private LoginDTO loginDTO = new LoginDTO();

	/**
	 * ログインユーザ情報取得メソッド
	 * （引数はloginUserId と loginPassword）
	 */

	public LoginDTO getLoginUserInfo(String loginUserId, String loginPassword) {

		//入力されたloginUserId と loginPasswordでDBを検索
		String sql = "SELECT * FROM login_user_transaction where login_id = ? AND login_pass = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);

			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				loginDTO.setLoginId(resultSet.getString("login_id"));
				loginDTO.setLoginPassword(resultSet.getString("login_pass"));
				loginDTO.setUserName(resultSet.getString("user_name"));
				loginDTO.setUserAddress(resultSet.getString("user_address"));
				loginDTO.setUserSex(resultSet.getString("user_sex"));
				loginDTO.setUserTell(resultSet.getString("user_tell"));
				loginDTO.setUserMail(resultSet.getString("user_mail"));
				loginDTO.setUserNumber(resultSet.getString("id"));

				//login_idが空白でなければログインチェックをtrueにする
				if(!(resultSet.getString("login_id").equals(null))) {
					loginDTO.setLoginFlg(true);
				}

				//login_idがkanriでlogin_passが123なら管理者チェックをtrueにする
				if(resultSet.getString("login_id").equals("kanri")
						&&resultSet.getString("login_pass").equals("123")){
					loginDTO.setLoginMaster(true);
				}
			}

		} catch(Exception e) {
			e.printStackTrace();
		}

		return loginDTO;
	}


	 // loginDTOのgetter
	public LoginDTO getLoginDTO() {
		return loginDTO;
	}
}

