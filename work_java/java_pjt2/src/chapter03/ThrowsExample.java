package chapter03;

public class ThrowsExample {
	public static void main(String[] args) {
		
		try {
			findClass(); //메소드 호출
			System.out.println("클래스를 찾음!!!");
		} catch (ClassNotFoundException e) {
//		} catch (Exception  e) {
			System.out.println("클래스를 못찾음ㅜ.ㅜ");
		}
		
	}
//	throws : 메소드 호출한 곳으로 예외처리를 넘긴다.
//	findClass : 메소드
	public static void findClass() throws ClassNotFoundException{
//		public static void findClass()  {
		Class.forName("java.lang.String");//forName : 찾는거
//		Class.forName("java.lang.String2");//forName : 찾는거
	/*	
		try {
			Class.forName("java.lang.String2");//forName : 찾는거
			System.out.println("클래스를 찾음2!!!");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 못찾음2ㅜ.ㅜ");
		}*/
	}
}
