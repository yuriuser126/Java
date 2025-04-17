package chapter03;


/*
 * 
 * 예외처리
 * 배열 인덱스 벗어나는것
 */
public class ArrayException {
	
	
	public static void main(String[] args) {
		int [] intArray= new int[5];
		intArray[0]=0; //값 하나 세팅

		try {
			for (int i = 0; i < intArray.length; i++) {
				intArray[i+1] = intArray[i]+i+1;
				//0+0+1->intArray[1]=1; i=0;
				//1+1+1->intArray[2]=3; i=1;
				//3+2+1->intArray[3]=6; i=2;
				//6+3+1->intArray[4]=10; i=3;
				System.out.println(intArray[i]);
			}
//		} catch (Exception e) {//예외처리 종류 상관없이 다 처리(실무에서 많이 사용)
			//상관없이 Exception 사용.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}
}

//0
//1
//3
//6
//배열의 인덱스가 범위를 벗어났습니다.

