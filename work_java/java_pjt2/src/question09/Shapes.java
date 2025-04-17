package question09;

interface Shape{
	final double PI = 3.14;//함수
	void draw(); //추상메소드 도형을 그림
	double getArea(); //추상 메소드 도형의 면적 리턴
	default public void redraw() { // 디폴트 메소드
		System.out.println("--- 다시 그립니다.  ");
		draw();
	}
}


//  class Circle2 implements Shape (int x) { // 매개변수를 왜 둔거지
	  class Circle2 implements Shape {
	  private int radius;
	  
  
  public Circle2(int radius) {
		this.radius = radius;
	}

@Override public void draw() { 
	System.out.println("반지름이"+radius+"인 원입니다.  ");
  
  }
  
  @Override public double getArea() { 
	  return radius*radius*PI; 
	  } }
 

public class Shapes   {
	public static void main(String[] args) {
		Shape donut =  new Circle2(10); 
		//반지름이 10인 객체 생성자 매개변수 10 upcasting
		donut.redraw();
		//객체에서 redraw호출
		System.out.println("면적은 "+donut.getArea());
		
	}
}

