package com.internousdev.ecsite2.action;

import java.awt.List;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {
	private ArrayList<BuyItemDTO> buyItemDTOList = new ArrayList<>();
	//アイテム個数
	private List<String> count;
	//支払い方法
	private String pay;
	//アイテム情報を格納
	public Map<String,Object> session;

	//商品情報取得メソッド
	public String execute() {
		String result = SUCCESS;
		session.put("count", count);
		@SuppressWarnings("unchecked")
		List<BuyItemDTO> list=(List<BuyItemDTO>) session.get("buyItemDTOList");
		//合計金額を計算する処理
		for(int i=0; i<count.size(); i++) {
			BuyItemDTO buyItemDTO=new BuyItemDTO();

			String buyItemName=list.get(i).getItemName();
			session.put("itemName", buyItemName);

			int buyItemPrice=list.get(i).getItemPrice();
			session.put("itemPrice", buyItemPrice);

			int buyItemId=list.get(i).getId();
			session.put("id", buyItemId);

			int item_stock=list.get(i).getItem_stock();

			int intCount = list.get(i).getCount();

			int intPrice = list.get(i).getPrice();
//			int intCount = Integer.parseInt(session.get("count").toString());
//			int intPrice = Integer.parseInt(session.get("buyItem_price").toString());
//			session.put("total_price", intCount * intPrice);

			if(intCount != 0) {
				buyItemDTO.setId((int) session.get("id"));
				buyItemDTO.setItemName(session.get("itemName").toString());
				buyItemDTO.setItemPrice(session.get("itemPrice").toString());
				buyItemDTO.setCount(intCount);
				buyItemDTO.setItem_stock(item_stock);
				buyItemDTO.setTotal_price(intCount * intPrice);
				session.put("total_price", intCount * intPrice);

				//支払い方法を選択
				String payment;
				if(pay.equals("1")) {
					payment = "現金払い";
					session.put("pay", payment);
				}else {
					payment = "クレジットカード";
					session.put("pay", payment);
				}
				BuyItemDTOList.add(buyItemDTO);
			}
			session.put("list", buyItemDTOList);
		}

		if(buyItemDTOList.size()>1) {
			int totalPrice = 0;
			for(int a = 0; a<buyItemDTOList.size(); a++) {
				totalPrice = totalPrice + buyItemDTOList.get(a).getTotal_price();
			}
			System.out.println(totalPrice);
			session.put("totalPrice", totalPrice);
		}
		return result;
	}

	public List<String> getCount(){
		return count;
	}
	public void setCount(List<String> count) {
		this.count = count;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	public ArrayList<BuyItemDTO> getBuyItemDTOList(){
		return buyItemDTOList;
	}
	public void setBuyItemDTOList(ArrayList<BuyItemDTO> buyItemDTOList) {
		this.buyItemDTOList = buyItemDTOList;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}