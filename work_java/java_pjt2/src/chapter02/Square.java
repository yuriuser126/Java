package chapter02;

public class Square {
	public static void main(String[] args) {
		int n=4;
//		square(); //메소드 호출부
//		int s = square(); //메소드 호출부
		int s = square(n); //메소드 호출부
//		System.out.println(s); //메인메소드가 아닌 다른 메소드 출력 !
		System.out.println("한변의 길이가 "+n+"인 정사각형의 넓이 : "+s); //4와 16출력
	}
//square : 매소드명
// int : 리턴(반환)타입
//int length : int타입의 매개변수(인자, 파라미터, 입력변수)
//public static int square(int length) {}
//	void : 리턴 타입이 없음 나중에 나오는 return 생략가능
//	public static void square() { // 메소드 정의부
//	리턴문이 없거나 void로 사용안하면 오류!!
//		public static int square() {
			public static int square(int length) { //n-> length로 받음
//		return; //생략 가능
//		return ""; //타입 불일치시 오류(String)
//		return 0; 
		return length*length; 
			
		}
	}
