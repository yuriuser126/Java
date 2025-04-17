package package12;

//다른 패키지에서 접근할때 import
import package11.A;

public class C {
	 A a1= new A(true);//import 안되서 오류
	 //default 접근 지정자는 다른패키지에서 접근불가
//	 A a2= new A(1);//default
//	 private  접근지정자는 접근안됨(자기클래스만 접근됨)
//	 A a3= new A("문자열");//default
}
