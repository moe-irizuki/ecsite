package com.internousdev.myec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.myec.util.DBConnector;
import com.internousdev.myec.util.DateUtil;


public class UserCreateCompleteDAO {

	/**
	 * 新規ユーザー登録のDB保存メソッド
	 */

	private DBConnector db = new DBConnector();

	private Connection con = db.getConnection();

	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO login_user_transaction (login_id, login_pass, user_name, insert_date, user_address, user_sex, user_tell, user_mail) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

	public void createUser(String loginUserId, String loginUserPassword, String userName, String userAddress, String userSex,  String userTell, String userMail) throws SQLException {

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ps.setString(2, loginUserPassword);
			ps.setString(3, userName);
			ps.setString(4, dateUtil.getDate());
			ps.setString(5, userAddress);
			ps.setString(6, userSex);
			ps.setString(7, userTell);
			ps.setString(8, userMail);

			ps.execute();

		} catch(Exception e) {

			e.printStackTrace();

		} finally {

			con.close();
		}
	}
}
