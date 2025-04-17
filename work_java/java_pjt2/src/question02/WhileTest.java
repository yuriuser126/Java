package question02;

public class WhileTest {
	public static void main(String[] args) {
		int i=0 , sum=0;
//		int sum=0;
		
		while (i<100) {
			sum+=i;
			i+=2;
			System.out.println("@# i-> "+i);
			System.out.println("@# sum-> "+sum);
			System.out.println();
		}
//		while (i<100) {
//			i++;
//			if (i%2 == 0) {
//				sum+=i;
//			} else {
//
//			}
//		}
		System.out.println(sum);
	}
}

//sum = sum + i
//
//0 = 0 +2
//
//sum 0
//i 2
//
//2 = 2+4
//
//sum 2
//i 4
//
//6 = 6+6
//
//sum 12
//i 6
