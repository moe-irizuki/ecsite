<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>商品一覧画面</title>
</head>
<body>

	<jsp:include page="includeHeader.jsp" />

	<div id="main">
		<div id="left">
			<div id="contents">
				<br>
				<div id="top">
					<p>PRODUCT LIST</p>
				</div>
				<s:iterator value="session.buyItemDTOList">
				<div class="productList">
					<a href="<s:url action="ProductDetailsAction" />
						<s:param name="product_id" value="%{product_id}"/>
					 	<s:param name="itemName" value="%{itemName}"/>
	 					<s:param name="image" value="%{image}"/>
	 					<s:param name="itemPrice" value="%{itemPrice}"/>">

					<span>
						<s:property value="product_id" />
						<s:property value="itemName" />
					</span><br>
					<span>
						<img src='<s:property value="image" />'>
					</span><br>
					<span>
						値段：<s:property value="itemPrice" />円
					</span>
					</a>
				</div>
				</s:iterator>
			</div>
		</div>
		<div id="right">
			<div id="contents">
				<br><br>
				<div>
				<s:form action="ItemSearchAction">
					<tr>
						<td>
							<s:textfield name="searchWord" value="" />
						</td>
						<td>
							<s:submit value="検索" />
						</td>
					</tr>
				</s:form>
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="includeFooter.jsp" />

</body>
</html>