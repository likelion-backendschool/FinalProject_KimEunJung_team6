## Title: [1Week] 김은정

### 미션 요구사항 분석 & 체크리스트

---

필수 과제 기능 구현 **여부**

- [x]  회원가입
- [x]  회원정보수정
- [x]  로그인
- [x]  로그아웃
- [x]  아이디찾기

- [x]  글 작성
- [x]  글 수정
- [x]  글 리스트
- [x]  글 삭제

---

**기능 세부 내용 구현 여부**

▶️ 회원가입
- [x]  회원가입 성공하기 (테이블에 값 저장되기)
- [ ]  축하 메일 발송
- [x]  authLevel = 7 → 관리자
- [x]  비밀번호 확인

▶️ 회원정보수정
- [x]  nickname 등록 → 작가 회원 (상품 등록 가능 권한)
- [x]  이메일, nickname 수정
- [x]  비밀번호 변경

▶️ 아이디 찾기
- [x]  아이디 찾기 → email 입력 → username 보여줌

▶️ 글 작성
- [x]  게시글 작성
- [x]  마크다운 원문과 렌더링 결과(HTML)까지 같이 저장 → 리팩토링 필요
- [x]  해시태그 (keyword) → 추가 리팩토링 필요
- [x]  토스트에디터 적용 (작동 안됨 ㅠ)

▶️ 글 수정
- [x]  글 작성자만 글 수정 가능

▶️ 글 리스트
- [x]  글 리스트 출력
- [ ]  해시태그를 클릭하면 내가 작성한 글 중 해당 해시태그와 관련된 글들을 볼 수 있음
- [ ]  홈 화면 → 최신 글 100개 리스트

▶️ 글 삭제
- [x]  글 작성자만 글 삭제 가능
- [x]  삭제 후 글 리스트로 리다이렉트
- [ ]  삭제버튼 눌렀을 때 confirm 창으로 삭제여부를 한 번 더 물어보기


1주차 미션 요약

---

**[접근 방법]**
- 스프링 시큐리티를 다루는 부분을 중점적으로 개발하기 시작하였다.
- 수업시간에 다뤘던 내용들을 바탕으로 구현했다.

**[특이사항]**
- 리팩토링 해야하는 부분들
- 시간 부족으로 인해 모든 기능을 완벽하게 구현하지 못하였다.
- 특히 해시태그 기능과 토스트에디터 부분 마무리가 덜 되었다.
