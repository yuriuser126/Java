package chapter04;

public class Circle {
	 //변수 : 전역변수 //멤버변수 (필드)
		int radius;
		String name;
		
		
		//이게 오버로딩이다. - 보통 대표적인건 생성자때 나옴 오버로딩이.
		
		//생성자 클래스와이름 같음 매개변수가 없기때문이다. 메소드 : 생성자(기본)
		public Circle() {}
		//클래스하고 이름이똑같은 메소드: 생성자 (매개변수 1개)
		public Circle(int a) {
		}
		//클래스하고 이름이똑같은 메소드: 생성자 (매개변수 2개)
		public Circle(int a,int b) {
		}
		
		//멤버 함수(메소드)
		public double getArea() { //리턴안하면 오류뜸
			return 3.14*radius*radius;
		}
		//Circle 클래스에 멤버 3개 name radius getArea
		
//		Circle : 객체 만드는 판
		public static void main(String[] args) {
			Circle pizza; //pizza :참조변수 , 이름 , 태명선언, Circle 이 클래스
//			new Circle(); //객체생성 : 이름 없는 Circle
			pizza = new Circle(); //객체생성 : 이름이 pizza (참조변수) pizza 객체
			pizza.radius=10; //멤버 변수의 값 셋
			pizza.name="자바피자";//멤버 변수 값 셋팅
			double area =  pizza.getArea();//멤버 함수 호출
			System.out.println(pizza.name+"의 면적은 "+area); //314.0 / 멤버 변수의 값을 사용했다.
			
			Circle donut =new Circle(); //객체생성 // 이름이 donut
			donut.radius =2;
			donut.name="자바도넛";
			area =  donut.getArea();			
			System.out.println(donut.name+"의 면적은 "+area); //12.56/ 멤버 변수의 값을 사용했다.
}
}
