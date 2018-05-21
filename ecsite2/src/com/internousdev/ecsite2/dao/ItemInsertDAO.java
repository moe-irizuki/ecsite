package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite2.dto.ItemInsertDTO;
import com.internousdev.ecsite2.util.DBConnector;

public class ItemInsertDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private ItemInsertDTO itemInsertDTO = new ItemInsertDTO();

	private String sql = "INSERT INTO item_info_transaction(item_name, item_price, item_stock, image) VALUES(?,?,?,?)";

	//商品追加メソッド

	public ItemInsertDTO itemInsertInfo(String itemName, String itemPrice, String itemStock, String image) throws SQLException{

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, itemName);
			preparedStatement.setString(2, itemPrice);
			preparedStatement.setString(3, itemStock);
			preparedStatement.setString(4, image);

			preparedStatement.executeUpdate();

		}catch(Exception e){

			e.printStackTrace();

		}finally{

			connection.close();

		}

		return itemInsertDTO;

	}

}
