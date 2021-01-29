<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Modify</title>
</head>
<body>
<h1>My Page - Modify</h1>

	
	<c:set var="my" value="${users}" />	

	ID:<input type =text name="id" id="id">${my.id}</br>
	Password:<input type =text name="password" id="password">${my.password}</br>
	Phone:<input type =text name="phone" id="phone">${my.phone}</br>		
	Name<input type =text name="name" id="name">${my.name}</br>
	Level<input type =text name="level" id="level">${my.level}</br>
	<button onclick="location.href='update' ">수정하기 </button></br>
</body>
</html>