package com.internousdev.myec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.myec.dto.ItemInsertDTO;
import com.internousdev.myec.util.DBConnector;

public class ItemInsertDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private ItemInsertDTO itemInsertDTO = new ItemInsertDTO();

	private String sql = "INSERT INTO item_info_transaction(item_name, item_price, item_stock, item_category,item_description, image_file_path) VALUES(?,?,?,?,?,?)";


	/**
	 * 商品追加メソッド
	 */

	public ItemInsertDTO itemInsertInfo(String itemName, String itemPrice, String itemStock, String itemCategory, String itemDescription, String imageFilePath) throws SQLException{

		try{

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, itemName);
			preparedStatement.setString(2, itemPrice);
			preparedStatement.setString(3, itemStock);
			preparedStatement.setString(4, itemCategory);
			preparedStatement.setString(5, itemDescription);
			preparedStatement.setString(6, imageFilePath);

			preparedStatement.executeUpdate();

		}catch(Exception e){

			e.printStackTrace();

		}finally{

			connection.close();

		}

	return itemInsertDTO;

	}

}
