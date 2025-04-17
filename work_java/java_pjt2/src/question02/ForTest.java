package question02;

public class ForTest {
	public static void main(String[] args) {
//		int i=0 , sum=0;
		int i , sum=0;
		
		for ( i = 0; i <100; i+=2) {
			sum+=i;
//			i+=2;
		}
		System.out.println(sum);
	}
}
