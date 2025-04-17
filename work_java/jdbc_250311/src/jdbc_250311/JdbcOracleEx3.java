package jdbc_250311;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


//자바에서 자동 커밋을 해주었다.
//추가 수정 삭제
public class JdbcOracleEx3 {
	public static void main(String[] args) {
		Connection conn;
		Statement stmt=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			System.out.println("DB 연결 완료");
			stmt = conn.createStatement();
			
//			1. 여기에 인서트 할거다
//			stmt.executeUpdate("INSERT INTO STUDENT3 VALUES('0893012','아무개','컴퓨터공학')");
			
			//2.여기에서 업데이트 할거다 
			stmt.executeUpdate("update student3 set id = '0189011' where name='아무개'");
			
			//3.여기에서 삭제
//			stmt.executeUpdate("delete from  student3 where name='아무개'");
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이브 로드 에러");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
		
	}
}


