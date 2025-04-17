package chapter05;
/*
 * 
 * super() 를 사용

 */

//colorpoint안에 point class 있어서 오류남
class Point2{
	private int x,y; //4. (0,0)저장 //d.(5,6)저장
	public  Point2() {//2. (5,6,"blue"); -> 슈퍼클래스 생성자 호출 
		this.x = this.y = 0; //-> 같이 0이다. //3. 멤버저장 0,0
	}

	public  Point2(int x,int y) { //b.(5,6)
		this.x = x; this.y = y;//c.멤버저장
	}
	
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint2 extends Point2{
	 private String color;//6.blue 저장
	 
	public  ColorPoint2(int x, int y, String color) {//1. (5,6,"blue");
		super(x,y); // a.(5,6)//-슈퍼클래스 두개짜리로 올라감
		//super를 살려서 매개변수 두개짜리 point2클래스에 들어가게함
		this.color = color; // 5.멤버 저장 blue 저장
	}
	public void showColorPoint() { 
		System.out.print(color);
		showPoint(); 
	}
}

public class SuperEx {
	public static void main(String[] args) {
		//객체생성, (0,0), blue 셋팅
		ColorPoint2 cp = new ColorPoint2(5,6,"blue");
		cp.showColorPoint();
		
	}
}




