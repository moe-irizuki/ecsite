<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>Cart画面</title>
</head>

<body>

	<jsp:include page="includeHeader.jsp" />

	<div id="main">
		<div id="left">
			<div id="contents">
				<div id="top">
					<p>CART</p>
				</div>
				<s:if test="errorMessage != null">
					<p>カートの中身は空です。<p>
				</s:if>
				<s:else>
					<p><s:property value="cartList.size()" />件の商品があります。</p>
				</s:else>

				<s:form action="CartAction">
					<s:hidden name="deleteFlg" value="true" />
						<s:iterator value="cartList" status="st">
							<div>
								<div>
									<p>商品名：<span><s:property value="productName" /></span></p>
								</div>
								<div>
									<p>価格：<span><s:property value="price" /></span>円</p>
								</div>
								<div>
									<p>個数：<span><s:property value="count" /></span>個</p>
								</div>
								<div>
									<span>TOTAL：<s:property value="totalPrice" />円</span>
								</div>
							</div>
						</s:iterator>
				</s:form>
			</div>
		</div>

		<div id="right">
			<div id="contents">
				<div>
					<p>合計金額：<s:property value="cartTotalPrice" />円</p>
					<s:form action="BuyItemConfirmAction">
						<s:submit value="決済" />
					</s:form>
<!-- 					<div> -->
<%-- 						<s:submit value="チェックした商品を削除" form="delete-form" /> --%>
<!-- 					</div> -->
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="includeFooter.jsp" />

	</body>
</html>