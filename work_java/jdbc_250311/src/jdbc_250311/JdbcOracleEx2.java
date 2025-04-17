package jdbc_250311;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; //interface

public class JdbcOracleEx2 {
	public static void main(String[] args) {
		Connection conn;
		Statement stmt=null;
		try {
//			오라클 드라이버로드(오라클 설치파일에서 가져옴)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			//--getconnection으로 연결한다
			System.out.println("DB 연결 완료");
			//sql문 처리용 statement 객체 생성
			stmt = conn.createStatement(); //stmt로 받는다
			//student3 테이블의 모든 데이터 검색//rs : 참조변수 객체
			ResultSet rs = stmt.executeQuery("select * from student3");
			printData(rs, "id", "name", "dept");
			//쿼리하나 들고왔다.
//			rs = stmt.executeQuery("SELECT id, name, dept FROM STUDENT3 where name='이기자'");
//			printData(rs, "id", "name", "dept");

		} catch (ClassNotFoundException e) {
			System.out.println("jdbc 드라이버 로드 에러");
		}catch (SQLException e) {
			System.out.println("DB 연결 오류"); //쿼리자체 오류나면
			
	}
	}
	//레코드의 각 열의 값 화면에 출력(컬럼의 값을 체크)
	private static void printData(ResultSet rs, String col1, String col2, String col3) throws SQLException{
		//레코드의 각 열의 값 화면에 출력
//		private static void printData(ResultSet rs) {
		//데이터 갯수가 있는 만큼 반복
		while (rs.next()) {
			if (!col1.equals("")) {
				System.out.print(rs.getString("id"));
			}
			if (!col2.equals("")) {
				System.out.print("\t|\t"+rs.getString("name"));
			}
			if (!col3.equals("")) {
					System.out.println
					("\t|\t"+rs.getString("dept"));
				}
			//get string 2개중아무거나 써도됌 
		
		}//테이블 완전히 커밋된 상태여야 함
	}
	}






