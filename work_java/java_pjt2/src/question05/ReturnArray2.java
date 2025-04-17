package question05;
/*
 * 배열 리턴2(메소드 이용)
 * 일차원 배열 생성(정수 1~10)
 * 베열 리턴-> 배열 원소 +100 -> 출력
 */

public class ReturnArray2 {

		static int[] makeArray() { 

		int temp[]=new int[10];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i+1;
//			System.out.print(temp[i]+" ");
		}
		
		return temp;
		}


	
	public static void main(String[] args) {
		int intArray[]; //배열 선언만하고

		intArray = makeArray(); // 메소드 호출
		
		//intArray.length : 10
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]+100+" ");
		}
		

	}
}