package question04;

import java.util.Scanner;

public class ArrayTen {
	public static void main(String[] args) {
		int intArray[] =new int[10]; //이거 안 만듬
		int sum=0;
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println(intArray.length+"개의 정수를 입력하세요>>");
		//출력안함
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			sum += intArray[i]; //이거 안함
			
		}

		System.out.println("합계는 "+sum);
		scanner.close();
	}
}
