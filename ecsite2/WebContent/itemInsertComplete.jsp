<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>ItemInsertComplete画面</title>
</head>

<body>

	<jsp:include page="includeHeader.jsp" />

	<div id="main">
		<div id="contents">
			<br>
			<div id="top">
				<p>ITEM INSERT COMPLETE</p>
			</div>
			<div>

			<p>追加する商品の情報を入力してください。</p>

			<table>
			<s:form>
				<p>商品名:</p>
				<s:property value="session.itemName" /><br>
				<p>値段:</p>
				<s:property value="session.itemPrice" /><span>円</span><br>
				<p>在庫:</p>
				<s:property value="session.itemStock" /><span>個</span><br>
				<p>画像パス:</p>
				<s:property value="session.image" /><br><br>

			</s:form>
			</table>

			</div>
			<div>
				<input type="button" class="button" value="さらに追加する" onclick="submitAction('GoItemInsertAction')" />

				<p>管理者ページに戻る場合は<a href='<s:url action="GoAdministrationPageAction" />'>こちら</a></p>
			</div>
		</div>
	</div>

	<div id ="footer">
		<div id="pr">
		</div>
	</div>
	</body>
</html>