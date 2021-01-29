<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 올리기</title>
</head>
<body>
<h1>게시글 올리기</h1>
<form action="upload" enctype="multipart/form-data" method="post">
<%-- 	<input type="hidden" name="uid" value=<%=User.id%> >
 --%>	
 	거래타입:
 	<br>-교환:<input type="radio" name="btype" value="교환"> 나눔:<input type="radio" name="btype" value="나눔"><br>
	항목:<input type="text" name="category"><br>
	지역(구단위):<input type="" name="loc"><br>
	지역(사용자 지정):<input type="text" name="loc2"><br>
	설명 :<input type="text" name="content"><br>
	이미지 업로드:<input type="file" name="imgFile"><br>
	<input type="hidden" name="state" value="0"><!-- 미완료 --><br>
	<input type="submit" value="Submit">
</form>
<!--  private int bid; 
	private String uid;
	private String btype;
	private String category;
	private String loc;
	private String loc2;
	private String content;
	private int likes;
	private int views;
	private MultipartFile imgFile;
	private Date time_of_upload; -->

</body>
</html>