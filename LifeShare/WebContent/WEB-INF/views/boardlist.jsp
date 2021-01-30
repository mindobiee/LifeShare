<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LifeShare 게시물</title>
</head>
<body>
<h1>LifeShare 게시물</h1>
<c:forEach var="boards" items="${boards}">
제목:${boards.title}<br>
게시물 번호:${boards.bid}<br>
작성자:${boards.uid}<br>
이미지:<img src=${img}><br>
작성일자:${boards.time_of_upload}<br>

거래타입:${boards.btype }<br>
물품항목:${boards.category}<br>
지역:${boards.loc }<br>
지역2:${boards.loc2 }<br>
소개합니다!!${boards.content }<br>

좋아요수:${boards.likes }<br>
조회수:${boards.views }<br><br>

</c:forEach>

	
</body>
</html>