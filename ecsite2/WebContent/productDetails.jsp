<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>productDetails画面</title>
</head>

<body>

	<jsp:include page="includeHeader.jsp" />

	<div id="main">
		<div id="contents">
			<div id="top">
				<p>PRODUCT DETAILS</p>
			</div>
			<div>
				<s:form action="CartInsertAction">
					<img src="<s:property value='image' />">
					<h3><b><s:property value="itemName" /></b></h3>
					<p><s:property value="itemPrice" />円</p>
					<p>在庫数：<s:property value="item_stock" />個</p>
					<s:if test="item_stock>0">
						<select name="productCount">
							<option value="1" selected="selected">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select>

						<s:hidden name="productId" value="%{product_id}" />

						<s:submit class="button" value="カートに入れる" />
					</s:if>
					<s:elseif test="item_stock == 0">
						<p>在庫がありません</p>
					</s:elseif>
					<s:else>
						<p>カートにこれ以上入れられません</p>
					</s:else>
				</s:form>
			</div>
		</div>
	</div>

	<jsp:include page="includeFooter.jsp" />

	</body>
</html>