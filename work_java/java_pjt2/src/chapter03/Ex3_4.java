package chapter03;

public class Ex3_4 {
	public static void main(String[] args) {
//		String 타입의 names 배열선언
//		String[] names; //배열선언
//		배열선언, 생성 만들고 ,값  초기화
//		배열 원소(값)이 4개면 인덱스 3까지
//		String[] names= {"Sam","Kate","John","Jenny"}; //배열생성
//		String 배열  객체 생성
//		String 기본값 : null 이다.
//		String[] names= new String[4];
//		String[]  names;//배열 선언
//		names=new String[4]; // 배열생성
//		0번 인덱스가 aaa로  문자열 값(원소)를 할당 , 바뀜
//		names[0]="aaa"; 
//		double[] names;
//		double 기본값 : 0.0
//		배열 선언, 생성
//		int 기본값 : 0
			int[] names=new int[4]; 
		
//   [Ljava.lang.String;@36baf30c -> 참조 변수의 값이다.
//		System.out.println(names);
//		선언만 했을 경우 오류 발생
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
	}
}
