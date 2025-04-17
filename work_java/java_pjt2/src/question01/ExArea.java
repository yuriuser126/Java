package question01;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하시오>>");
//		소수점 처리를 위해서 int -> float 타입으로 처리
//		정수를 입력하시오>>
//		삼각형의 넓이는 4.5
		 float l1 = scanner.nextFloat();
		 float l2 = scanner.nextFloat();
		 float l3 = scanner.nextFloat();
		 
		if (l3 == 0 ) {
			float triangle = (l1*l2)/2;
			System.out.println("삼각형의  넓이는"+triangle);
			
		} else {
			float trapezium = (l1+l2)*l3/2;
			System.out.println("사다리꼴의 넓이는"+trapezium);

		}
		scanner.close();
	}
}
