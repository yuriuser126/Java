package chapter11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SeverEx {
	public static void main(String[] args) {
		ServerSocket listener=null; //서버소켓선언 리스너 이름으로
		Socket socket = null; //클라이언트 소켓선언 소켓을 소켓이름으로 선언
		
		BufferedReader in=null; //입력: 클라이언트에서 들어오는 데이터 
		BufferedWriter out=null; //출력: 서버에서 보내는 데이터
		
		Scanner scanner = new Scanner(System.in);//입력받아야 하니까 스캐너 사용
		
		//네트워크 시스템 문제시 사용
		try {
			listener = new ServerSocket(9999);//서버 소켓 객체 생성 -> 클라이언트가 9999로 접속가능
			System.out.println("연결을 기다리고 있습니다.....");
			//소켓 객체로 데이터를 주고받음
			socket = listener.accept();
			//클라이언트의 연결을 대기한다. 클라이언트를 소켓쪽으로 받는다
			//입력 : 클라이언트에서 들어오는 데이터
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//출력: 서버에서 보내는 데이터
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			//채팅 무한반복
			while (true) {
				String inputMessage =  in.readLine();//한행의 문자열을 통째로 읽는다.
				if (inputMessage.equals("bye")) {
					System.out.println("클라이언트에서 bye로 연결을 종료하였음.");
					break;//bye 문자가 나왔을때 종료시키는 if문이다.
				}
				//클라이언트에서 온 메세지
				System.out.println("클라이언트 : "+inputMessage);
				System.out.print("보내기>> ");
				//서버에서 보내는 메세지
				String outputMessage = scanner.nextLine();//한행을 읽는다
				//메세지 보내면서 엔터함
				out.write(outputMessage+"\n");//클라이언트로 메세지 보내기
				out.flush(); // 비정상적인 종료일때 메세지 재전송 , 남아있는거 전부 보내기 플러쉬
			}
		} catch (Exception e) {
			//예외처리시 시스템에서 자동으로 출력되는 메세지
			e.printStackTrace();//기본 메세지 
		} finally {
			//서버클라이언트쪽 쓰고 난 다음 뭘할거냐
			//자원반납(예외발생까지 고려한다)
			try {
				scanner.close();
				socket.close();
				listener.close();//!!!!클로징 전부 다 해주기!!!!!
			} catch (Exception e2) {//서버와 클라이언트 간에 입출력시 예외발생
				System.out.println("클라이언트와 채팅중 오류가 발생했습니다.");
			}
		}
	}
}
