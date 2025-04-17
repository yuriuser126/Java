package chapter09;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {//throws : 호출한쪽에서 처리
	//throws  Exception : 파일이 없을 경우 예외 발생
	public static void main(String[] args) throws Exception {
		//InputStream : 바이트 단위 입력을 위한 최상의 스트림 클래스
		//FileInputStream : 바이트 단위 입력을 위한 하위 스트림 클래스
//		특수문자라 하나 더 붙여야함 \<-이거
		InputStream is=new FileInputStream("C:\\temp\\test.txt");//upcasting?왜?
		int readByte;
		
		//is가 입력받음-???
		
		while ((readByte = is.read()) != -1) {
			System.out.print((char)readByte);
		}
		
		/*
		while (true) {
			readByte = is.read();//byte 단위로 읽는다(정수로 받음 int로)
			//파일의 끝에는 -1이 존재(프로그래밍 언어 동일) : EOF(end of file)
			if (readByte == -1 ) {
				break;
			}
//			aaa :97
//			bb :98
//			c:99
//			엔터 : 13
//			첫번째 열 : 10
			
//			System.out.println(readByte);
			System.out.print((char)readByte);//캐스팅함//ln빼면 뛰는거 없애줌
		}
		*/
		
		is.close();
	}
}

/*
 * 97 a
97
97
13 엔터
10 첫행
98 b
98
13 엔터
10 첫행
99 c
 * 
 */
