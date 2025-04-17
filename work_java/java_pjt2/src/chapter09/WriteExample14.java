package chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample14 {//파일 만들기 -파일 업로드때 사용
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/temp/output14.txt");//upcasting
//		char[] data = "홍길동3".toCharArray();
		String data = "안녕 자바 프로그램";
//			writer.write(data);
//			writer.write(data,1,2); //길동 : "홍길동3"에서 인덱스 1번에서 2자를 읽어서 파일로저장
			writer.write(data,3,2); //"안녕 자바 프로그램"에서 인덱스 3번에서 2자를 읽어서 파일로저장
		
	

		writer.close(); 
	}

}
