package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite2.dto.LoginDTO;
import com.internousdev.ecsite2.util.DBConnector;

public class LoginDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private LoginDTO loginDTO = new LoginDTO();

	/**
	 * ログインユーザー取得メソッド
	 *
	 * @param loginUserId
	 * @param loginPassword
	 * @return LoginDTO
	 */
	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){

		String sql = "SELECT * FROM login_user_transaction where login_id = ? AND login_pass = ?";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);

			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){
				loginDTO.setLoginId(resultSet.getString("login_id"));
				loginDTO.setLoginPassword(resultSet.getString("login_pass"));
				loginDTO.setUserName(resultSet.getString("user_name"));
				loginDTO.setUserAddress(resultSet.getString("user_address"));
				loginDTO.setUserGender(resultSet.getString("user_gender"));
				loginDTO.setUserTell(resultSet.getString("user_tell"));
				loginDTO.setUserMail(resultSet.getString("user_mail"));
				loginDTO.setUserNumber(resultSet.getString("id"));


				if(!(resultSet.getString("login_id").equals(null))){
					loginDTO.setLoginFlg(true);
				}

				if(resultSet.getString("login_id").equals("internous")
						&&resultSet.getString("login_pass").equals("internous01")){
					loginDTO.setLoginMaster(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}

		return loginDTO;
	}
	public LoginDTO getLoginDTO(){
		return loginDTO;
	}

}
