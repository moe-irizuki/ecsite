<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script type="text/javascript">
	function submitAction(url) {
		$('form').attr('action', url);
		$('form').submit();
	}
</script>

<title>ItemInventoryConfirm画面</title>
</head>

<body>

	<jsp:include page="includeHeader.jsp" />

	<div id="main">
		<div id="contents">
			<br>
			<div id="top">
				<p>ITEM INVENTORY CONFIRM PAGE</p>
			</div>

			<div>
			<s:form>
			<s:iterator value="buyItemDTOList">
			<s:if test="count != 0">
				<img src="<s:property value='image' />">
				<p><s:property value="itemName" /><p>
				<p>値段：<s:property value="itemPrice" />円</p>
				<p>現在の在庫：<s:property value="item_stock" />個</p>
				<p>追加個数<s:property value="count" />個</p>
			</s:if>
			</s:iterator>
			<div>
				<input type="button" class="button" value="在庫数の変更" onclick="submitAction('ItemInventoryConfirmAction')" />
			</div>
			</s:form>
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