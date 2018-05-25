<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>UserUpdate画面</title>
</head>
<body>

	<jsp:include page="includeHeader.jsp" />

	<div id="main">
		<div id="contents">
			<br>
			<div id="top">
				<p>USER UPDATE</p>
			</div>
			<div>
				<p>変更情報を入力してください。</p>

				<div class="errorMessage">
				<s:if test="errorMessage != ''">
					<s:property value="errorMessage" escape="false" />
				</s:if>
				</div>

				<table>
				<s:form action="UserUpdateAction">
				<tr>
					<td><label>LOGIN ID:</label></td>
					<td><input type="text" name="loginUserId" value="<s:property value='session.loginUserId' />" /></td>
				</tr>
				<tr>
					<td><label>LOGIN PASS:</label></td>
					<td><input type="password" name="loginPassword" value="<s:property value='session.loginPassword' />" /></td>
				</tr>
				<tr>
					<td><label>USER NAME:</label></td>
					<td><input type="text" name="userName" value="<s:property value='session.userName' />" /></td>
				</tr>
				<tr>
					<td><label>GENDER:</label></td>
					<td>
						<input type="radio" name="userGender" value="Man">Man
						<input type="radio" name="userGender" value="Lady">Lady
					</td>
				</tr>
				<tr>
					<td><label>ADDRESS:</label></td>
					<td><input type="text" name="userAddress" value="<s:property value='session.userAddress' />" /></td>
				</tr>
				<tr>
					<td><label>TEL:</label></td>
					<td><input type="text" name="userTell" value="<s:property value='session.userTell' />" /></td>
				</tr>
				<tr>
					<td><label>MAIL ADDRESS:</label></td>
					<td><input type="text" name="userMail" value="<s:property value='session.userMail' />" /></td>
				</tr>
				<tr>
					<td><s:submit class="button" value="登録" /></td>
				</tr>

				</s:form>
				</table>
			</div>

			<div>
				<p>HOMEへ戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a></p>
			</div>
			<br>
			<br>
		</div>
	</div>

	<jsp:include page="includeFooter.jsp" />

</body>
</html>