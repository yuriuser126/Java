package question06;

//default : 접근지정자 - public static 없어서.
class Calc{
	//non static(인스턴스)멤버는 객체생성해야 사용됨
//	public int abs(int a) {
		public static int abs(int a) { //static 있어야 객체 생성이 됨
		return a>0?a:-a;//절대값 반환 / 삼항연산자
	}
		//default접근지정자됨
		 static int max(int a, int b) { //static 있어야 객체 생성이 됨
			return a>b?a:b;//둘중에 큰 수 반환
		}
		 
		 static int min(int a, int b) { //static 있어야 객체 생성이 됨
			 return a>b?b:a;//둘중에 작은 수 반환
		 }
}


//public:접근지정자(제한자)
public class CalcEx {
	public static void main(String[] args) {
		//static 멤버로서 객체 생성없이 접근가능
		System.out.println(Calc.abs(-5));//객체생성해야 메소드 보임
		System.out.println(Calc.max(10,8));//객체생성해야 메소드 보임
		System.out.println(Calc.max(-3,-8));//객체생성해야 메소드 보임
	}
}
