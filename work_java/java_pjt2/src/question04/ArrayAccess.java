package question04;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		int max=0;
		int intArray[] = new int[5];
		
		Scanner scanner= new Scanner(System.in);
		System.out.print("양수 5개를 입력하세요");
		for (int i = 0; i < intArray.length; i++) {
//			5번 반복해서 양수 5개를 배열원소에저장
			intArray[i] = scanner.nextInt();
		}
		
//		배열원소가 최대갑보다 크면 max에 저장
		for (int i = 0; i <intArray.length; i++) {
			if (intArray[i] > max) {
				max = intArray[i];
				
			}
			
		}
		System.out.println("가장 큰 수는 "+max +"입니다.");
		scanner.close();
	}
}
