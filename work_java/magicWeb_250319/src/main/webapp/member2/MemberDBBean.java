package magic.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDBBean {
	 private static MemberDBBean instance = new MemberDBBean();
	    
	    // 1) 싱글톤 패턴 구현
	    
	    public static MemberDBBean getInstance() {
	        return instance;
	    }
	    
	    //쿼리작업에 사용할 커넥션 객체를 리턴하는 메소드(dbcp 기법)
	    // 2) Connection 객체를 리턴하는 메소드
	    public Connection getConnection() throws Exception {
	    	return ((DataSource)(new InitialContext().lookup("java:comp/env/jdbc/oracle"))).getConnection();
	    }
	    
	    // 3) 회원 정보를 DB에 삽입하는 메소드
	    public int insertMember(MemberBean member) throws Exception {
	    	Connection conn=null;
	    	PreparedStatement pstmt=null;
	    	int re=-1; // 초기값 -1, insert 정상적으로 실행되면 1
	    	String sql ="insert into memberT values(?,?,?,?,?)";
	    	
	    	try {
	    		// dbcp 기법의 연결객체
				conn = getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, member.getMem_uid());
				pstmt.setString(2, member.getMem_pwd());
				pstmt.setString(3, member.getMem_name());
				pstmt.setString(4, member.getMem_email());
				pstmt.setString(5, member.getMem_address());
//				INSERT 문은 executeUpdate 메소드 호출
				re = pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {               
				try {
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
	    return re;
	    }
	    
	    // 4) ID 중복 확인 메소드
	    public int confirmID(String id) throws Exception {
	    	Connection conn=null;
	    	PreparedStatement pstmt=null;
	    	ResultSet rs = null;
	    	int re=-1; // 초기값 -1, 아이디가 중복되면 1
//	    	매개변수로 받은 id를 ? 인 쿼리 파라미터에 매핑
	    	String sql ="SELECT mem_uid,mem_pwd ,mem_name ,mem_email,mem_address from memberT where mem_uid=?";
	    	
	    	try {
	    		// dbcp 기법의 연결객체
				conn = getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
//				INSERT 문은 executeUpdate 메소드 호출
				rs = pstmt.executeQuery();
				
				if (rs.next()) {// 아이디가 일치하는 로우 존재
					re=1;
				} else {// 해당 아이디가 존재하지 않음
					re=-1;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {               
				try {
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
	    return re;
	    }
}
