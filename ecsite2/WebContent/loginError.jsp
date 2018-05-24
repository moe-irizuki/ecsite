<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>Login画面</title>
</head>

<body>

	<jsp:include page="includeHeader.jsp" />

	<div id="main">
		<div id="contents">
			<br>
			<div id="top">
				<p>LOGIN</p>
			</div>
			<div>
				<p class="error-message">ログインに失敗しました。</p>
				<p>ID・PASSをご確認の上、再度ご入力ください。</p>
			</div>

				<s:form action="LoginAction">
					<tr>
						<td>LOGIN ID：</td>
						<td><input type="text" name="loginUserId" /></td>
					</tr>
					<tr>
						<td>LOGIN PASS：</td>
						<td><input type="password" name="loginPassword" /></td>
					</tr>
					<s:submit value="ログイン" />
				</s:form>
				<br/>
				<div id="text-link">
					<p>新規ユーザー登録は
						<a href='<s:url action="UserCreateAction" />'>こちら</a></p>
					<p>HOMEへ戻る場合は
						<a href='<s:url action="GoHomeAction" />'>こちら</a></p>
						<br>
						<br>
				</div>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>