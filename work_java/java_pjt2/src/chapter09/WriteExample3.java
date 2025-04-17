package chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

//ctrl+shift+o : import 안쓰는거 한번에 삭제
public class WriteExample3 {//파일 만들기
	public static void main(String[] args) throws Exception {
		OutputStream os= new FileOutputStream("C:/temp/output4.txt");//upcasting
		byte[] data = "DEF".getBytes();
//			os.write(data);
			os.write(data,1,2);//EF : 인덱스 1에서 2글자
			//인터넷이 불안정한 상태에서 네트워크 끊겼을 때 전송되지 못한 데이터를 보낸다.
			os.flush(); 
			//혹시전송안됫을때 재전송하는거
			
		os.close(); 
	}

}
