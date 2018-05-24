<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<style>

header{
	width:100%;
	height:90px;
	}
</style>

<head>

<div id="header-contents">
	<div class="logo">
		<a href="<s:url action='GoHomeAction' />"><img src="./images/logo.jpg" /></a>
	</div>

	<p>
	<s:if test="#session.loginFlg">
		ようこそ！<span><s:property value="#session"
	</s:if>
</div>
</head>