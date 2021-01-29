<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Modify</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</head>
<body>

<h1>My Page - Modify</h1>

	<form action="update" method="post">
	<c:set var="my" value="${users}" />	

	ID:<input type =text name="id" id="id" readOnly value="${my.id}"></br>
	Password:<input type =text name="password" id="password" value="${my.password}"></br>
	Phone:<input type =text name="phone" id="phone" value="${my.phone}"></br>		
	Name<input type =text name="name" id="name" value="${my.name}"></br>
	Level<input type =text name="level" id="level" readOnly value="${my.level}"></br>
	<input type = submit value ="수정하기">
	
	</form>
	
	
</body>
</html>