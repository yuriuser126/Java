package question01;

import java.util.Scanner;

public class SeasonExSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요(1~12)>> ");
		
//		int season = scanner.nextInt();
		int month = scanner.nextInt();
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6: case 7: 	case 8: //가로로해도 무관함
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못입력");
			break;
		}
		
		
		
//		if ((season>=3 && season<=5)) {
//			System.out.println("봄");
//		}else if ((season>=6 && season<=8)) {
//			System.out.println("여름");
//		} else if ((season>=9 && season<=11)) {
//			System.out.println("가을");
//		}  else if ((season == 12 || season ==1 || season==2)) {
//			System.out.println("겨울");
//		} 
//		else {
//			System.out.println("숫자를 1~12 중 입력하세요");
//
//		}
		scanner.close();
	}
}
