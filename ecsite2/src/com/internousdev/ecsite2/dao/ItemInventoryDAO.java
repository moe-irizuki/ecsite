package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite2.util.DBConnector;

//在庫変更メソッド

public class ItemInventoryDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private String sql = "UPDATE item_info_transaction SET item_stock =? WHERE id =?";

	public void itemInfo(int countControl, int item_transaction_id) throws SQLException{

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, countControl);
			preparedStatement.setInt(2, item_transaction_id);

			preparedStatement.executeUpdate();

		}catch(SQLException e){

			e.printStackTrace();

		}finally{

			connection.close();

		}
	}


}
