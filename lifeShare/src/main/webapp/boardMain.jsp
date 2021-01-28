<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시글 작성하기</title>
</head>
<body>
<form action="/saveImage" enctype="multipart/form-data" method="post">
    <input type="file" name="imgFile" />
    <input type="submit" value="이미지저장"/>
</form>

</body>
</html>