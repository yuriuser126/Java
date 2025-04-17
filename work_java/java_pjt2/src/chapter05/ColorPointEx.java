package chapter05;
/*
 * 
 * Point 클래스 : (x,y) 한 점을 표현
 * Point 클래스를 상속받는 ColorPoint 클래스(색을 가진 점)
 */

//포인트 클래스에 멤버변수 4개
class Point { //4.(1,2)
	private int x, y;

	//매개변수 받아서 멤버변수 저장하는거다.
	public void set (int x, int y) { //2.(1,2)
		this.x = x; this.y = y;//3.(1,2)
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

//ColorPoint : 서브클래스 자식클래스
//Point : 수퍼클래스 부모클래스
 class ColorPoint extends Point{
	 private String color;//4.(red)
	 public void setColor(String color) {//2.(red)
		 //set +ctrl+스페이스 컬러
		this.color = color;//3.(red)
	}

	public void showColorPoint() { // show point 상속받음
		System.out.print(color);
		//메소드 안에서 상속받은 메소드 호출
		showPoint(); //(3,4) 출력
	}
 }
 
// p : 참조변수면서 객체
public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point(); //객체생성, 멤버4개 , 생성자호출(기본)-만들어야함
//		객체에서 멤버 접근시 . 사용
//		메소드 호출시 ctrl 클릭
//		1.메소드 호출
		p.set(1,2);
		p.showPoint(); //1,2 출력
		
		//멤버 7개 , 객체 생성, 생성자호출(기본) : Point(수퍼) -> ColorPoint(서브)
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.showPoint();//쇼포인트도 상속받음
//		1.red 값을 가지고 메소드 호출
		cp.setColor("red");
		cp.showColorPoint();
	}
}
