<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>ItemDelete画面</title>
</head>

<body>

	<jsp:include page="includeHeader.jsp" />

	<div id="main">
		<div id="contents">
			<br>
			<div id="top">
				<p>ITEM DELETE PAGE</p>
			</div>
			<div>

			<p>削除したい商品を選択してください。</p>

			<div>
			<s:form action="ItemDeleteAction">
			<s:iterator value="buyItemDTOList">

				<dl>
					<img src="<s:property value='image' />"><br>
					<s:property value="itemName" /><br>
					<span>値段:</span>
					<s:property value="itemPrice" /><span>円</span><br>
					<span>現在の在庫:</span>
					<s:property value="item_stock" />個</span><br>
					<input class="check-box" type="checkbox" name="deleteName" value="<s:property value='itemName' />">
				</dl>
			</s:iterator>

			<tr>
				<td><s:submit class="button" value="商品を削除する" /></td>
			</tr>

			</s:form>
			</div>

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