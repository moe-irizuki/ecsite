package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite2.dto.CartInfoDTO;
import com.internousdev.ecsite2.util.DBConnector;
import com.internousdev.ecsite2.util.DateUtil;

public class BuyItemCompleteDAO {

	// カート内情報を取得しCartInfoDTOにsetするメソッド
	public ArrayList<CartInfoDTO> getCartInfo(String userId)throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		ArrayList<CartInfoDTO> cartInfoList = new ArrayList<CartInfoDTO>();

		//cart_info,item_info_transaction内の共通product_idで2つのテーブルを結合
		String sql = "SELECT iit.item_stock as item_stock,ci.user_id as userId,ci.id as cartId,ci.product_id as product_id,iit.item_name as item_name,iit.image as image,iit.item_price as item_price,ci.product_count as product_count FROM cart_info as ci LEFT JOIN item_info_transaction as iit ON ci.product_id = iit.product_id WHERE ci.user_id = ?";
		try{
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				CartInfoDTO dto = new CartInfoDTO();
				// iitテーブル
				dto.setProductName(rs.getString("item_name"));
				dto.setImage(rs.getString("image"));
				dto.setStock(rs.getInt("item_stock"));
				dto.setPrice(rs.getInt("item_price"));
				// ciテーブル
				dto.setUserId(rs.getString("userId"));
				dto.setProductId(rs.getInt("product_id"));
				dto.setProductCount(rs.getInt("product_count"));

				cartInfoList.add(dto);
				}
			}catch(SQLException e){
				e.printStackTrace();
		}finally{
			connection.close();
		}

		return cartInfoList;
	}

	public int setPurchseHistory(List<CartInfoDTO> cartList) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		DateUtil dateUtil = new DateUtil();

		int ret = 0;

		try{
			for(int i = 0; i < cartList.size(); i++){
				String sql = "INSERT INTO user_buy_item_transaction(item_transaction_id,total_price,total_count,user_master_id,insert_date) VALUES(?,?,?,?,?)";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);

				preparedStatement.setInt(1, cartList.get(i).getProductId());
				preparedStatement.setInt(2, cartList.get(i).getPrice());
				preparedStatement.setInt(3, cartList.get(i).getProductCount());
				preparedStatement.setString(4, cartList.get(i).getUserId());
				preparedStatement.setString(5, dateUtil.getDate());

				ret += preparedStatement.executeUpdate();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return ret;
	}

	// /**
	// * 商品購入情報登録メソッド
	// * @param item_transaction_id
	// * @param user_master_id
	// * @param total_price
	// * @param total_count
	// * @param pay
	// * @throws SQLException
	// */
	public int updateProductCount(List<CartInfoDTO> cartList) throws SQLException {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		int ret = 0;
		String sql ="UPDATE item_info_transaction set item_stock = ?, update_date = now() WHERE product_id = ?";

		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			for(CartInfoDTO item : cartList){

			preparedStatement.setInt(1, item.getStock() - item.getProductCount());
			preparedStatement.setInt(2, item.getProductId());

			ret += preparedStatement.executeUpdate();

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return ret;
	}


}
