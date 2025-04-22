package main.java.dao;

// === DAO 패턴 적용 === //
// 1. DAO 패턴 정의
// : Data Access Object
// - DB와의 접근 로직을 하나의 클래스로 '캡슐화'하여 애플리케이션의 다른 부분과
//  , DB 처리 코드를 분리하는 설계 패턴

// 2. DAO 패턴 사용 목적
// 1) DB 처리만 전담하는 DAO 클래스 생성
// 2) DAO 클래스만 수정하면 DB 처리 수정이 가능
//  >> 구조 명확, 유지보수 용이

// 3. 구조 설계
// 1) db - DBConnection.java (DB 연결 전담)
// 2) entity - Member.java (데이터를 담는 객체)
// 3) dao - MemberDAO.java (DB 처리 로직 담당)
// 4) manager - MemberManager.java (실행 및 테스트)

// MemberDAO 클래스
// : Member 테이블에 대한 CRUD 작업을 처리
public class MemberDAO {
}
