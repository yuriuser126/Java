package chapter06;

class Point{
	private int x,y;

	//알트 쉬프트 에스 - 필드를 이용 - 슈퍼 생략
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
public class ObjectPropertyEx {
//	매개변수로 객체를 받는다
	public static void print(Object obj) {//Object obj=new Point(2, 3) -> 업캐스팅됨
//		.getClass() : 실행중인 클래스
		System.out.println(obj.getClass());//class chapter06.Point
		System.out.println(obj.getClass().getName());//chapter06.Point 이름만 나옴
		//해시코드 :2055281021 객체의서명(10진수 해시코드)
		System.out.println(obj.hashCode());
		//패키지.클래스@16진수의 해시코드
		System.out.println(obj.toString());//chapter06.Point@7a81197d
		//to String 종종 사용 - 생략해도 똑같음
		System.out.println(obj);//.toString() 생략(문자열로 변환해서 출력 알아서.)
		
	}
	public static void main(String[] args) {
		Point p = new Point(2, 3); //다운캐스팅-> 왜 두개? x,y값
		print(p); // 프린트 매개변수에 p를 넘겨요
		
	}
}
