package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite2.util.DBConnector;
import com.internousdev.ecsite2.util.DateUtil;

public class UserUpdateDAO {

	/**
	 * ユーザーの情報を更新するメソッド
	 */

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	private String sql = "UPDATE login_user_transaction SET login_id=?, login_pass=?, user_address=?, user_gender=?, user_tell=?, user_mail=?, update_date=? WHERE id=?";

	public boolean userUpdateInfo(String login_id, String login_pass, String user_name, String user_address, String user_gender, String user_tell, String user_mail, String defaultLoginId) throws SQLException{

		boolean result = false;

		try{
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, login_id);
			ps.setString(2, login_pass);
			ps.setString(3, user_name);
			ps.setString(4, user_address);
			ps.setString(5, user_gender);
			ps.setString(6, user_tell);
			ps.setString(7, user_mail);
			ps.setString(8, dateUtil.getDate());
			ps.setString(9, defaultLoginId);

			int checkUpdate = ps.executeUpdate();

			if(checkUpdate > 0){
				result = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return result;
	}
}