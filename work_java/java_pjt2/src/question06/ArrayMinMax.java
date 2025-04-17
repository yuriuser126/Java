package question06;

import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		
		int max=0;
		int min=0;
		int intArray[] = new int[10];
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("양수 10개를 입력하세요");
		
		for (int i = 0; i < intArray.length ; i++) {
			intArray[i] = scanner.nextInt();
			
//			System.out.println(a);
			if (i ==0) {
				min =intArray[i];
			}
			if (intArray[i] < min) {
				min = intArray[i];
			}
			if (intArray[i] > max) {
				max = intArray[i];
			}
		}
		

		
		System.out.println("가장 작은수는"+min+"이고,");
		System.out.println("가장 큰수는"+max+"이고,");
		System.out.println("최소값+최대값은 "+(min + max)+"입니다.");
		
		scanner.close();
	}
}
