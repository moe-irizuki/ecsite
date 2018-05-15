package com.internousdev.myec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.myec.util.DBConnector;


public class ItemDeleteDAO {

	/**
	 * 商品の削除メソッド
	 */

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private String sql = "DELETE FROM item_info_transaction WHERE item_name=?";


	public void itemDeleteInfo(String deleteName) throws SQLException{

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, deleteName);
			preparedStatement.executeUpdate();

		}catch(SQLException e){

			e.printStackTrace();

		}finally{

			connection.close();
		}


	}

}
