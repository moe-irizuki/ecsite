<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">

	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

	<script type="text/javascript">
		function submitAction(url) {
			$('form').attr('action', url);
			$('form').submit();
		}
	</script>


<title>ItemDeleteConfirm画面</title>
</head>

<body>

	<jsp:include page="includeHeader.jsp" />

	<div id="main">
		<div id="contents">
			<br>
			<div id="top">
				<p>ITEM DELETE CONFIRM PAGE</p>
			</div>
			<div>

			<p>下記の商品を削除してよろしいでしょうか？</p>

			<table>
			<s:form>

				<dl>
				<s:iterator value="itemDeleteList">
<%-- 					<img src="<s:property value='image' />"><br> --%>
					商品名：<s:property value="itemName" /><br>
<%-- 					<span>値段:<s:property value="itemPrice" />円</span><br> --%>
<%-- 					<span>現在の在庫:<s:property value="item_stock" />個</span><br> --%>
<%-- 					<input class="check-box" type="checkbox" name="deleteName" value="<s:property value='itemName' />"> --%>
				</s:iterator>
				</dl>

			<tr>
				<td><input type="button" class="button" value="戻る" onclick="submitAction('GoItemDeleteAction')" /></td>
				<td><input type="button" class="button" value="削除" onclick="submitAction('ItemDeleteConfirmAction')" /></td>
			</tr>

			</s:form>
			</table>

			</div>
			<div>
				<p>管理者ページに戻る場合は<a href='<s:url action="GoAdministrationPageAction" />'>こちら</a><p>
				<p>ログアウトする場合は<a href='<s:url action="LogoutAction" />'>こちら</a><p>
			</div>
		</div>
	</div>

	<div id ="footer">
		<div id="pr">
		</div>
	</div>
	</body>
</html>