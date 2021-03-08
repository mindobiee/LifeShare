# SpringDay

2020-2021 SAMSUNG MULTICAMPUS Spring Project (김성희,김민경,전준혁,고종윤)
- period : 2021.01.27 - 2021.02.03
- 그림을 클릭하시면 튜토리얼 동영상을 보실 수 있습니다.

[![video](https://user-images.githubusercontent.com/33727516/110286157-cb6e1080-8027-11eb-8294-18f383ddc48b.JPG)](https://youtu.be/K9oNjSf91nc)

## 환경설정
- Lan : Java 1.8, Spring Framework
- IDE : Eclipse
- VC : git, gitlab, sourcetree
- server : AWS EC2
- DB: MySQL

## DB 구조
1. USERS
    - ID(pk)
    - PASSWORD(not null)
    - PHONE
    - NAME
    - LEVEL
2. BOARD
    - BID(pk) - auto_increment
    - UID(fk references USERS(ID))
    - BTYPE
    - CATEGORY
    - LOC, LOC2
    - TITLE
    - CONTENT - TEXT
    - LIKES
    - VIEWS
    - STATE
    - IMG - BLOB
    - TIME_OF_UPLOAD - current_timestamp(not null)
3. LIKES
    - LID(pk)
    - BID(fk references BOARD(BID))
    - UID(fk references USERS(ID))
    - ISLIKE - boolean(한 아이디 당 한 개의 좋아요로 제한 중복방지)
4. MESSAGE
    - MID(PK)
    - SENDER(fk references USERS(ID))
    - RECEIVER(fk references USERS(ID))
    - MESSAGE
    - ISopen
    - SEND_DATE

## 개요
1. 회원 관리
    - 회원가입
    - 로그인
    - 회원정보 수정 
    - 마이페이지 
1. 게시글 관리
    - 게시글 등록하기
    - 좋아요 추가/삭제
    - 거래 상태 변경(미완료, 예약, 거래완료) 
    - 거래자와 쪽지 주고 받기
1. 검색 및 조회
    - 검색 기능(최신, 인기, 조회순)
    - 게시글 전체/상세 조회    


