package magic.member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;
 


public class MemberDBBean2 {
	//jsp 소스에서 MemberDBBean 객체 생성을 위한 참조변수
	//객체필요할때는 이 메소드를 호출한다.
	//---------------------------------------------
	private static MemberDBBean2 instance=new MemberDBBean2();
	
	//---------------------------------------------
	//MemberDBBean 객체 레퍼런스를 리턴하는 메소드
	public static MemberDBBean2 getInstance( ){
		return instance;
	}
	
	//------------------------------------------------
	//연결이 안되면 예외처리 하겠다.
	//dbcp로 연결하도록 리턴타입 connection으로 링크 return 바로시킴
	//쿼리작업에 사용할 커넥션 객체를 리턴하는 메소드(dbcp 기법)->메소드만 호출
	public Connection getConnection( ) throws Exception{
		return ((DataSource)(new InitialContext().lookup("java:comp/env/jdbc/oracle"))).getConnection();
	}
	
	//----------------------------------------------
	//insertMember도 throw처리 - 회원정보 중복되지 않도록
	public int insertMember(MemberBean2 member) throws Exception{
		Connection conn =null;
		PreparedStatement pstmt=null;
		int re=-1; //초기값 -1, insert 정상적으로 실행되면 1 
		//1건이니까. 업데이트로
		//memberbean에있는 private 5개 >?로 처리
	 String sql =	"insert into memberT values(?,?,?,?,?)";
	 
	 try {
		 //getter 사용 > 멤버객체 + 메서드로 끌어옴
		 //dbcp 기법의 연결 객체
		 conn = getConnection();
		 pstmt = conn.prepareStatement(sql);
		 pstmt.setString(1, member.getMem_uid());
		 pstmt.setString(2, member.getMem_pwd());
		 pstmt.setString(3, member.getMem_name());
		 pstmt.setString(4, member.getMem_email());
		 pstmt.setString(5, member.getMem_addr());
//		 INSERT문은 executeUpdate 메소드호출
		 re = pstmt.executeUpdate();
	 }catch(Exception e){
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
	 //멤버 파라미터 존재 return 해줘야한다.
	}
	
	//------------------------------------
	//파라미터가 String id
	//회원가입시 아이디 중복 확인할때 사용하는 메소드
	//리턴해야한다.
	public int confirmID(String id) throws Exception{
		Connection conn =null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		int re=-1; //초기값 -1, 아이디가 중복되면 1 
		//?=일치하면 중복
		//매개변수 받은 id를 ?인 쿼리파라미터에 매핑
	 String sql =	"select mem_uid, mem_pwd , mem_name, mem_email , mem_address  from memberT where mem_uid=? ";
	 
	 try {
		 conn = getConnection();
		 pstmt = conn.prepareStatement(sql);
		 pstmt.setString(1, id);
		 //파라미터가 와서 id로 값을 작성한다.
		 //4개는 날린다.
		 rs = pstmt.executeQuery();
		 
		 //아이디가 일치하냐안하냐
		 if (rs.next()) {//아이디가 일치하는 로우 존재
			re=1;
		} else {//아이디가 존재하지 않는다.
			re=-1;
		}
		 
	 }catch(Exception e){
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
	 //멤버 파라미터 존재 return 해줘야한다.
	}

}
