package package2;

//import package1.A;
//다른패키지에 클래스는 import해서 사용
import package1.B;// 오류나서 import해줌

public class C {
	B b;
	//default 접근지정자는 다른패키지에서 접근시 오류
//	A a;
}
