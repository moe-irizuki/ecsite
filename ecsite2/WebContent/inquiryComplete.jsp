<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>InquiryComplete画面</title>
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
				<p>INQUIRY COMPLETE PAGE</p>
			</div>

			<p>お問い合わせを受け付けました。</p>
			<br>
			<p>内容確認した後、ご返信いたします。</p>
			<br>

		<div id="text-link">
				<p>HOMEへ戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a></p>
				<br>
				<br>
		</div>
		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>