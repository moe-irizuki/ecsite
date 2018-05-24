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

	<jsp:include page="includeHeader.jsp" />

	<div id="main">
		<div id="contents">
			<br>
			<div id="top">
				<p>ITEM INVENTORY COMPLETE PAGE</p>
			</div>

			<div>
			<s:form>

			<p>以下の商品在庫を変更しました。</p>

			<s:iterator value="buyItemDTOList">
				<img src="<s:property value='image' />">
				<p><s:property value="=itemName" /><p>
				<p>値段：<s:property value="itemPrice" />円</p>
				<p>在庫：<s:property value="total_count" />個</p>
			</s:iterator>
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