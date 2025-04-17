package chapter05;

	class Shape{
		public void draw() {
			System.out.println("Shape");
		}
	}
	class Line extends Shape{
		//오버라이딩(void : 리턴타입 일치, draw : 메소드명 일치, 매개변수 없는것 일치)
		//오버라이딩 메소드 draw 같음
		//새로운 메소드를 만들겠다. 
		public void draw() {
			System.out.println("Line");
		}
	}
	
	class Rect extends Shape{
		public void draw() {
			System.out.println("Rect");
		}
	}
	
	class Circle extends Shape{
		public void draw() {
			System.out.println("Circle");
		}
	}

public class MethodOverridingEx {
	//paint메소드 , 매개변수가 객체죠. p.
	//Shape p = new Line(); upcasting -> 슈퍼클래스 shape를 바라보니까.
	//shape p = new Shape(); -> 슈퍼클래스가서 출력
	static void paint(Shape p) {
		//업캐스팅에 의해서 슈퍼클래스의 draw()메소드로 갔다가 오버라이딩 되어서 Line으로간다
		//동적바인딩
		p.draw();
	}
	public static void main(String[] args) {
		//라인 객체생성
		Line line = new Line(); // 생성자호출 line 상속shape->의 생성자호출후 밑에꺼 호출쭉
		paint(line);//Line(업캐스팅,오버라이딩) // 객체
		paint(new Shape());//Shape
		paint(new Rect());//Rect(업캐스팅,오버라이딩)
		paint(new  Circle());//Circle(업캐스팅,오버라이딩) //()<-이거 왜 붙여줘야함. 객체생성?
//	p: 참조변수 -> 점 -> 객체를 가리킴
		// paint(): 괄호안은 객체만 들어가야한다.
		
		
	}
}





