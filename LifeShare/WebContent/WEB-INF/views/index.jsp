<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LifeShare</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

	<style>
	#btype1 {border:1px outset #5882FA; color:#5882FA;}
	#btype2 {border:1px outset #D358F7; color:#D358F7;}
	#mainimg{margin-top:5px; margin-bottom:5px; padding-bottom:2px;}
	</style>
</head>
<body>
	<jsp:include page="header.jsp"/>
    <main role="main">

      <!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron" style="margin-bottom:0px;height:400px;">
        <div class="container">
        	<br><br>
          <h1 class="display-3"><img src="resource/img/main1.png"></h1>
          <p>우리주변의 지역이름과 원하시는 물품을 검색해주세요!</p>
          <form action="searchBoard" method ="POST" class="form-inline my-2 my-lg-0">
          <input class="form-control mr-sm-2" type="text" placeholder="주소명/물품명을 입력해주세요." aria-label="Search" style=width:300px;>
          <button class="btn btn-outline-primary my-2 my-sm-0" type="submit">Search</button>
        </form>
        </div>
      </div>
      
<header class="masthead d-flex" style="background-color:#e8f7eb;height:400px;">
    <div class="container text-center my-auto">
      <h1 class="mb-1">지금 우리 주변의 이웃들과 나눔을 실천하세요!</h1>
      <h3 class="mb-5">
        <em>Let's sharing with the neighbors around us now!</em>
      </h3>
      <a class="btn btn-primary btn-xl js-scroll-trigger" href="board/form"> Share </a>
    </div>
    <div class="overlay"></div>
    </header>
    
<div style="background-color:#e9ecef">
      <div class="container">
      <nav class="nav nav-pills flex-column flex-sm-row">
      	  <a class="flex-sm-fill text-sm-center nav-link disabled" href="#">카테고리</a>
		  <a class="flex-sm-fill text-sm-center nav-link" href="board">전체</a>
		  <a class="flex-sm-fill text-sm-center nav-link" href="board/생활용품">생활용품</a>
		  <a class="flex-sm-fill text-sm-center nav-link" href="board/패션잡화">패션잡화</a>
		  <a class="flex-sm-fill text-sm-center nav-link" href="board/뷰티용품">뷰티용품</a>
		  <a class="flex-sm-fill text-sm-center nav-link" href="board/가구">가구</a>
		  <a class="flex-sm-fill text-sm-center nav-link" href="board/도서">도서</a>
		  <a class="flex-sm-fill text-sm-center nav-link" href="board/기타">기타</a>
		</nav>
		<br><br>
        <!-- Example row of columns -->
        <h4>인기 게시물</h4>
        <hr>
        <div class="row">
        <c:forEach var="list" begin="0" end="3" items="${list_likes}">
          <div class="col-md-3">
          <div style="width:250px;">
          <c:choose>
       	  <c:when test="${list.btype eq '나눔'}">
          <span class="badge badge-pill badge-light" id="btype1">${list.btype}</span>
          </c:when>
          <c:otherwise>
          <span class="badge badge-pill badge-light" id="btype2">${list.btype}</span>
          </c:otherwise>
          </c:choose>
          <c:choose>
       	  <c:when test="${list.state eq '완료'}">
          <span class="badge badge-pill badge-dark">${list.state}</span>
          </c:when>
          <c:when test="${list.state eq '미완료'}">
          <span class="badge badge-pill badge-success">${list.state}</span>
          </c:when>
          <c:otherwise>
          <span class="badge badge-pill badge-warning">${list.state}</span>
          </c:otherwise>
          </c:choose>
          <div style="float:right;"><span class="badge badge-pill badge-light">&#x1f497;${list.likes}</span></div>
          </div>
          <div id="mainimg">
           <a href="/LifeShare/board/bid/${list.bid}"><img src="http://via.placeholder.com/350x150" height="250" width="250"></a>
          </div>
            <h6>${list.title}</h6>
          </div>
           </c:forEach>
        </div><br>

      </div> <!-- /container -->
      
      <br>
      <div class="container" >
        <!-- Example row of columns -->
        <h4>최근 게시물</h4>
        <hr>
        <div class="row">
        <c:forEach var="list" begin="0" end="3" items="${list}">
          <div class="col-md-3">
          <div style="width:250px;">
          <c:choose>
       	  <c:when test="${list.btype eq '나눔'}">
          <span class="badge badge-pill badge-light" id="btype1">${list.btype}</span>
          </c:when>
          <c:otherwise>
          <span class="badge badge-pill badge-light" id="btype2">${list.btype}</span>
          </c:otherwise>
          </c:choose>
          <c:choose>
       	  <c:when test="${list.state eq '완료'}">
          <span class="badge badge-pill badge-dark">${list.state}</span>
          </c:when>
          <c:when test="${list.state eq '미완료'}">
          <span class="badge badge-pill badge-success">${list.state}</span>
          </c:when>
          <c:otherwise>
          <span class="badge badge-pill badge-warning">${list.state}</span>
          </c:otherwise>
          </c:choose>
          <div style="float:right;"><span class="badge badge-pill badge-light">&#x1f497; ${list.likes}</span></div>
          </div>
          <div id="mainimg">
           <a href="/LifeShare/board/bid/${list.bid}"><img src="http://via.placeholder.com/350x150" height="250" width="250"></a>
          </div>
            <h6>${list.title}</h6>
          </div>
           </c:forEach>
        </div>

        <hr>

      </div> <!-- /container -->
</div>
    </main>

    <footer class="container">
      <p>©LifeShare Company 2020-2021</p>
    </footer>

    
  
</body>
</html>