<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 올리기</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<h1>게시글 올리기</h1>
<form action="uploads" enctype="multipart/form-data" method="post"><!-- 제거해보기 enctype="multipart/form-data" -->
 	로그인 정보:<input type="text" name="uid"> <%-- value=<%=User.id%> --%><br>
 	제목:<input type="text" name="title"><br> 
 	거래 타입:
 	<select name="btype">
 		<option value="둘다" selected>--거래 타입--
 		<option value="교환">교환
 		<option value="나눔">나눔
 	</select><br>
 	물품 항목:
 	<select name="category">
 		<option value="모두" selected>--물품 항목--
 		<option value="화장품/미용">화장품/미용
 		<option value="식품">식품
 		<option value="생활용품">생활용품
 		<option value="패션잡화">패션잡화
 		<option value="디지털/가전">디지털/가전
 		<option value="가구인테리어">가구인테리어
 		<option value="반려동물">반려동물
 		<option value="서비스">서비스
 		<option value="육아용품">육아용품
 		<option value="도서">도서
 		<option value="기타">기타
 	</select>
 	<br>
	지역 선택(구단위):
	<select name="loc">
		<option value="서울시" selected>--서울시--
		<option value="강서구">강서구
		<option value="양천구">양천구
		<option value="구로구">구로구
		<option value="금천구">금천구
		<option value="영등포구">영등포구
		<option value="동작구">동작구
		<option value="관약구">관악구
		<option value="마포구">마포구
		<option value="서대문구">서대문구
		<option value="은평구">은평구
		<option value="종로구">종로구
		<option value="중구">중구
		<option value="용산구">용산구
		<option value="서초구">서초구
		<option value="강남구">강남구
		<option value="송파구">송파구
		<option value="강동구">강동구
		<option value="광진구">광진구
		<option value="성동구">성동구
		<option value="동대문구">동대문구
		<option value="성북구">성북구
		<option value="강북구">강북구
		<option value="도봉구">도봉구
		<option value="노원구">노원구
		<option value="중랑구">중랑구
	</select><br>
	지역(사용자 지정):<input type="text" name="loc2"><br>
	설명 :<input type="text" name="content"><br>
	이미지 업로드:<input type="file" name="image"><br>
	<input type="hidden" name="state" value="0"><!-- 미완료 --><br>
	<input type="submit" value="등록하기">
</form>


</body>
</html>