<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Main Page</h1>

<button onclick="location.href='mypage=${id}' ">마이페이지 </button> <!--로그인 세션이 있을때만  -->
<button onclick="location.href= 'login' ">로그인 </button>
<button onclick="location.href= 'join' ">회원가입 </button>
</body>
</html>