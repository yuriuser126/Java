package question10;

import java.util.Scanner;

class Dictionary {
	private static String[] kor= {"사랑","아기","돈","미래","희망"};
	private static String[] eng= {"love","baby","money","future","hope"};
	
	//메소드 만듬
	public static String kor2eng(String word) {
		for (int i = 0; i < kor.length; i++) {
			if (kor[i].equals(word)) {
				return eng[i];//발견하고 인덱스 i의 영어단어 리턴
			}
		}
		return null;//발견할 수 없음 - null값?-데이터 없음?
	}
}


public class DicApp {
	public static void main(String[] args) {
//		String[] names= {"사랑","아기","돈","미래","희망"};
//		String[] name= {"love","baby","money","future","hope"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		
		
		while (true) {
			System.out.println("한글단어?");
			String kor = scanner.next();
			if (kor.equals("그만")) {
				break;
			}
			//그만이 아닐경우에
			String eng  = Dictionary.kor2eng(kor);
			
			if (eng == null) {
			System.out.println(kor+"는 저의 사전에 없습니다.");
				
			} else {
				System.out.println(kor+"는"+eng);

			}
		}
		System.out.println("종료합니다..");
		scanner.close();
	}
}




//		for (int i = 0; i < names.length; i++) {
//			a = names[i];
//			System.out.println(names[i]+"는 저의 사전에 없습니다.");

/*
 * switch (key) { case value:
 * 
 * break;
 * 
 * default: break; }
 */

/*
 * if (names[i] != a) { System.out.println(a+"는 저의 사전에 없습니다.");
 * 
 * }else if (names[i] == a) { System.out.println(name[i]); } else { break;
 * 
 * }
 */
/*
 * for (int j = 0; j < name.length; j++) {
 * 
 * // if ( i != j ) { // System.out.println(name[i]+"는 저의 사전에 없습니다."); // // }
 * else { // // }
 * 
 * }
 */