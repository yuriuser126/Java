package chapter09;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample11 {//throws : 호출한쪽에서 처리
	public static void main(String[] args) throws Exception {
		//Reader : 문자 단위 입력을 위한 최상위 스트림 클래스
		//FileReader : 문자 단위 입력을 위한  하위 스트림 클래스
		Reader reader =new FileReader("C:\\temp\\test.txt");//upcasting
		
		int readData;
		
		
		
		while (true) {
			readData = reader.read();//한개문자를 읽어서 똑같이 read데이터
			
			if (readData == -1 ) {
				break;
			}
//			System.out.println(readData);
			//ln빼고 char 캐스팅해서 똑같이 나오게 한다.
			//패턴은 반복된다.
			System.out.print((char)readData);
		}
		
		reader.close();
	}
}
