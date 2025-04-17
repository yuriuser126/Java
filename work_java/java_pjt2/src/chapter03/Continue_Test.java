package chapter03;
/*
 * 문자열에서 특정 문자 찾는다
 * 찾은갯수출력
 * ex) life is cool.(l-2개)
 */
public class Continue_Test {
	public static void main(String[] args) {
		int count=0;
//		알파벳 n의 갯수를 구한다
		String s = "no news is good news";
		
//		스페이스 포함해서 20자
//		length() : 문자열의 크기를구하는 메소드
//		System.out.println(s.length()); //20출력
		
//		문자열 크기 20번 반복
		for (int i = 0; i < s.length(); i++) {
//			s.charAt(0) : 첫번째 문자이다
//			System.out.println(s.charAt(0));
//			s.charAt(i) : 문자열 하나씩 가지고 옴 세로로 하나씩.
//			System.out.println(s.charAt(i));
			
//			if (s.charAt(i)=='n') {
//				count++;
//			} //-> 왠만하면 이걸로 많이 쓴다 !!
			
			
//			알파벳 n 이 아니면 스킵
			if (s.charAt(i) !='n') {
				continue; 
			}
//			알파벳 n 이면 카운트 증가
			count++;
		}
		System.out.println("문장에서 발견된 n 의 갯수 : "+count);
	}
}
