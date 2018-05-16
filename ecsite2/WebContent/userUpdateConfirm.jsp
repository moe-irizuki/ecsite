<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>UserUpdateConfirm画面</title>
</head>
<body>

<!-- ヘッダー -->

	<div id="header">
		<div id="pr">
			<p>LOGIN</p>
			<p>MY PAGE</p>
			<p>CART</p>
			<p>PRODUCT LIST</p>
			<p>INQUIRY</p>
		</div>
	</div>

<!-- メイン -->

	<div id="main">
		<div id="contents">
			<br>
			<div id="top">
				<p>USER UPDATE CONFIRM</p>
			</div>
			<div>
				<p>登録する内容は以下でよろしいですか。</p>

				<table>
				<s:form action="UserUpdateConfirmAction">
					<tr>
						<td><label>LOGIN ID:</label></td>
						<td><s:property value="loginUserId" escape="false" /></td>
					</tr>
					<tr>
						<td><label>LOGIN PASS:</label></td>
						<td><s:property value="loginPassword" escape="false" /></td>
					</tr>
					<tr>
						<td><label>NAME:</label></td>
						<td><s:property value="userName" escape="false" /></td>
					</tr>
					<tr>
						<td><label>GENDER:</label></td>
						<td><s:property value="userGender" escape="false" /></td>
					</tr>
					<tr>
						<td><label>ADDRESS:</label></td>
						<td><s:property value="userAddress" escape="false" /></td>
					</tr>
					<tr>
						<td><label>TEL:</label></td>
						<td><s:property value="userTell" escape="false" /></td>
					</tr>
					<tr>
						<td><label>MAIL:</label></td>
						<td><s:property value="userMail" escape="false" /></td>
					</tr>
					<tr>
						<td><br></td>
					</tr>
					<tr>
						<td><input type="button" class="button" value="戻る" onclick="submitAction('GoUserUpdateAction')" /></td>
						<td><input type="button" class="button" value="完了" onclick="submitAction('UserUpdateConfirmAction')" /></td>
					</tr>

				</s:form>
				</table>

			</div>
	</div>
	</div>

<!-- フッター -->

	<div id="footer">
	</div>

</body>
</html>