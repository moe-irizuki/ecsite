<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>Home画面</title>
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
			<p>Home</p>
		</div>
		<div id="text-center">
			<s:form action="HomeAction">
				<s:submit value="商品購入" />
			</s:form>
			<br>
			<br>
			<s:if test="#session.id != null">
				<p>ログアウトする場合は
					<a href='<s:url action="LogoutAction" />'>こちら</a></p>
					<br>
					<br>
			</s:if>
		</div>
	</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>