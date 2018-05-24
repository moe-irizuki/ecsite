<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>InquiryConfirm画面</title>
</head>

<body>

	<jsp:include page="includeHeader.jsp" />

	<div id="main">
		<div id="contents">
			<br>
			<div id="top">
				<p>INQUIRY CONFIRM PAGE</p>
			</div>
			<p>お問い合わせ内容は以下でよろしいでしょうか？</p>
			<table>
			<s:form action="InquiryCompleteAction">
				<tr>
					<td><span>NAME</span></td>
					<td><s:property value="inquiry_name" /></td>
				</tr>

				<tr>
					<td><span>MAIL ADDRESS</span></td>
					<td><s:property value="inquiry_mail" /></td>
				</tr>

				<tr>
					<td><span>INQUIRY TYPE</span></td>
					<s:if test='qtype=="product"'>
					<td>商品について</td>
					</s:if>

					<s:if test='qtype=="order"'>
					<td>ご注文について</td>
					</s:if>

					<s:if test='qtype=="delivery"'>
					<td>配送について</td>
					</s:if>

					<s:if test='qtype=="another"'>
					<td>その他のお問い合わせ</td>
					</s:if>
				</tr>

				<tr>
					<td><span>YOUR INQUIRY</span></td>
					<td><s:property value="body" /></td>
				</tr>

				<tr>
					<td><s:submit class="button" value="送信" /></td>
				</tr>
			</s:form>
			</table>

		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>