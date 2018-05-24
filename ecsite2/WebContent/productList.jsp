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
				<s:form action="BuyItemAction">
					<table>
						<s:iterator value="buyItemDTOList">
							<tr>
								<td>
									<h3><s:property value="itemName" /></h3>
								</td>
							</tr>
							<tr>
								<td>
									<img src="<s:property value="image" />">
								</td>
							</tr>
							<tr>
								<td>
									<span>値段</span>
								</td>
								<td>
									<s:property value="itemPrice" /><span>円</span>
								</td>
							</tr>
							<tr>
								<td>
									<span>在庫</span>
								</td>
								<td>
								<s:if test="item_stock>0">
									<s:property value="item_stock" />
								</s:if>
								<s:else>
									<span>品切れ</span>
								</s:else>
								</td>
							</tr>
							<tr>
								<td>
									<span>購入個数</span>
								</td>
								<td>
								<s:if test="item_stock>0">
									<select name="count">
										<option value="0" selected="selected">--</option>
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
										<option value="5">5</option>
									</select>
								</s:if>
								<s:else>
									<select name="count">
										<option value="0" selected="selected">0</option>
									</select>
								</s:else>
								</td>
							</tr>
							<tr>
								<td>
									<br>
								</td>
							</tr>
						</s:iterator>
					<tr>
						<td>
							<span>支払い方法</span>
						</td>
						<td>
							<input type="radio" name="pay" value="1" checked="checked">現金払い
							<input type="radio" name="pay" value="2">クレジットカード
						</td>
					</tr>
						<tr>
							<td>
								<s:submit value="購入" />
							</td>
						</tr>
					</table>
				</s:form>

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

	<div id="footer">
	</div>
</body>
</html>