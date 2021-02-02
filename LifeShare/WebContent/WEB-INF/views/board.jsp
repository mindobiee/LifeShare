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
#article-profile {
    width: 677px;
    margin: 0 auto;
    
}
#article-profile-left {
   display: inline-block;
    margin-left: 8px;
}
#article-profile .space-between {
    display: flex;
    align-items: center;
    justify-content: space-between;
}
#article-profile-image {
    display: inline-block;
}
#article-profile-right {
    position: absolute;
    right: 0;
    padding-right: 36px;
}
#article-description {
    padding: 32px 0;
    width: 677px;
    margin: 0 auto;
    border-bottom: 1px solid #e9ecef;
}
#content {
    margin-top: 100px;
    padding-bottom: 0;
}
</style>
</head>
<body style ="background-color:#e9ecef">
<jsp:include page="header.jsp"/>
</br></br></br>
<c:set var="my" value="${users}" />
<div id="content">
      <section id="article-profile">
          <div class="space-between">
            <div>
              <div id="article-profile-image">
                <img alt="young" src="https://d1unjqcospf8gs.cloudfront.net/assets/users/default_profile_80-7e50c459a71e0e88c474406a45bbbdce8a3bf2ed4f2efcae59a064e39ea9ff30.png">
              </div>
              <div id="article-profile-left">
                <div id="uid">${board.uid }</div>
                <div id="loc">${board.loc }</div>
              </div>
            </div>
            
          </div>
    </section>
<section id="article-description">
        <h1 property="schema:name" id="article-title" style="margin-top:0px;">${board.title }</h1>
        <p id="article-category">
          ${board.category}
          <time>
            ${board.time_of_upload}
          </time>
          
        </p>
        <p property="schema:priceValidUntil" datatype="xsd:date" content="2023-02-01"></p>
        <p rel="schema:url" resource="https://www.daangn.com/186771850"></p>
        <p property="schema:priceCurrency" content="KRW"></p>
        <p id="article-price" property="schema:price" content="60000.0" style="font-size:18px; font-weight:bold;">
            ${board.btype}
        </p>
        <div property="schema:description" id="article-detail" style="background-color:#dee3e8;">
            <p>${board.content}</p>
        </div>
        <p id="article-counts">
         <p style="float:right;"><a href="/LifeShare/likes/${loginOK.id}/${bid}">Likes</a>${board.likes}</p>
        
    </section>
</div>
</body>
</html>