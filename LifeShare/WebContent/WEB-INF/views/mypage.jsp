<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>
</head>
<style>
.textPost {
	overflow: hidden;
	text-overflow: ellipsis;
	display: -webkit-box;
	-webkit-line-clamp: 3; /* 라인수 */
	-webkit-box-orient: vertical;
	word-wrap: break-word;
	line-height: 1.2em;
	background-color: #dde2e6;
	height: 300px;
	width:300px;
}

#btype1 {
	border: 1px outset #5882FA;
	color: #5882FA;
}

#btype2 {
	border: 1px outset #D358F7;
	color: #D358F7;
}

.thumbnail {
	width: 300px;
	height: 250px;
	object-fit: cover;
}
</style>
<body style="background-color: #ffffff">
	<jsp:include page="header.jsp" />

	</br>
	</br>
	</br>
	<div class="container">
		<!-- br 추가 -->
		<br>
		<div>
			<h1>My Page</h1>
		</div>
		<hr>
		<h2>회원정보</h2>
		<c:set var="my" value="${users}" />
		아이디: ${my.id} </br> 이름: ${my.name} </br> Level: ${my.level} </br>
		<p style="float: right;">
			<a class="btn btn-secondary" href="modify=${my.id}" role="button">수정하기
			</a>
		</p>
		<!-- br 추가 -->
		</br> </br><br>
	</div>
	<!-- /container -->


	<div class="container">

		<!-- Example row of columns -->
		<h1>My Post</h1>
		<hr>
		<div class="row">
			<c:forEach var="board" items="${boards}">
				<div class="col-md-4">
					<!-- 제목 -->
					<h4>${board.title}</h4>
					<!-- 줄 간격 추가 -->
					<p style="line-height : 1.8;"></p>
					<c:choose>
						<c:when test="${board.btype eq '나눔'}">
							<span class="badge badge-pill badge-light" id="btype1">${board.btype}</span>
						</c:when>
						<c:otherwise>
							<span class="badge badge-pill badge-light" id="btype2">${board.btype}</span>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${board.state eq '완료'}">
							<span class="badge badge-pill badge-dark">${board.state}</span>
						</c:when>
						<c:when test="${board.state eq '미완료'}">
							<span class="badge badge-pill badge-success">${board.state}</span>
						</c:when>
						<c:otherwise>
							<span class="badge badge-pill badge-warning">${board.state}</span>
						</c:otherwise>
					</c:choose>
					<!-- 줄 간격 추가 -->
					<p style="line-height : 0.5;"></p>
					<span style="float: right">likes ${board.likes }</span>
					<!-- 내용 -->
					
					<%-- <p class="textPost"></p> --%>
					<div class="textPost">
					<img class="textPost thumbnail" alt="이미지가 존재하지 않습니다."
						src="/LifeShare/board/show/img/${board.bid}">${board.content} </div>
					
					<p>
						<a class="btn btn-secondary"
							href="/LifeShare/board/bid/${board.bid}" role="button">View
							details »</a>
					</p>
					<!-- br 추가 -->
					<br>
				</div>
			</c:forEach>
		</div>
		<!-- br 추가 -->
		<br><br>
	</div>
	<!-- /container -->

</body>
</html>