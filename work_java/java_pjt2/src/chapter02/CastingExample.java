package chapter02;

public class CastingExample {
	public static void main(String[] args) {
		int intValue=44032;
//		int 타입을 char 로 바로 저장하려고하면 오류
//		Type mismatch: cannot convert from int to char
//		char charValue = intValue;
//		char 로 변환(casting)해서 저장
//		44032 유니코드에 해당되는 '가'문자 저장
		
		char charValue = (char)intValue;
		System.out.println(charValue);
		
//		long longValue = 500;
//		The literal 5000999888 of type int is out of range 범위를 벗어났다
//		long longValue = 5000999888;
//		5000999888L 에서 L을 안붙이면 int로 인식해서 오류
		long longValue = 5000999888L;
//		Type mismatch: cannot convert from long to int 큰거에서 작은거
//		intValue = longValue;
//		int 로 변환(casting)해서 저장
//		정수 큰타입에서 작은 타입으로 변환(변환안하면오류)
		intValue = (int)longValue;
//		long 타입 숫자가 int로 변환할때 잘려서 706032592로 저장
		System.out.println(intValue);
		
		double doubleValue=3.14;
//		실수에서 정수로 변환(변환 안하면 오류)
		intValue = (int)doubleValue;
//		3.14에서 소수점이 잘려서 3으로 저장
		System.out.println(intValue);
	}
}
