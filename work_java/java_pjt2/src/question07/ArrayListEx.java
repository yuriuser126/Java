package question07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<>();
		
//		String[] s = new  String[30];
//		int max=0;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int j = 0; j < 4; j++) {
			System.out.print("이름을 입력하세요>>");
			String s = scanner.next();
			a.add(s);
		}
		
		for (int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.print(name+" ");
			
		}
		
		int longestIndex = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(longestIndex).length() < a.get(i).length()) {
				longestIndex=i;
			}
		}
		System.out.print("가장 긴 이름은 : "+a.get(longestIndex));

	}
}
