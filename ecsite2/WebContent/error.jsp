<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>Error Page</title><style type="text/css">

footer{
	position:fixed;
	bottom:0;
}

</style>

</head>
<body>

	<jsp:include page="includeHeader.jsp" />

	<div id="main">
		<div id="contents">
		<br>
			<h1>エラーが発生しました。</h1>
			<p>恐れ入りますが、<a href='<s:url action="HomeAction" />'>ログイン</a>からやり直してください。</p>
		</div>
	</div>

	<jsp:include page="includeFooter.jsp" />

</body>
</html>