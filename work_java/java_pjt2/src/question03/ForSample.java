package question03;

public class ForSample {
	public static void main(String[] args) {
		int sum =0;
		
		for (int i = 1	; i <= 10; i++) {
//			if (i <=9 ) {
//				System.out.print(i+"+");
//			}else {
//				System.out.print(i+"=");
//			}
			System.out.print(i);
			if (i<=9) {
				System.out.print("+");
			} else {
				System.out.print("=");

			}
			sum += i;
		}
		System.out.println(sum);
	}
}
