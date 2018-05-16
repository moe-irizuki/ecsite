package com.internousdev.myec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import com.internousdev.myec.util.DBConnector;

public class UserCreateConfirmDAO {

	/**
	 * 新規登録時にIDが重複していないか確認するメソッド
	 */

	private DBConnector db = new DBConnector();

	private Connection con = db.getConnection();

	private boolean result =false;

	public Map<String, Object> session;

	public boolean getUserInfo(String loginUserId, String loginPassword){

		String sql="SELECT * FROM login_user_transaction";

		try{

			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){

				String loginId = rs.getString("login_id");
				String password = rs.getString("login_pass");

				if(loginId.equals(loginUserId) || password.equals(loginPassword)){


					//IDが重複していたらfalse
					if(loginId.equals(loginUserId)){

						result = false;
						return result;

						//パスワードのみ重複していたらtrue
					}else{
						result = true;
					}

				}else{

					//IDもパスワードも同じではない時はtrue
					result = true;
				}
			}

		}catch(Exception e){

			e.printStackTrace();
		}

		return result;
	}



	public Map<String, Object> getSession(){
		return session;
	}
	public void setSession(Map<String, Object> session){
		this.session=session;
	}
}


