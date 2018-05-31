<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
 <title>BuyItemConfirm画面</title>

	<script type="text/javascript">
		function submitAction(url) {
			$('form').attr('action', url);
			$('form').submit();
		}
	</script>
</head>
<body>

	<jsp:include page="includeHeader.jsp" />

	<div id="main">
		<div id="contents">
		<br>
			<div id="top">
				<p>BuyItemConfirm</p>
			</div>
			<div>
				<s:form action="BuyItemCompleteAction">

				<s:iterator value="cartList">
					<tr>
						<td>商品名</td>
						<td><s:property value="productName" /></td>
					</tr>
					<tr>
						<td>値段</td>
						<td><s:property value="price" /><span>円</span></td>
					</tr>

					<tr>
						<td>購入個数</td>
						<td><s:property value="productCount" /><span>個</span></td>
					</tr>
					<tr>
						<td>小計</td>
						<td><s:property value="totalPrice" /></td>
					</tr>
					<tr>
						<td>
							<br>
						</td>
					</tr>
				</s:iterator>
					<tr>
						<td>お届け先</td>
						<td><s:property value="session.userAddress"/></td>
					</tr>
					<tr>
						<td><h3>合計：</h3></td>
						<td>
							<h3><s:property value="finallyTotalPrice"/><span>円</span></h3>
						</td>
					</tr>
					<tr>
						<td>
							<br>
						</td>
					</tr>
					<tr>
						<td><input type="button" value="戻る" onclick="submitAction('HomeAction')" /></td>
						<td><s:submit value="決済" /></td>
					</tr>
				</s:form>
			</div>
			<br>
		</div>
	</div>

	<jsp:include page="includeFooter.jsp" />

</body>
</html>