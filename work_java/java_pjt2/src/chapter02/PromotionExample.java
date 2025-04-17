package chapter02;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue=10;
//		작은타입을 큰 타입으로 받음 : 자동변환
		int intValue= byteValue;
		System.out.println("intValue : "+intValue);
		
		char charValue='가';
//		변수에 유니코드가 저장 -> 문자를 int로 받았을때
		intValue = charValue;
		System.out.println("intValue : "+intValue);
		
		intValue=50;
//		작은 타입을 큰타입으로 받음 : 자동변환
		long longValue = intValue;
		System.out.println("intValue : "+longValue);
		
		longValue=100;
//		정수를 실수로 받음
		float floatValue = longValue;
		System.out.println("intValue : "+floatValue);
		
		floatValue=100.5F;		
//		작은 타입을 큰타입으로 받음 : 자동변환 double > float
		double doubleValue = floatValue;
		System.out.println("intValue : "+doubleValue);
		
	}
}
