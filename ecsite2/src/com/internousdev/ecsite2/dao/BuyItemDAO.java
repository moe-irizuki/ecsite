package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite2.dto.BuyItemDTO;
import com.internousdev.ecsite2.util.DBConnector;

public class BuyItemDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private List<BuyItemDTO> buyItemDTOList = new ArrayList<BuyItemDTO>();

	/**
	 * 商品情報取得メソッド
	 * @return BuyItemDTO
	 */
	public List<BuyItemDTO> getBuyItemInfo(){
		String sql = "SELECT id,product_id,item_name,image,item_price,item_stock FROM item_info_transaction";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				BuyItemDTO dto = new BuyItemDTO();
				dto.setId(resultSet.getInt("id"));
				dto.setProduct_id(resultSet.getInt("product_id"));
				dto.setItemName(resultSet.getString("item_name"));
				dto.setImage(resultSet.getString("image"));
				dto.setItemPrice(resultSet.getString("item_price"));
				dto.setItem_stock(resultSet.getInt("item_stock"));
				buyItemDTOList.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return buyItemDTOList;
	}
	public List<BuyItemDTO> getBuyItemDTO(){
		return buyItemDTOList;
	}

}
