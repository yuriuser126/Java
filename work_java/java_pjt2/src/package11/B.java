package package11;

public class B {
	A a1=new A(true); //객체생성함- 생성자 호출 class A
	A a2=new A(1); //객체생성함
	//객체생성함->private 는 자기 클래스만 됨 볼수도 없다고함
	A a3=new A("문자열"); // default 접근지정자
	//default 접근지장자는 접근됨(같은 패키지다~)
}
