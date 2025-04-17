package chapter03;
/*
 * 문자열을 정수로 변환
 * 변환 안될때를 대비해서 예외 처리
 * 
 */
public class NumberFormatException {
	public static void main(String[] args) {
//		String[] stirngNumber = {"23","12","3","998"};
		String[] stirngNumber = {"23","12","3","9.998"};
		int i;
		
		for (i = 0; i < stirngNumber.length; i++) {
			try {
//				Integer : Wrapper 클래스
//				parseInt : 문자열을 정수로 변환하는 메소드
				int j = Integer.parseInt(stirngNumber[i]); 
				//int 타입으로 변환
				System.out.println("숫자로 변형된 값은"+j);
			} catch (Exception e) {
				System.out.println(stirngNumber[i]+"는 정수로 변환할 수 없습니다.");
			}
			
		}
		
	}
}
