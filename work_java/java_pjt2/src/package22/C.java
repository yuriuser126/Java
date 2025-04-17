package package22;

import package21.A;

public class C {
	public static void main(String[] args) {
		A a=new A();
		a.field1=3;
		//default, private는 다른패키지에서 접근 불가
			
		a.metho1();
		//default, private는 다른패키지에서 접근 불가
		
	
	}
}
