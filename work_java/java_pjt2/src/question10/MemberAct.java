package question10;

import java.util.ArrayList;
import java.util.Scanner;


class Delete{ //지우는 클래스를 만드려고 했다
	private int number;

	public Delete(int number) {
		this.number = number;
	}
	
	
	
}


public class MemberAct {
	public static void main(String[] args) {
		
		ArrayList<Member> list=new ArrayList<>(); 
		
		while (true) {
			
		System.out.println("===헬스클럽 회원관리 프로그램===");
		System.out.println("1. 회원 정보 관리 | 2.프로그램 종료");
		System.out.println("======================");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("메뉴를 선택하세요. >>>");
		int a = scanner.nextInt();
		
		if (a == 1) {//회원 정보관리
			System.out.println("===일반회원 정보관리 ===");
			System.out.println("11. 일반 회원 정보 입력 | 22.일반 회원 정보 삭제 |33.일반 회원 정보확인 | 0.이전단계");
			System.out.println("=================");
			System.out.println("메뉴를 선택하세요. >>>");
			int d =scanner.nextInt();
			
			switch (d ) {
			case 11://완료
				System.out.println("가입할 회원수를 입력하세요. >>>");
				 int b = scanner.nextInt();
				 
				 for (int i = 0; i < b ; i++) {
					 System.out.println("회원정보를입력하세요");
					 System.out.println("회원 아이디");
					 String id = scanner.next();
					 System.out.println("회원 이름");
					 String name = scanner.next();
					 System.out.println("회원 지역");
					 String home = scanner.next();
					 list.add(new Member(id, name, home));
				}
				
				 System.out.println("회원등록이 완료되었습니다.");
				break;
				
			case 22:// 로직이 안됨 객체배열을 써야할것같긴함
				System.out.println("삭제할 회원번호를 입력하세요");
				
//				String tel = search(name); 
				
				// 번호를 입력받고나서 값을 불러와야하는데
				// 객체배열에 있는 인덱스 번호를 불러와서
				//if문으로 비교하는걸 작성하려고 했는데 첫시작이 막혀서 안됨
				
//			int removeNum = scanner.nextInt();
				 
				 //인덱스는 0번부터니까 -1 함!!!
//				 list.remove(removeNum - 1); 
				 
				 //list.size() : 리스트 사이즈만큼 반복
				 for (int i = 0; i < list.size(); i++) {
					 Member member = list.get(i);
					 //이름은 멤버로 받아온다.
					 System.out.print("회원번호"+(i+1));
					 
					 //getter 로 가져온다
					 System.out.print("회원 아이디"+member.getID());
					 System.out.print("회원 이름"+member.getName());
					 System.out.print("회원 지역"+member.getArea());
					 
					
					System.out.println("삭제 되었습니다");
//				}
					
			/*	if (c == n[i]) {//삭제가 될 시
//					삭제시키는데 등록된걸 생성자로 초기화?
//					아니면 i --를 시켜서 없애나
				} else {//그게아니면 빠져나간다
					break;
				}
				*/
				
				
				break;
			case 33://- 로직이 안됨
				
				System.out.println("등록된 회원수는 / 객체 배열 수 name. length 찾아야해애 /입니다.");
//				for (int i = 0; i < 배열 수만큼; i++) { //배열 수만큼 도는데 n[i]출력
					System.out.println("회원 번호 + 배열 넘버 넣어야해");
					System.out.println("회원 아이디+아이디 값 찾아오기");
					System.out.println("회원 이름+마찬가지");
					System.out.println("회원 지역");
//				}
				
				
				break;
			case 0://빠져나가야함-완료
				
				break;
				
			default://빠져나감?
				break;
				
			}
		}
		 else {//프로그램 종료-완료
			break;
			}
		scanner.close();
		}
	}

}

