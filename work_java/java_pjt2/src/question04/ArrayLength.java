package question04;


import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		int sum=0;
		int intArray[] = new int[5]; // 크기 5
		
		Scanner scanner= new Scanner(System.in);
		System.out.print(intArray.length+"개의 정수를 입력하세요 >>");

		for (int i = 0; i < intArray.length; i++) {//0~4까지 돌아
			intArray[i] = scanner.nextInt();// 숫자를 넣는데 배열에 넣어 i로
			sum += intArray[i]; //그 인덱스 값을 다 더해
		}
		
	
		System.out.println("평균은 "+(double)sum/intArray.length );
		scanner.close();
	}
}
