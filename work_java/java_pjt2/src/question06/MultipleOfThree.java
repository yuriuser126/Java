package question06;

import java.util.Scanner;

public class MultipleOfThree {
	
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				System.out.print("양의 정수 10개를 입력하시오>>");
				
				int intArray[] = new int[10];
				
				
				for (int i = 0; i < intArray.length; i++) {
					//입력받아서 배열원소로
					  intArray[i] = scanner.nextInt();
				}
				System.out.print("3의 배수는 ");
				for (int i = 0; i < intArray.length; i++) {
					  if (intArray[i]%3 == 0) {
						  System.out.print(intArray[i]+" ");
					}
					}
				scanner.close();
				
		
	}

}
