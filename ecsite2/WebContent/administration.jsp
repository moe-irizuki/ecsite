<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>Administration画面</title>
<style type="text/css">

footer{
	position:fixed;
	bottom:0;
}

</style>

</head>

<body>

	<jsp:include page="includeHeader.jsp" />

	<div id="main">
		<div id="contents">
			<br>
			<div id="top">
				<p>ADMINISTRATION PAGE</p>
			</div>
			<div>
				<p><a href='<s:url action="GoItemInventoryControlAction" />'>在庫管理</a></p>
				<p><a href='<s:url action="GoItemInsertAction" />'>商品追加</a></p>
				<p><a href='<s:url action="GoItemDeleteAction" />'>商品削除</a></p>
				<p><a href='<s:url action="GoInquiryListAction" />'>問い合わせ一覧</a></p>
				<br>
				<br>

				<p><a href='<s:url action="LogoutAction" />'>LOGOUT</a></p>
			</div>

		</div>
	</div>

	<jsp:include page="includeFooter.jsp" />

</body>
</html>