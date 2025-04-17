package question03;

public class DoWhileTest {
	public static void main(String[] args) {
		int sum=0;
//		int a=0;
		int i=0;

		do {
			if (i>99) {
				break;
			}
			sum+=i;
			i+=2;
		} while (true);
		System.out.println(sum);
	}
		
		
//		do {
//			a+=2;
//			sum += a;
//		} while (a<98);
//		System.out.println(sum);
//	}
}
