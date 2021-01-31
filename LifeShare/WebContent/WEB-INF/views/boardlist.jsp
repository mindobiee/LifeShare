<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.1.1">
    <title>게시글</title>
    <!-- CSS only -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
    <!-- JS, Popper.js, and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/blog/">

	    <!-- Bootstrap core CSS -->
	<link href="/docs/4.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
	
	    <!-- Favicons -->
	<link rel="apple-touch-icon" href="/docs/4.5/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
	<link rel="icon" href="/docs/4.5/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
	<link rel="icon" href="/docs/4.5/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
	<link rel="manifest" href="/docs/4.5/assets/img/favicons/manifest.json">
	<link rel="mask-icon" href="/docs/4.5/assets/img/favicons/safari-pinned-tab.svg" color="#563d7c">
	<link rel="icon" href="/docs/4.5/assets/img/favicons/favicon.ico">
	<meta name="msapplication-config" content="/docs/4.5/assets/img/favicons/browserconfig.xml">
	<meta name="theme-color" content="#563d7c">
    <!-- Custom styles for this template -->
    <link href="https://fonts.googleapis.com/css?family=Playfair+Display:700,900" rel="stylesheet">

<title>LifeShare 게시물</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<!-- 
<c:forEach var="boards" items="${boards}"> 
<h1>LifeShare 게시물</h1>
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
-->

<br><br><br>
<div class="row justify-content-md-center">
 <div class="col-11">
    <a class="size" href="<c:url value='/board'/>">
   최신순&nbsp;&nbsp;</a>
   <a class="size" href="<c:url value='/board/list/likes'/>">
   인기순&nbsp;&nbsp;</a>
   <a class="size" href="<c:url value='/board/list/views'/>">
   조회순&nbsp;&nbsp;</a>
   <br>
   <table class="table table-striped text-center">
      <thead>
         <tr>
            <th scope="col">카테고리</th>
            <th scope="col">지역</th>
            <th scope="col">타입</th>
            <th scope="col">제목</th>
            <th scope="col">작성자</th>
            <th scope="col">작성일</th>
         </tr>
      </thead>
      <tbody>
         <c:set var="i" value="${(pagination.curPage-1)*10}"/>
         <c:forEach var="boards" items="${boards}">
            <tr>
            <c:set var="i" value="${i+1}"/>
               <td>${boards.category}</td>
               <td>${boards.loc}</td>
               <td>${boards.btype}</td>
               <td>
                <a href="<c:url value='/board/${boards.bid}'/>">
                  ${boards.title}&nbsp;</a>
               <td>${boards.uid}</td>
               <td>${boards.time_of_upload}</td>
            </tr>
         </c:forEach>
      </tbody>
   </table>
   <hr>
   <div>
      <div class="float-right">
      <button type="button" class="btn btn-primary text-left" onClick="location.href='<c:url value='/board/form' />'">글쓰기</button>
      </div>
   </div>
   <br><br>
   <nav aria-label="Page navigation example">
      <ul class="pagination justify-content-center">
         <li class="page-item">
            <c:if test="${pagination.curRange ne 1}">
               <a class = "page-link" href="<c:url value='/board'>
                 <c:param name='curPage' value='1'/>
                 <c:param name='order' value='${order}'/>
                 </c:url>">처음</a>
            </c:if>
         </li>
         <li class="page-item">
            <c:if test="${pagination.curPage ne 1}">
               <a class = "page-link" href="<c:url value='/board'>
                 <c:param name='curPage' value='${pagination.prevPage}'/>
                 <c:param name='order' value='${order}'/>
               </c:url>">이전</a>
            </c:if>
         </li>
            <c:forEach var="pageNum" begin="${pagination.startPage}" end="${pagination.endPage}">
               <c:choose>
                  <c:when test="${pageNum eq  pagination.curPage}">
                     <li class="page-item">
                     <span style="font-weight: bold;">
                        <a class = "page-link" href="<c:url value='/board'>
                          <c:param name='curPage' value='${pageNum}'/>
                          <c:param name='order' value='${order}'/>
                        </c:url>">${pageNum}</a>
                     </span>
                     </li>
                  </c:when>
                  <c:otherwise>
                     <li class="page-item">
                     <a class = "page-link" href="<c:url value='/board'>
                     <c:param name='curPage' value='${pageNum}'/>
                     <c:param name='order' value='${order}'/>
                     </c:url>">${pageNum}</a>
                     </li>
                  </c:otherwise>
               </c:choose>
            </c:forEach>
            <li class="page-item">
               <c:if test="${pagination.curPage ne pagination.pageCnt && pagination.pageCnt > 0}">
                  <a class = "page-link" href="<c:url value='/board'>
                    <c:param name='curPage' value='${pagination.nextPage}'/>
                    <c:param name='order' value='${order}'/>
                  </c:url>">다음</a>   
               </c:if>
            </li>
            <li class="page-item">
            <c:if test="${pagination.curRange ne pagination.rangeCnt && pagination.rangeCnt > 0}">
               <a class = "page-link" href="<c:url value='/question/list'>
                 <c:param name='curPage' value='${pagination.pageCnt}'/>
                 <c:param name='order' value='${order}'/>
               </c:url>">끝</a>      
            </c:if>   
            </li>
         </ul>
   </nav>
   </div>
</div>   
<br>
<br>
	
</body>
</html>