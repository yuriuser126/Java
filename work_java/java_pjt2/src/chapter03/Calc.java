package chapter03;


/*
 * main 메소드 매개변수 이용
 */
public class Calc {
	
//	args - main 메소드의 매개변수이다.
	public static void main(String[] args) {
		double sum=0.0;

//		main 메소드 매개변수 크기만큼 반복 - 잘은 없음 사용하는거
		for (int i = 0; i < args.length; i++) {
//			Double : Wrapper 클래스
//			parseDouble() : 실수로 변환하는 메소드
			sum += Double.parseDouble(args[i]);
			
		}
		System.out.println("합계 : "+sum);
		
	}
}
