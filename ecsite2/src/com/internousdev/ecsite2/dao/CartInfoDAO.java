package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite2.dto.CartInfoDTO;
import com.internousdev.ecsite2.util.DBConnector;

public class CartInfoDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection con = null;

	//ユーザーのカートに商品を追加する
	public int insertUserCart(String userId, int product_id, int productCount, int price) throws SQLException{
		String sql = "INSERT INTO cart_info(user_id, product_id, product_count, price, insert_date) VALUES(?,?,?,?,NOW())";
		int count = 0;
		try{
			con = dbConnector.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setInt(2, product_id);
			ps.setInt(3, productCount);
			ps.setInt(4, price);
			count = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return count;
	}

	//ユーザーのカート情報を取得
	public ArrayList<CartInfoDTO> getUserCartList(String userId) throws SQLException{
		int totalPrice = 0;
		ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();

		String sql ="SELECT iit.item_stock as item_stock,ci.user_id as userId,ci.id as cartId,ci.product_id as product_id,iit.item_name as item_name,iit.image as image, iit.item_price as item_price,ci.product_count as product_count FROM cart_info as ci LEFT JOIN item_info_transaction as iit ON ci.product_id = iit.product_id WHERE ci.user_id = ? ";

		try{
			con = dbConnector.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);

			ResultSet resultSet =ps.executeQuery();

			while(resultSet.next()){
				CartInfoDTO dto = new CartInfoDTO();
				dto.setUserId(resultSet.getString("userId"));
				dto.setProductId(resultSet.getInt("product_id"));
				dto.setStock(resultSet.getInt("item_stock"));
				dto.setCartId(resultSet.getInt("cartId"));
				dto.setProductName(resultSet.getString("item_name"));
				dto.setImage(resultSet.getString("image"));
				//商品合計金額を計算
				int price = resultSet.getInt("item_price");
				int productCount = resultSet.getInt("product_count");
				dto.setPrice(price);
				dto.setProductCount(productCount);
				totalPrice = price * productCount;
				dto.setTotalPrice(totalPrice);

				cartList.add(dto);
			}

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return cartList;
	}
}

