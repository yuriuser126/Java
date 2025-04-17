package package21;

public class B {
		public static void main(String[] args) {
			A a=new A(); //객체생성
			//private 멤버는 자기클래스 안에서만 접근됨
			a.field1=2;
			a.field2=2; 
			
			a.metho1();
			a.method2();
			
		}
}
