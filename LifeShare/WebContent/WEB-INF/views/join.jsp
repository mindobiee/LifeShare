<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Join Page</h1>

<!-- JH 수정 -->
<form action="" method = "post">
<table border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td bgcolor="white">이름</td>
		<td><input type = "text" name="name"/></td>
	</tr>
	<tr>
		<td bgcolor="white">아이디</td>
		<td><input type = "text" name="id"/></td>
	</tr>
	<tr>
		<td bgcolor="white">비밀번호</td>
		<td><input type = "password" name="password" maxlength="20"/></td>
	</tr>
	<tr>
		<td bgcolor="white">휴대폰</td>
		<td><input type = "text" name="phone"/></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
		<input type="submit" value="가입하기" />
		</td>
	</tr>
</table>
</form>
<!-- JH 수정 -->

</body>
</html>