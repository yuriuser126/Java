package question10;

import java.util.Scanner;
/*
 * for (int i = 0; i < a.length(); i++) {
 * System.out.println("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)"); int b = scanner.nextInt();
 * 
 */
//배열을 받아서 출력하게 하면 될것 같은데
//int b 도 배열로 받아서 2칸씩
//검색하는 이름 b[a][]=입력값
//	b[i]출력 + 의 번호는 + b[][i] 하도록 
//	그게아니라면 그만
//	String [] phone = new String;
//배열값을 받지 않으면 출력을 못함아잔


//



class Booked {
	
}

public static String kor2eng(String word) {
//	for (int i = 0; i < kor.length; i++) {
//		if (kor[i].equals(word)) {
//			return eng[i];//발견하고 인덱스 i의 영어단어 리턴
		}
	}
	return null;//발견할 수 없음 - null값?-데이터 없음?
}
}
public class PhoneBook {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			while (true) {
				System.out.println("인원수 >>");
				String a = scanner.next();
				if (a.equals("그만")) {
					break;
				}
			
				String eng  = Dictionary.kor2eng(kor);
				
				if (eng == null) {
				System.out.println(kor+"는 저의 사전에 없습니다.");
					
				} else {
					System.out.println(kor+"는"+eng);

				}
				
				
				
				
			}
			System.out.println("저장되었습니다...");
			
		}


}
