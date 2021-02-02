<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<body style="background-color: #e9ecef">
	<jsp:include page="header.jsp" />
	</br>
	</br>
	<!-- <form action="upload" enctype="multipart/form-data" method="post">
 	
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
	
	
	이미지 업로드:<input type="file" name="imgFile"><br>
	<input type="hidden" name="state" value="0">미완료<br>
	<input type="submit" value="Submit">
</form> -->
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
	<div class="container">
		<!-- Contact Section Heading-->
		<h2
			class="page-section-heading text-center text-uppercase text-secondary mb-0">게시글
			등록</h2>

		<!-- Contact Section Form-->
		<div class="row">
			<div class="col-lg-8 mx-auto">
				<!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19.-->
				<form action="uploads" enctype="multipart/form-data" method="post">
					<div class="control-group">
						<div
							class="form-group floating-label-form-group controls mb-0 pb-2">
							<label>제목</label> <input class="form-control" id="title"
								name="title" type="text" placeholder="ex)청소기 나눔합니다~"
								required="required">

						</div>
					</div>
					<div class="control-group">
						<div
							class="form-group floating-label-form-group controls mb-0 pb-2">
							<label>거래 타입</label> <select name="btype" class="form-control"
								id="btype" required="required">
								<option value="교환">교환
								<option value="나눔">나눔
							</select>
						</div>
					</div>
					<div class="control-group">
						<div
							class="form-group floating-label-form-group controls mb-0 pb-2">
							<label>물품 항목</label> <select name="category" class="form-control"
								id="category" required="required">
								<option value="모두" selected>--물품 항목--
								<option value="생활용품">생활용품
								<option value="패션잡화">패션잡화
								<option value="뷰티용품">뷰티용품
								<option value="디지털">디지털
								<option value="가구">가구
								<option value="도서">도서
								<option value="기타">기타
							</select>

						</div>
					</div>
					<div class="control-group">
						<div
							class="form-group floating-label-form-group controls mb-0 pb-2">
							<label>지역 선택(구단위)</label> <select name="loc" class="form-control"
								id="loc" required="required">
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
							</select>

						</div>
					</div>
					<div class="control-group">
						<div
							class="form-group floating-label-form-group controls mb-0 pb-2">
							<label>지역 입력(세부지역)</label> <input class="form-control" id="loc2"
								name="loc2" type="text" placeholder="ex)월곡" required="required">

						</div>
					</div>

					<div class="control-group">
						<div
							class="form-group floating-label-form-group controls mb-0 pb-2">
							<label>내용</label>
							<textarea class="form-control" id="content" name="content"
								rows="5" placeholder="Content" required="required"></textarea>

						</div>
					</div>
					이미지 업로드:<input type="file" name="imgFile"><br> <br>
					<div id="success"></div>
					<div class="form-group">
						<button class="btn btn-primary btn-xl" id="sendMessageButton"
							type="submit">등록하기</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>