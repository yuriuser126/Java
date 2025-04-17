package chapter09;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {//throws : 호출한쪽에서 처리
	public static void main(String[] args) throws Exception {
		InputStream is=new FileInputStream("C:\\temp\\test.txt");//upcasting?왜?
		int readByte;
		byte[] readBytes = new byte[3];
		String data="";
		
		
		
		while (true) {
//			readByte = is.read();//1byte 단위로 읽는다(정수로 받음)ex>호미
			//호미대신 삽을 많이 쓰겟죠 -?? 빠르게 읽어서?ㅇㅇ
			readByte = is.read(readBytes);//3byte 단위로 읽는다(정수로 받음)ex>삽
			//a하나가 1바이트 aaa를 한번에 뜸
			//aaa에대한 유니코드는 없다. 못찾으니까 깨진다.
			if (readByte == -1 ) {
				break;
			}
			//문자 3개를 형변화노하면서 오류 ex>aaa ->char
//			System.out.print((char)readByte);
			//readByte를 0인덱스에서 readByte 길이만큼 읽는다
			data += new String(readBytes, 0, readByte);//0부터 readByte까지 읽는다
			//첫번째 readBytes 를 받아서 readByte 길이까지 누적
			// aaa bb c -> 10바이트
			// 출력했을때 3바이트 3바이트 3바이트 1바이트 (-1로 추정)
			//3바이트로 3개 뜨고 3바이트로 2개뜨고 식 
//			결국 마지막 readByte는 3을 의미함- 반복문
			
			//data += -> 출력하기 위해서
			
		}
		System.out.println(data);
		
		is.close();
	}
}
