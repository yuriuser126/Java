package chapter02;

public class ByteOperationExample {
	public static void main(String[] args) {
//		연산식을 변수로 저장
		byte result1=10+20;
		System.out.println(result1);
		
		byte x=10;
		byte y=20;
//		Type mismatch: cannot convert from int to byte
//		byte result2 = x+y; //오류
//		연산되어서 int로 자동변환 되어서 byte로 casting 함
		byte result2 = (byte)(x+y); 
		System.out.println(result2);
	}
}
