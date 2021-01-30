<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Page</title>
</head>
<style>
#post{
	height:200px;
	width:200px;
	background-color:#539fff;
	float:left;
	margin:5px;
}
</style>
<body>

<div style="background-color:#539fff"><h1 style="color:white"> My Page</h1></div>
<h2>회원정보</h2>
	<c:set var="my" value="${users}" />	
		아이디: ${my.id} </br>
		이름:	 ${my.name} </br>
		Level: ${my.level} </br>
<button onclick="location.href='modify=${my.id}' ">수정 </button>
	
	
<h2>My Post</h2>
<div>
<div id= post></div><div id= post></div><div id= post></div><div id= post></div><div id= post></div>
</div>

</body>
</html>