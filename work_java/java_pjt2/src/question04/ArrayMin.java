package question04;

import java.util.Scanner;

public class ArrayMin {
	public static void main(String[] args) {
		
//		int min = 15;-나의 실패작
//		int min=0; // 초기값 중요........
//		2.두번째 방법
		int min=Integer.MAX_VALUE; //int타입의 가장 큰 숫자
		int intArray[] = new int[7]; //배열만듬
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("양수 7개를 입력하세요");
		
				for (int i = 0; i < intArray.length; i++) {
					intArray[i] =scanner.nextInt();
//					1.첫번째방법
//					if (i==0) {
//						min = intArray[i];
//					}
					if (intArray[i]<min) {
						
						min = intArray[i];
					}
				} // 7번반복 입력받음 배열에 넣음 이해함
				

				System.out.println("가장 작은 수는 "+min+"입니다.");
//				System.out.println(intArray[i]);
		
		scanner.close();
	}
}
