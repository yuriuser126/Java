package question07;

import java.util.Scanner;

public class ArrayListEx_holo {
	public static void main(String[] args) {
		
		String[] s = new  String[30];
		int max=0;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int j = 0; j < s.length; j++) {
//			String string = s[j];
			System.out.println("이름을 입력하세요>>");
			if (s.length<j) {
				max = s.length;
				
			} else {
//				System.out.println("이름을 입력하세요>>");
			
		}
			System.out.println(s[j]);
			

		}
		System.out.println("가장 긴 이름은 : "+s[max]);
	}
}

