package chapter04;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	
	public  int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
//		new Rectangle(); //객체 생성 / 멤버 3개짜리( 멤버변수 -필드2개 멤버함수 -메소드1개)
//		new 연산자로 Rectangle 객체 생성->Rectangle 클래스 타입의 참조변수 rect 가 가리킴
		Rectangle rect = new Rectangle(); //rect :참조변수
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		
//		객체의 멤버변수로 접근해서 스캐너에서 입력받은 정수가 셋팅
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
//		메소드 호출하면 사각형의 넓이 구할수 있음
		System.out.println("사각형의 면적은 "+rect.getArea());
		
		scanner.close();
		
		
	}
}
