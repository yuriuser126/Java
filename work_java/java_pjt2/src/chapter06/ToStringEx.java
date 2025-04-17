package chapter06;

class Point2{
	private int x,y;

	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override //시스템주석
	public String toString() {
		return "Point2("+x+","+y+")";
		//매소드를 재정의하고 실행하면 달라짐 >Point2(2,3)
		//Object 자동상속 오버라이딩만 사용
	}
}
public class ToStringEx {

	public static void main(String[] args) {
		Point2 p = new Point2(2, 3);
		System.out.println(p);//chapter06.Point2@7a81197d : 패키지.클래스@16진수의 해시코드
		System.out.println(p.toString());// 똑같다. chapter06.Point2@7a81197d
		System.out.println(p.toString()+"입니다.");
		

	}
}
