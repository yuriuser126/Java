package chapter03;

public class Ex3_7 {
	public static void main(String[] args) {
		int [] evens = {0,2,4,6,8,10,12,14,16,18}; // 짝수
		int [] primes = {2,3,5,7,11,13,17,19}; //소수
		//0~18까지의 합계 출력
		
//		1.짝수배열을 메소드 매개변수로 호출
//		5.합계를 받아서 evenSum에 저장
		//변수를 두겠다-> 대괄호 빼야함
		int evenSum = sum(evens); 
//		int evenSum = sum(evens[]); //오류
		int primesSum = sum(primes); 

//		6.evenSum을 출력
		System.out.println("짝수 배열의 합 :"+evenSum); // 출력하겠다.
		System.out.println("소수 배열의 합 :"+primesSum); // 출력하겠다.
		
		
	}
//	sum() : 메소드
//	int[] arr : 매개변수 파라미터 인자
//	int sum -> return 값 필요 
	
//	2.arr로 evens를 받는다
//	배열을 받아서 합계를 구하는 메소드
//	public static int sum(int[] arr) {
		public static int sum(int[] evens) {//같은 이름을 사용해도 무관하다.
//			public static int sum(int evens) {//받는 매개변수는 배열형식을 생략하면 오류 대괄호 생략 안됨
		int sum=0; //변수
		
//		매개변수 배열의 크기만큼 반복하면서 sum에 합계를 누적
//	3. 0 부터 18까지 arr 배열원소를 가지고 반복 {0,2,4,6,8,10,12,14,16,18} 해서 합계구함
		for (int i = 0; i < evens.length; i++) {
			sum+=evens[i];
			
			
		}
//		4.합계를 반환
		return sum; //return타입 맞춰야함. sum 을 리턴한다.
	}
	
}
