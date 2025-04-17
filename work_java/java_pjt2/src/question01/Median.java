package question01;

import java.util.Scanner;

public class Median {
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개 입력 >> ");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int median=0;
		
		if ((a>b && a<c) || (a>c && a<b)) {
			median = a;
			
		}else if ((b>a && b<c) || (b>c && b<a)) {
			
			median = b;
		} 
		else {

			median = c;
		}
		System.out.println("중간 값은 "+median);
		
//		if ((a!=b) || (a!=c) || (c!=b)) {
//			if ((a>b)&&(c>b)&&(c>a)) {
//				System.out.println("중간 값은"+a);
//			}else if ((a>c)&&(c>b)&&(a>b)) {
//				System.out.println("중간 값은"+b);
//			} else {
//				System.out.println("중간 값은"+c);
//				
//			}
//		} else {
//
//		}
		scanner.close();
	}
}
