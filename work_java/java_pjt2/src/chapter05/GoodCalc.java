package chapter05;


//class Calcdulator{}
abstract class Calcdulator{//추상클래스 선언(추상메소드는 없어도됨)
//	public int add(int a, int b) {return 1;}
	//추상메소드는 구현시 오류(중괄호 있음)
//	public abstract int add(int a, int b) {return 1;}
	public abstract int add(int a, int b) ; //추상메소드 선언
	public abstract int subtract(int a, int b) ;
	public abstract double average(int [] a) ;
}
	


//추상클래스 구현 x 때문에 오류 안남
//public abstract class GoodCalc extends Calcdulator{ //추상클래스는 구현불필요
	public class GoodCalc extends Calcdulator{//추상메소드 오버라이딩해서 구현안하면 오류
	public static void main(String[] args) {
		//Cannot instantiate the type Calculator
//		Calculator calculator = new Calculator();
		//추상클래스에선 객체생성 안됨
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));//5
		System.out.println(c.subtract(2, 3));//-1
		System.out.println(c.average(new int[] {2,3,4}));//3.0
//		new int[] {2,3,4} : 배열 선언
		//이방법말고는 여기에 배열을 그냥 메인에 만들어서 던지면 된다.
		
	}

	@Override //@는 어노테이션(시스템 주석)-> 생략해도 문제 없음
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {//배열써서 평균 구하기
		double sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum/a.length;
	}
}
