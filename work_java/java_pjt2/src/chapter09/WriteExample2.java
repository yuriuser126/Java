package chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

//ctrl+shift+o : import 안쓰는거 한번에 삭제
public class WriteExample2 {//파일 만들기
	public static void main(String[] args) throws Exception {
		OutputStream os= new FileOutputStream("C:/temp/output3.txt");//upcasting
		byte[] data = "DEF".getBytes();
		//데이터를 바로 받아도 된다. -> 파일 생김
			os.write(data);
		
//		for (int i = 0; i < data.length; i++) {
//			os.write(data[i]);
//		}
		
		os.close(); 
	}

}
