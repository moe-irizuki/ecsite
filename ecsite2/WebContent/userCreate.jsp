<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>UserCreate画面</title>
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
				<p>USER CREATE</p>
			</div>
			<div>
				<s:if test="errorMessage != ''">
					<s:property value="errorMessage" escape="false" />
				</s:if>

				<table>
				<s:form action="UserCreateConfirmAction">
				<tr>
					<td><label>LOGIN ID:</label></td>
					<td><input type="text" name="loginUserId" value="" /></td>
				</tr>
				<tr>
					<td><label>LOGIN PASS:</label></td>
					<td><input type="password" name="loginPassword" value="" /></td>
				</tr>
				<tr>
					<td><label>USER NAME:</label></td>
					<td><input type="text" name="userName" value="" /></td>
				</tr>
				<tr>
					<td><label>GENDER:</label></td>
					<td>
						<input type="radio" name="userGender" value="男">Gentle man
						<input type="radio" name="userGender" value="女">Lady
					</td>
				</tr>
				<tr>
					<td><label>ADDRESS:</label></td>
					<td><input type="text" name="userAddress" value="" /></td>
				</tr>
				<tr>
					<td><label>TEL:</label></td>
					<td><input type="text" name="userTell" value="" /></td>
				</tr>
				<tr>
					<td><label>MAIL ADDRESS:</label></td>
					<td><input type="text" name="userMail" value="" /></td>
				</tr>
				<tr>
					<td><s:submit class="button" value="登録" /></td>
				</tr>
				</s:form>
				</table>

				<div>
					<span>前画面に戻る場合は</span><a href='<s:url action="HomeAction" />'>こちら</a>
				</div>
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