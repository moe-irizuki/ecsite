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
				<s:form>

				<s:iterator value="buyItemDTOList">
				<s:if test="count != 0">
					<tr>
						<td>商品名</td>
						<td><s:property value="itemName" /></td>
					</tr>
					<tr>
						<td>値段</td>
						<td><s:property value="total_price" /><span>円</span></td>
					</tr>

					<tr>
						<td>購入個数</td>
						<td><s:property value="count" /><span>個</span></td>
					</tr>
					<tr>
						<td>支払い方法</td>
						<td><s:property value="pay" /></td>
					</tr>
					<tr>
						<td>
							<br>
						</td>
					</tr>
					</s:if>
				</s:iterator>
					<tr>
						<td>お届け先</td>
						<td><s:property value="session.userAddress"/></td>
					</tr>
					<s:if test="buyItemDTOList.size() >1">
					<tr>
						<td><h3>合計：</h3></td>
						<td>
							<h3><s:property value="session.totalPrice"/><span>円</span></h3>
						</td>
					</tr>
					</s:if>
					<tr>
						<td>
							<br>
						</td>
					</tr>
					<tr>
						<td><input type="button" value="戻る" onclick="submitAction('HomeAction')" /></td>
						<td><input type="button" value="完了" onclick="submitAction('BuyItemConfirmAction')" /></td>
					</tr>
				</s:form>
			</div>
			<br>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>