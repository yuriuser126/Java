package chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample11 {//파일 만들기
	public static void main(String[] args) throws Exception {
//		OutputStream os= new FileOutputStream("C:/temp/output2.txt");//upcasting
//		byte[] data = "ABC".getBytes();
		//Writer : 문자 단위 입력을 위한 최상위 스트림 클래스
		//FileWriter : 문자 단위 입력을 위한  하위 스트림 클래스
		Writer writer = new FileWriter("C:/temp/output11.txt");//upcasting
		//문자열을 문자 하나씩 배열로 가져온다.
		char[] data = "홍길동".toCharArray();
		
		
		for (int i = 0; i < data.length; i++) {
			//writer 객체에 write 메소드로 "홍길동"을 하나씩 받아서 파일로 저장한다. 
			writer.write(data[i]);
		}
		writer.close(); 
	}

}
