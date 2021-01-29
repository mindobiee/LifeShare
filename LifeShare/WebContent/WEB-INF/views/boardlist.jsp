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
제목:${boards.title}
작성자:${boards.bid}
이미지:<img src=${boards.img}>
작성일자:${boards.time_of_upload}

거래타입:${boards.btype }
물품항목:${boards.category}
지역:${boards.loc }
지역2:${boards.loc2 }
소개합니다!!${boards.content }

좋아요수:${boards.likes }
조회수:${boards.views }

</c:forEach>

	
</body>
</html>