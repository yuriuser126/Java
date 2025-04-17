package question10;

import java.util.ArrayList;
import java.util.Scanner;

class Member{ // 2번째에 생각 ㅇ
	private String ID;
	private String name;
	private String area;
	public Member(String iD, String name, String area) {ID = iD;this.name = name;this.area = area;}
	public String getID() {return ID;}
	public void setID(String iD) {ID = iD;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getArea() {return area;}
	public void setArea(String area) {this.area = area;}
	
	
	
}
public class MemberAct3 {
		public static void main(String[] args) {//첫번째에 생각 ㅇ
			Scanner scanner = new Scanner(System.in);
			
			ArrayList<Member> list=new ArrayList<>(); //array list 사용 !!!!!
			int menu = 0;//첫 메뉴 입력받는거 넥스트 인트 미리
			
			
			while (true) {
				
				System.out.println("===헬스클럽 회원관리 프로그램===");
				System.out.println("1. 회원 정보 관리 | 2.프로그램 종료");
				System.out.println("======================");
				System.out.println("메뉴를 선택하세요. >>>");
				menu = scanner.nextInt();
				
				if (menu == 1) {
					while (true) {
						System.out.println("===일반회원 정보관리 ===");
						System.out.println("11. 일반 회원 정보 입력 | 22.일반 회원 정보 삭제 |33.일반 회원 정보확인 | 0.이전단계");
						System.out.println("======================");
						System.out.println("메뉴를 선택하세요. >>>");
						// 위쪽 메뉴랑 섞이니까 새로 선언
						int menu1 = scanner.nextInt(); 
						
						if (menu1 ==11) {
							System.out.println("가입할 회원수를 입력하세요. >>>");
							//insertNum : 입력받는 회원수
							 int insertNum = scanner.nextInt();
							 
							 for (int i = 0; i < insertNum; i++) {
								 System.out.println("회원정보를입력하세요");
								 System.out.println("회원 아이디");
								 String insertid = scanner.next();
								 System.out.print("회원 이름");
								 String insertname = scanner.next();
								 System.out.print("회원 지역");
								 String insertarea = scanner.next();
								 
								 
								 list.add(new Member(insertid, insertname, insertarea));
								 //for문 안쪽에서 돌아가야한다
								 //전역변수 사용
							}
							 //insertid : 아이디 입력받는거
							 //insertname : 이름 입력받는거
							 //insertarea : 지역 입력받는거
							 
							 System.out.print("회원등록이 완료되었습니다.");

							 //컬렉션과 ㄱ객체의 만남
							
						} else if (menu1 == 22) {
							System.out.print("삭제할 회원번호를 입력하세요");
							//removeNum : 삭제 입력
							 int removeNum = scanner.nextInt();
							 
							 //인덱스는 0번부터니까 -1 함!!!
							 list.remove(removeNum - 1); 
							 
							 //list.size() : 리스트 사이즈만큼 반복
							 for (int i = 0; i < list.size(); i++) {
								 Member member = list.get(i);
								 //이름은 멤버로 받아온다.
								 System.out.print("회원번호"+(i+1));
								 
								 //getter 로 가져온다
								 System.out.print("회원 아이디"+member.getID());
								 System.out.print("회원 이름"+member.getName());
								 System.out.print("회원 지역"+member.getArea());
								 
								 System.out.print("삭제 되었습니다");
							}
						}else if (menu1 == 33) {
							System.out.print("등록된 회원수는"+list.size()+"입니다.");
							//list.size() : 리스트 사이즈만큼 반복
							for (int i = 0; i < list.size(); i++) {
								Member member = list.get(i);
								//이름은 멤버로 받아온다.
								System.out.print("회원번호"+(i+1));
								
								//getter 로 가져온다
								System.out.print("회원 아이디"+member.getID());
								System.out.print("회원 이름"+member.getName());
								System.out.print("회원 지역"+member.getArea());
								
						}
							 
						}else if (menu1 == 0) {
							break;
						} 
						
					}
					
				} else if (menu == 2) {
					System.out.println("==============================");
					System.out.println("===헬스클럽 회원관리 프로그램을 종료합니다.===");
					System.out.println("==============================");
					break;
					
				} 

				
				
				
			}
		}

}
