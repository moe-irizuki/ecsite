package com.internousdev.myec.dto;

public class InquiryDTO {

	/**
	 * 問い合わせの
	 * 「名前」「メール」「質問の種類」「内容」
	 * を保管するための変数
	 */

	private String inquiry_name;

	private String inquiry_mail;

	private String qtype;

	private String body;

	private String master_id;



	public String getInquiry_name() {
		return inquiry_name;
	}
	public void setInquiry_name(String inquiry_name) {
		this.inquiry_name = inquiry_name;
	}
	public String getInquiry_mail() {
		return inquiry_mail;
	}
	public void setInquiry_mail(String inquiry_mail) {
		this.inquiry_mail = inquiry_mail;
	}
	public String getQtype() {
		return qtype;
	}
	public void setQtype(String qtype) {
		this.qtype = qtype;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getMaster_id() {
		return master_id;
	}
	public void setMaster_id(String master_id) {
		this.master_id = master_id;
	}



}
