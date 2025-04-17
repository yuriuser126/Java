package chapter03;

public class Ex3_6 {
	public static void main(String[] args) {
		int[] arr = {88,76,92,68,55,48,82};
		int sum=0;
		
//		length : 필드임 괄호 열고닫고
//		매소드가 나오는데 필드
		// 출력 7임.
//		System.out.println(arr.length); -> 7
		//7이니까 index6번까지 반복
		for (int i = 0; i < arr.length; i++) {
//			arr[0]-arr[6] 반복
//			arr[i] : 배열 원소값 , 끝나면 합계를 구할수 있음
			sum+=arr[i];
		}
		System.out.println("총합  : "+sum);
	}
}
