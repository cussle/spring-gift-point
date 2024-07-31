# spring-gift-point

## 🚀 1단계 - API 명세

### 개요
- 프론트엔드 협업을 위해 API 검토 및 응답/요청 형식 통일

### 기능 목록
- [X] 팀 내에서 일관된 기준에 따라 API 명세 결정

    <details>
      <summary>확정된 팀 내 API 명세</summary>
    [프론트엔드에서 필요로 하는 API에 대해 요청/응답 통일](https://quickest-asterisk-75d.notion.site/TIL-BE-6a5c862a0b09410d943531f74281b231?p=8e8a604db8254cdb8c99ad3e6fc4ac5e&pm=c#:~:text=%EB%82%B4%EC%9A%A9%20(%ED%95%84%EC%88%98)-,6%EC%A3%BC%EC%B0%A8%20%EA%B3%BC%EC%A0%9C%20Step1%20%EB%AF%B8%EC%85%98%20%EC%A7%84%ED%96%89,-%ED%94%84%EB%A1%A0%ED%8A%B8%EC%97%94%EB%93%9C%EC%97%90%EC%84%9C%20%ED%95%84%EC%9A%94%EB%A1%9C%20%ED%95%98%EB%8A%94)
    
    통일할 API:
    - 회원 API - 회원 가입, 로그인
    - 카테고리 API - 카테고리 목록 조회
    - 상품 API - 상품 목록 가져오기(페이지네이션), 상품 상세 조회
    - 주문 API - 주문하기
    - 위시리스트 API - 위시리스트에 추가하기, 위시리스트 상품 삭제, 위시리스트 상품 조회 (페이지네이션)

</details>

- [ ] API 수정하여 형식 통일
    - [X] 회원 API 통일
        - [X] 회원가입: URL, 메소드 통일
        - [X] 회원가입: 요청, 응답 통일
        - [X] 로그인: URL, 메소드 통일
        - [X] 로그인: 요청, 응답 통일

    - [X] 카테고리 API
        - [X] 카테고리 목록 조회: URL, 메소드 통일
        - [X] 카테고리 목록 조회: 요청, 응답 통일

    - [ ] 상품 API
        - [ ] 상품 목록 가져오기(페이지네이션): URL, 메소드 통일
        - [ ] 상품 목록 가져오기(페이지네이션): 요청, 응답 통일
        - [ ] 상품 상세 조회: URL, 메소드 통일
        - [ ] 상품 상세 조회: 요청, 응답 통일

    - [ ] 주문 API
        - [ ] 주문하기: URL, 메소드 통일
        - [ ] 주문하기: 요청, 응답 통일

    - [ ] 위시리스트 API
        - [ ] 위시리스트에 추가하기: URL, 메소드 통일
        - [ ] 위시리스트에 추가하기: 요청, 응답 통일
        - [ ] 위시리스트 상품 삭제: URL, 메소드 통일
        - [ ] 위시리스트 상품 삭제: 요청, 응답 통일
        - [ ] 위시리스트 상품 조회 (페이지네이션): URL, 메소드 통일
        - [ ] 위시리스트 상품 조회 (페이지네이션): 요청, 응답 통일


### 기술 스택
- Java 21
- Spring Boot 3.3.1
- Gradle 8.4