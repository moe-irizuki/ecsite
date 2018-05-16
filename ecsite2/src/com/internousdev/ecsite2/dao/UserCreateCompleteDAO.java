package com.internousdev.ecsite2.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite2.util.DBConnector;
import com.internousdev.ecsite2.util.DateUtil;

public class UserCreateCompleteDAO{

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO login_user_transaction (login_id, login_pass, user_name,insert_date,user_address,user_gender,user_tell,user_mail) VALUES(?, ? ,?, ?)";

	public void createUser(String loginUserId, String loginUserPassword, String userName, String userAddress, String userGender, String userTell, String userMail) throws SQLException {

		try {

			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ps.setString(2, loginUserPassword);
			ps.setString(3, userName);
			ps.setString(4, dateUtil.getDate());
			ps.setString(5, userAddress);
			ps.setString(6, userGender);
			ps.setString(7, userTell);
			ps.setString(8, userMail);

			ps.execute();

		} catch(Exception e) {

			e.printStackTrace();

		} finally {

			connection.close();

		}
	}
}