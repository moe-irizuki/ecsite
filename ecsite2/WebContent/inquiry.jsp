<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>Inquiry画面</title>
</head>

<body>

	<div id="header">
		<div id="pr">
			<p>LOGIN</p>
			<p>MY PAGE</p>
			<p>CART</p>
			<p>PRODUCT LIST</p>
			<p>INQUIRY</p>
		</div>
	</div>

	<div id="main">
		<div id="contents">
			<br>
			<div id="top">
				<p>INQUIRY PAGE</p>
			</div>
			<div class="error-message">
				<s:if test="errorMessage != null ">
				<p><s:property value="errorMessage" escape="false"/></p>
				</s:if>
			</div>

			<table>
			<s:form action="InquiryConfirmAction">
				<p>NAME</p>
				<input type="text" name="inquiry_name" value="" />

				<p>MAIL ADDRESS</p>
				<input type="text" name="inquiry_mail" value="" />

				<p>INQUIRY TYPE</p>
				<select name="qtype">
				<option value="product">商品について</option>
				<option value="order">注文について</option>
				<option value="delivery">配送について</option>
				<option value="another">その他のお問い合わせ</option>
				</select>

				<p>YOUR INQUIRY</p>
				<s:textarea cols="30" rows="5" name="body" value="" />
				<s:submit class="button" value="送信" />
			</s:form>
			</table>

		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>