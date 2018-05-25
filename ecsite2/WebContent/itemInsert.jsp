<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>BuyItem画面</title>
</head>

<body>

	<jsp:include page="includeHeader.jsp" />

	<div id="main">
		<div id="contents">
			<br>
			<div id="top">
				<p>ITEM INSERT</p>
			</div>
			<div>

			<p>追加する商品の情報を入力してください。</p>

			<table>
			<s:form method="post" action="ItemInsertAction">
				<p>商品名</p>
				<input type="text" name="ItemName" /><br>
				<p>値段</p>
				<input type="text" name="ItemPrice" /><br>
				<p>在庫</p>
				<input type="text" name="ItemStock" /><br>
				<p>画像パス</p>
				<input type="text" name="Image" /><br>

				<s:submit class="button" value="商品を追加する" />
			</s:form>
			</table>

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