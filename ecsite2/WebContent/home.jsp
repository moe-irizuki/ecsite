<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<title>Home画面</title>

	<style type="text/css">

	body {
		margin:0;
		padding:0;
		line-height:1.6;
		letter-spacing:1px;
		font-family:Impact, 'Yu Gothic', Verdana, Helvetica, sans-serif;
		font-size:12px;
		color:#D2B48C;
		background-image: url(./images/coffee.jpg);
		background-position: center center;
		background-repeat: no-repeat;
		background-attachment: fixed;
		background-size: cover;
	}

	#main {
	   width: 100%;
	   height: auto;
	   text-align: center;
	}

	#text-center {
		display: inline-block;
		text-align: center;
	}

	#main h1{
		margin-top:70px;
		font-size:70px;
		color:#9d5902;
		text-shadow: 3px 4px 1px #c9baa6;
	}

	footer{
		position:fixed;
		bottom:0;
	}

	</style>

</head>

<body>

	<jsp:include page="includeHeader.jsp" />

	<div id="main">
			<h1>ONLINE SHOP</h1>
			<br>
			<h3>WELCOME TO MY SHOP!!</h3>
	</div>

<footer>
	<jsp:include page="includeFooter.jsp" />
</footer>
</body>
</html>