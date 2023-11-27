# 회원
## 개발환경
1. IDE: IntelliJ IDEA Community
2. Spring Boot 3.2.0
3. JDK 17
4. MySQL
5. Spring Data JPA
6. Thymeleaf
## 주요기능
1. 회원가입
2. 로그인
3. 회원목록
4. 회원조회
5. 회원정보 수정
6. 회원삭제
7. 로그아웃
# 게시판
## 개발환경
1. IDE: IntelliJ IDEA Community
2. Spring Boot 3.2.0
3. JDK 17
4. MySQL
5. Spring Data JPA
6. Thymeleaf

## 게시판 주요기능
1. 글쓰기(/board/save)
2. 글목록(/board/)
3. 글조회(/board/{id})
4. 글수정(/board/update/{id})
    - 상세화면에서 수정 버튼 클릭
    - 서버에서 해당 게시글의 정보를 가지고 수정 화면 출력
    - 제목, 내용 수정 입력 받아서 서버로 요청
    - 수정 처리
5. 글삭제(/board/delete/{id})
6. 페이징처리(/board/paging)
    - /board/paging?page=2
7. 파일(이미지)첨부
    - 단일 파일 첨부
    - 다중 파일 첨부
    - 파일 첨부와 관련하여 추가될 부분들
        - save.html (+)
        - detail.html (+)
        - BoardDTO (+)
        - BoardService.save() (+)
        - BoardEntity (+)
        - BoardFileEntity (NEW)
        - BoardFileRepository (NEW)


## MySQL DataBase 계정 생성 및 권한 부여
```
create database board;
create user board@localhost identified by '1234';
grant all privileges on board.* to board@localhost;
board_table(부모) - board_file_table(자식)
```