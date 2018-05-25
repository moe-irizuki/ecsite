<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>UserCreateComplete画面</title>
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
				<p>UserCreateComplete</p>
			</div>
			<div>
				<h3>ユーザーの登録が完了致しました。</h3>

				<div>
					<a href='<s:url action="HomeAction" />'>ログインへ</a>
				</div>
			</div>
			<br>
			<br>
		</div>
	</div>

	<jsp:include page="includeFooter.jsp" />

</body>

</html>