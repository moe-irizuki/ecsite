<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<style type="text/css">

footer{
	position:fixed;
	bottom:0;
}

</style>

<title>ItemDeleteComplete画面</title>
</head>

<body>

	<jsp:include page="includeHeader.jsp" />

	<div id="main">
		<div id="contents">
			<br>
			<div id="top">
				<p>ITEM DELETE COMPLETE PAGE</p>
			</div>
			<div>

			<span>商品を<s:property value="session.itemDeleteListSize"/>件削除しました。</span>

			</div>
			<div>
				<p>管理者ページに戻る場合は<a href='<s:url action="GoAdministrationPageAction" />'>こちら</a><p>
				<p>ログアウトする場合は<a href='<s:url action="LogoutAction" />'>こちら</a><p>
			</div>
		</div>
	</div>

	<jsp:include page="includeFooter.jsp" />

	</body>
</html>