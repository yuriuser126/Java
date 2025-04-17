package chapter09;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample12 {//throws : 호출한쪽에서 처리
	public static void main(String[] args) throws Exception {
		Reader reader =new FileReader("C:\\temp\\test.txt");//upcasting
		
		int readData;
		char[] cbuf = new char[2];
		String data="";
		
		while (true) {
//			readData = reader.read();//한개의 문자단위로 읽는다 ex>호미
			readData = reader.read(cbuf);//2개의 문자단위로 읽는다 ex>호미두개짜리 삽
			
			if (readData == -1 ) {
				break;
			}
//			System.out.print((char)readData);
			//2개의 문자로 0번째 인덱스부터 readData 만큼 읽어서 data 문자열에 누적
			data += new String(cbuf, 0, readData);//0부터 readByte까지 읽는다
		}
		System.out.println(data);
		
		reader.close();
	}
}

//단어 블럭처리 물어보기