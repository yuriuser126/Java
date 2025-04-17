package chapter03;
/*
 * dufrjgud dldyd(+values()메소드 이용)
 * for each 이용
 */
public class ForeachEX {
//		열거형 : inner class (내부클래스) 형태
	enum Week{월,화,수,목,금,토,일}; //열거형 중괄호 형태. 클래스랑 비슷한형태

	public static void main(String[] args) {
		int[] n = {1,2,3,4,5}; //배열
		String names[] = {"사과","배","바나나","체리","딸기","포도"}; //배열
		int sum=0;
		
		//int 타입 배열원서 n을 k로 하나씩 받는다.
//		타입 인트 변수 k 를n으로 받음
		for (int k : n) {
			System.out.print(k+" ");;
			sum+=k; //sum에 누적
			
		}
		System.out.println("합은 "+sum);
		
		//사과에서 포도까지 나열
		for (String s : names) {
			System.out.print(s+" ");;
			
		}
		System.out.println();
		
		for (Week day  : Week.values()) {
//			열거형 값을 String 값으로 받을 수 없다.
//			String str =day;//오류
			Week str =day;//오류 -> 열거형으로 받아야 한다......
			System.out.print(str+"요일  ");
			
		}
		System.out.println();
		
		
		 
	}
}
