package chapter02;

public class LogicalOperator {
	public static void main(String[] args) {
//		문자끼리 비교는 유니코드 크기로 비교됨
		System.out.println('a' > 'b');
		System.out.println('a' < 'b');
		
		System.out.println(-1 < 0);
		System.out.println(3 >= 2 );
		System.out.println("===============" );
		System.out.println(3.45 <= 2 );
		System.out.println(3 == 2 );
		System.out.println(3 != 2 );
		System.out.println(!(3 != 2 )); //참이 아니다 거짓출력
		System.out.println("===============" );
//		참 && 거짓 = 거짓
		System.out.println((3 > 2) && (3 > 4) );
//		참  || 거짓 = 참
		System.out.println((3 != 2) || ( -1 > 0) ); // 이미 앞이 참이라 결과가 끝났다. 뒤는 상관없이 결과가나오니 죽은코드라 칭함 - 버그
//		참  ^ 거짓 = 참  두개가 다르면 참
		System.out.println((3 != 2) ^ ( -1 > 0) );
		
	}
}
