package chapter05_02;


class OuterClass{//외부클래스
	private String secret="Time is money";
//	public String secret="Time is money";

	public OuterClass( ) {//2.달걀의 생성자 호출됨
//		new InnerClass();//3.노른자 객체생성->?출력..?
		InnerClass obj = new InnerClass();//3.노른자 객체생성
		obj.method();//a.
	}
	public class InnerClass{//내부(중첩 or inner) 클래스
		public InnerClass() {//4.노른자 생성자 호출됨->private처럼 내부 클래스 사용
			System.out.println("내부 클래스의 생성자입니다.");
		}
		//b.->두가지를 호출한거 생성자랑 메소드
		public void method() {
			//노른자(내부)에서 달걀(외부)의 private 접근
			//c.
			System.out.println(secret);
		}
	}
}
public class OuterClassTest {
	public static void main(String[] args) {
//	new OuterClass();//1.달걀 객체를 생성
		OuterClass outer =	new OuterClass();//1.달걀 객체를 생성
//	new InnerClass();//내부클래스 접근 불가
//		outer.secret="";//접근제한(private이면)
	}
	

}
