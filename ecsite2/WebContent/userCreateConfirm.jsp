
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>UserCreateConfirm画面</title>
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
				<p>UserCreateConfirm</p>
			</div>

			<div>
				<h3>登録する内容は以下でよろしいですか。</h3>

			<table>
			<s:form action="UserCreateCompleteAction">
			<tr id="box">
				<td><label>ログインID:</label></td>
				<td><s:property value="loginUserId" escape="false"/></td>
			</tr>

			<tr>
				<td><label>ログインPASS:</label></td>
				<td><s:property value="loginPassword" escape="false"/></td>
			</tr>

			<tr>
				<td><label>名前:</label></td>
				<td><s:property value="userName" escape="false"/></td>
			</tr>

			<tr>
				<td><label>性別:</label></td>
				<td><s:property value="userSex" escape="false"/></td>
			</tr>

			<tr>
				<td><label>住所:</label></td>
				<td><s:property value="userAddress" escape="false"/></td>
			</tr>

			<tr>
				<td><label>TEL番号:</label></td>
				<td><s:property value="userTell" escape="false"/></td>
			</tr>

			<tr>
				<td><label>メールアドレス:</label></td>
				<td><s:property value="userMail" escape="false"/></td>
			</tr>

			<tr>
				<td><br></td>
			</tr>

			<tr>
				<td><input type="button" class="button" value="戻る" onclick="submitAction('UserCreateAction')" /></td>
				<td><input type="button" class="button" value="完了" onclick="submitAction('UserCreateCompleteAction')" /></td>

			</tr>
			</s:form>

			</table>
			</div>
				<br>
				<br>
		</div>
	</div>

	<div id="footer">
	 	<div id="pr">
		</div>
	</div>
</body>
</html>