<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="upload" enctype="multipart/form-data" method="post">
<%-- 	<input type="hidden" name="uid" value=<%=User.id%> >
 --%>	
 	거래타입(교환/나눔):<input type="radio" name="btype" value="교환"><input type="radio" name="btype" value="나눔">
	항목:<input type="text" name="category">
	지역(구단위):<input type="" name="loc">
	지역(사용자 지정):<input type="text" name="loc2">
	설명 :<input type="text" name="content">
	이미지 업로드:<input type="file" name="imgFile">
	<input type="hidden" name="state" value="0"><!-- 미완료 -->
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