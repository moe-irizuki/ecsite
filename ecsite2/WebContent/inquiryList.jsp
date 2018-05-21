<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>Inquiry List Page</title>
</head>

<body>

	<div id="header">
		<div id="pr">
			<p>LOGIN</p>
			<p>MY PAGE</p>
			<p>CART</p>
			<p>PRODUCT LIST</p>
			<p>INQUIRY</p>
		</div>
	</div>

	<div id="main">
		<div id="contents">
			<br>
			<div id="top">
				<p>INQUIRY LIST</p>
			</div>

			<!-- 問い合わせがない場合 -->
			<s:if test="#session.inquiryDTOList == null">
				<div>お問い合わせメッセージはありません。</div>
			</s:if>

			<!-- 問い合わせがある場合 -->
			<s:elseif test="session.inquiryDTOList != null">
				<table>
				<tbody>
				<tr>
					<th>NAME</th>
					<th>MAIL ADDRESS</th>
					<th>INQUIRY TYPE</th>
					<th>INQUIRY</th>
				</tr>

				<s:iterator value="#session.inquiryDTOList">
				<tr>
					<td><s:property value="inquiry_name" /></td>

					<td><s:property value="inquiry_mail" /></td>

					<s:if test='qtype == "product"'>
					<td>製品について</td>
					</s:if>

					<s:if test='qtype == "order"'>
					<td>注文について</td>
					</s:if>

					<s:if test='qtype == "delivery"'>
					<td>配達について</td>
					</s:if>

					<s:if test='qtype == "another"'>
					<td>その他のお問い合わせ</td>
					</s:if>

					<td><s:property value="body" /></td>
				</tr>
				</s:iterator>
				</tbody>
				</table>
				<br>

				<!-- 履歴の削除機能 -->

				<s:form action="InquiryAllDeleteAction">
					<input type="hidden" name="deleteFlg" value="1">
					<s:submit class="button" value="一覧の削除" method="delete" />
				</s:form>
			</s:elseif>

			<div>
				<p>前画面に戻る場合は<a href='<s:url action="GoAdministrationPageAction" />'>こちら</a></p>
				<br>
				<br>
			</div>

		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>