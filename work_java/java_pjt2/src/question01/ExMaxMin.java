package question01;

import java.util.Scanner;

public class ExMaxMin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개 입력 >> ");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int max=0;
		int min=0;
		
		if ((a>b)&&(a>c) ) {
			max=a;
//			System.out.println("최대값은"+a);
//			if ((b<a)&&(b<c)) {
//				System.out.println("최소값은"+b);
//			} else {
//				System.out.println("최소값은"+c);
//			}
		} else if ((b>a)&&(b>c)) {
			max=b;
//			System.out.println("최대값은"+b);
//			if ((a<c)&&(a<b)) {
//				System.out.println("최소값은"+a);
//			} else {
//				System.out.println("최소값은"+c);
//			}
		} 
		else {
			max=c;
//			System.out.println("최대값은"+c);
//			if ((a<c)&&(a<b)) {
//				System.out.println("최소값은"+a);
//			} else {
//				System.out.println("최소값은"+b);
//			}

		}
		if ((b<a)&&(b<c)) {
			min=b;
		}else if ((a<c)&&(a<b)) {
			min=a;
		} 
		else {
			min=c;
		}
		System.out.println("최대값은"+max);
		System.out.println("최소값은"+min);
		
		scanner.close();
		
	}
}
