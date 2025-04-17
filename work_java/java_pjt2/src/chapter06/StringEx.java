package chapter06;

public class StringEx {
	public static void main(String[] args) {
		String a=new String(" C#");//heap메모리에 저장
		String b=new String(",C++ ");//heap메모리에 저장
		
		//length() : 문자열의 길이
		System.out.println(a.length());//C#의 길이는 3(스페이스 포함)
		//contains() : 문자열을 포함여부
		System.out.println(a.contains("#"));//true
		System.out.println(a.contains("*"));//false
		
		a = a.concat(b);
		System.out.println(a);// C# ,C++ -> 새로운 문자열을 a가 가리킴
		a = a.trim(); //trim() : 앞,뒤 공백 제거
		System.out.println(a);//  C# ,C++ 
		
		
		a = a.replace("C#", "Java");//replace(); : 문자열대체
		System.out.println(a);// Java ,C++ 
		
		String s[] = a.split(",");//spilt : 문자열을 분리 /string타입을 배열로
		for (int i = 0; i < s.length; i++) {
			/*
			 * 분리된 문자열 0 : Java
			 * 분리된 문자열 1 : C#
			 */
			System.out.println("분리된 문자열"+i+":"+s[i]);
		}
		
		
		a = a.substring(5); //substring () : 인덱스 값으로 시작하는 문자열
		System.out.println(a);//Java , C++ -> C++
		
		char c = a.charAt(2); //charAt : 인덱스에 해당하는 문자
		System.out.println(c); //C++ -> +
		
		
		
		/*
		b= b.concat(a);
		System.out.println(b);
		System.out.println(b.length());//C#의 길이는 3(스페이스 포함)
		*/
	}
}
