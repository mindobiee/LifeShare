<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<h1>My Page</h1>
	<tr>
		<th>아이디</th>
		<th>이름</th>
		<th>LEVEL</th>
	</tr>
	
	<c:set var="my" value="${users}" />	
	<tr>
		<td>${my.id}</td>
		<td>${my.name}</td>
		<td>${my.level}</td>
	</tr>	
</table>
</body>
</html>