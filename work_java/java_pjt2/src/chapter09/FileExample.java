package chapter09;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
//		File dir=new File("C:/aaa"); //객체 생성
		File dir=new File("C:/aaa/bbb"); //하위 디렉토리 포함
		File file1=new File("C:/aaa/file1.txt"); //파일
		File file2=new File("C:/aaa/file2.txt"); //파일
		File file3=new File("C:/aaa/file3.txt"); //파일
		
//		dir.mkdir();//디렉토리 만들기 -> 원래도 다 보였습니다..??????
		dir.mkdirs();//하위 디렉토리까지 같이 만들기
		//오류나서 Exception 예외처리
		file1.createNewFile();//파일만들기
		file2.createNewFile();//파일만들기
		file3.createNewFile();//파일만들기
		
		File test=new File("C:/aaa");//디렉토리 정보를 가지고 test 객체 생성
		//listFiles : File[]배열 타입 객체배열ㅇㅣ다...
		File[] contents = test.listFiles();//디렉토리 정보를 가지고온다.(하위 디렉토리들+파일들)
		System.out.println("날짜                      시간               형태      크기   이름");
		System.out.println("------------------------------------");
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");//년월일 오전/오후 시분
		for (int i = 0; i < contents.length; i++) {
//			System.out.print(contents[i].lastModified());//마지막 생성일자
//			System.out.print(new Date( contents[i].lastModified()));
			System.out.print(sdf.format(new Date( contents[i].lastModified())));
			
//			1740385753958 : 1970년 1월 1일 기준으로 오늘까지의 milisec(1/1000초)로계산된 값(long type)
			if (contents[i].isDirectory()) {//디렉토리이면
				System.out.println("\t<DIR>\t\t"+contents[i].getName());//디렉토리나 파일 이름
				
			} else {
				System.out.println("\t\t\t"+contents[i].length()+"\t"+contents[i].getName());//디렉토리나 파일 이름

			}
		}
	}
}
