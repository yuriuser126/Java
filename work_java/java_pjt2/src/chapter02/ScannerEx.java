package chapter02;

import java.util.Scanner;

//import java.util.*;
//import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
//		System.in : 바이트 표준 입력 스트림
//		System.in : 매개변수(인자, 파라미터-실무, argument)
//		new Scanner : 객체 생성
//		scanner : 참조변수 (reference)
//		Scanner 객체를 생성하고, Scanner 클래스 타입의 scanner 참조변수가 가리킴
//		안닫으면=>Resource leak: 'scanner' is never closed scanner.close()필요
		Scanner scanner = new Scanner(System.in);
//		scanner : 객체
//		next(); : 문자열 입력 받는 매소드
		String name = scanner.next();
		System.out.println("이름은 " + name);

//		입력받을때 스페이스나 탭으로 구분해서 토큰단위로 받음
		String city = scanner.next();
		System.out.println("도시는 " + city);

		int age = scanner.nextInt();
		System.out.println("나이는 " + age + "살");

		double weight = scanner.nextDouble();
		System.out.println("몸무게는 " + weight + "kg");

		boolean single = scanner.nextBoolean();
		System.out.println("독신여부는 " + single + "입니다.");

//		.close() : scanner 객체종료(자원반납)
//		=> 메모리를 더 사용할수 있고, 안하면 garbage collector(쓰레기 청소부)가 자동으로정리
		scanner.close();
	}
}
