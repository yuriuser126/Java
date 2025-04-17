package chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

//ctrl+shift+o : import 안쓰는거 한번에 삭제
public class WriteExample1 {//파일 만들기
	//FileOutputStream :바이트 단위 출력을 위한 하위 스트림 클래스
	//FileOutputStream output.txt를가지고 객체생성!!!!한다.
	public static void main(String[] args) throws Exception {
//		OutputStream os= new FileOutputStream("C:\\temp\\output.txt");//upcasting
		//백슬래시 대신에 슬래시 사용가능
		OutputStream os= new FileOutputStream("C:/temp/output2.txt");//upcasting
		//바이트 단위로 문자열을 읽는다.
		//바이트 배열로 받았어요
		byte[] data = "ABC".getBytes();
		
		//반복하면서 어느객체-os 객체를 만들었으니까 여기에 ABC쓴다. 
		//메소드는 write 아무거나 data배열을 받는다.- 이해됨
		for (int i = 0; i < data.length; i++) {
			//FileOutputStream  객체에 바이트 배열 원소를 넣는다.
			os.write(data[i]);
		}
		os.close(); //오류나니까 적어라
	}

}
