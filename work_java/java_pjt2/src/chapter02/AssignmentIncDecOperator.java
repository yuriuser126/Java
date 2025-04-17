package chapter02;

public class AssignmentIncDecOperator {
	public static void main(String[] args) {
		int a=3, b=3, c=3;
		
//		a=a+3
		a+=3;
		b*=3;//b=b*3
		c%=2;//c=c%2 (몫:1, 나머지:1)
		System.out.println("a= "+a+",b= "+b+",c= "+c);
		
		int d=3;
//		d를 먼저 a에 넘기고, 1을 증가
//		뒤에 붙은 ++/-- 는 후위연산자임
		a=d++;//a=3, d=4
		System.out.println("a= "+a+",d= "+d);
		
//		전위연산자: 먼저 1을 증가하고 a에 저장
		a=++d;//a=5, d=5
		System.out.println("a= "+a+",d= "+d);
		
//		d를 일단 넘기고 나서 -함
		a=d--; // a=5, d=4
		System.out.println("a= "+a+",d= "+d);
		
//		d가 4->3 이 되고나서 a넘김받음
		a=--d; // a=3, d=3
		System.out.println("a= "+a+",d= "+d);
	}
}
