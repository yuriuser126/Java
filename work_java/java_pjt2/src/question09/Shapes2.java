package question09;

interface Shape2 {
	final double PI = 3.14;// 함수
	void draw(); // 추상메소드 도형을 그림
	double getArea(); // 추상 메소드 도형의 면적 리턴
	default public void redraw() { // 디폴트 메소드
		System.out.println("--- 다시 그립니다.  ");
		draw();
	}
}

//  class Circle2 implements Shape (int x) { // 매개변수를 왜 둔거지
class Circle3 implements Shape2 {
	private int radius;
	public Circle3(int radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("반지름이" + radius + "인 원입니다.  ");
	}
	@Override
	public double getArea() {
		return radius * radius * PI;
	}
}

class Oval implements Shape2{
		  private int width , height;
			  public Oval(int width, int height) {
			this.width = width;
			this.height = height;
		}
				@Override
				public void draw() {
					System.out.println(width + "x" + height + "에 내접하는 타원입니다.");
				}
				@Override
				public double getArea() {
					return 0.5*width * 0.5*height * PI;
				}
	  }

class Rect implements Shape2 {
	private int width , height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public void draw() {
		System.out.println(width + "x" + height + "크기의 사각형 입니다.");
	}
	@Override
	public double getArea() {
		return width * height ;
	}
}

public class Shapes2 {
	public static void main(String[] args) {
		Shape2[] list = new Shape2[3];
		list[0] = new Circle3(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);//사각형 매개변수 두개

		for (int i = 0; i < list.length; i++) {
			list[i].redraw();
		}
		for (int i = 0; i < list.length; i++) {
			System.out.println("면적은 " + list[i].getArea());
		}

	}
}
