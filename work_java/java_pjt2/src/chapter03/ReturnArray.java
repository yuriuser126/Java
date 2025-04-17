package chapter03;
/*
 * 배열리턴(메소드 이용)
 */
public class ReturnArray {
//	makeArray() : 메소드이다.
//	int[] : 반환(리턴) 타입(리턴을 안하면 오류)
//	static int[] makeArray() {}
//	static int[4] makeArray() { 
	// 반환할때 크기 4다 하면 오류남 static int[4]
		static int[] makeArray() { 
//		배열 생성시 타입이 불일치시 오류
//		int temp[]=new String[4];
		int temp[]=new int[4];
		
		//temp.length : 4
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i; //i값 0 1 2 3 -> 길이가 4이기 때문이다.
			
		}
//		temp-> int 타입? 위에 배열 크기 4
//		리턴타입과 반환되는 값의 타입이 일치해야함
//		return 0;
//		리턴할때 []를 추가하면 오류
//		return temp[];
		return temp;
	}
	
	public static void main(String[] args) {
		int intArray[];
//		메소드 호출
		intArray = makeArray();//temp 배열 받음 0123 이걸 받음
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]+" ");
		}
	}
}
