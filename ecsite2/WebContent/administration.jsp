<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>管理画面</title>
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
				<p>ADMINISTRATION PAGE</p>
			</div>
			<div>
				<p><a href='<s:url action="" />'>在庫管理</a></p>
				<p><a href='<s:url action="GoItemInsertAction" />'>商品追加</a></p>
				<p><a href='<s:url action="GoItemDeleteAction" />'>商品削除</a></p>
				<p><a href='<s:url action="GoInquiryListAction" />'>問い合わせ一覧</a></p>
				<br>
				<br>

				<p><a href='<s:url action="LogoutAction" />'>LOGOUT</a></p>
			</div>

		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>