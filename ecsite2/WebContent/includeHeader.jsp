<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<style>

header{
	margin:0;
	padding:0;
	width:100%;
	height:80px;
	background-color:#3B2503;
	font-family:Impact, 'Yu Gothic', Verdana, Helvetica, sans-serif;
}

#header ul{
	list-style:none;
	margin-top:0px;
	display: flex;
	justify-content: center;
}
#header li{
	float:left;
	padding-right:60px;
	font-size:15px;
}
#header li a{
	text-decoration: none;
}
li a:link{
	color:#c9baa6;
}
li a:visited{
	color:#c9baa6;
}
li a:hover{
	font-size:17px;
}
.logo{
	text-align:center;
	padding-top:5px;
	margin-bottom:0px;
}

</style>

<header>

<div id="header-contents">
	<div class="logo">
		<a href="<s:url action='GoHomeAction' />"><img src="./images/top.jpg" width=50px height=50px/></a>
	</div>

	<div id="header">
		<ul>
			<li><a href='<s:url action="GoHomeAction" />'>HOME</a></li>
			<li><a href='<s:url action="ProductListPageAction" />'>PRODUCT LIST</a></li>
			<li><a href='<s:url action="InquiryAction" />'>INQUIRY</a></li>
			<s:if test="#session.loginFlg">
				<li><a href='<s:url action="CartAction" />'>CART</a></li>
				<li><a href='<s:url action="MyPageAction" />'>MY PAGE</a></li>
				<li><a href='<s:url action="LogoutAction" />'>LOGOUT</a></li>
			</s:if>
			<s:else>
				<li><a href='<s:url action="GoLoginAction" />'>LOGIN</a></li>
			</s:else>
		</ul>

	</div>
</div>
</header>