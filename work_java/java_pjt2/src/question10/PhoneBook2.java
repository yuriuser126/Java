package question10;

import java.util.Scanner;

class Phone{ // 이름 전화번호 + 생성자 + getter 순으로 진행
	private String name;
	private String tel;
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	
}
public class PhoneBook2 {
	private Scanner scanner;
	private Phone[] pArray; // 객체배열로 받는다 역시
	

	public PhoneBook2() {
		scanner = new Scanner(System.in);
	}
	
	void read() {
		System.out.println("인원수 >>");
		int n = scanner.nextInt();
		pArray = new Phone[n]; // 객체배열 생성을 함
		
		
		for (int i = 0; i < pArray.length; i++) {
			System.out.println("이름과 전화번호(이름과 번호는 빈칸 없이 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			pArray[i] = new Phone(name, tel);
		}
		System.out.println("저장 되었습니다..");
	}
	String search(String name) {
		for (int i = 0; i < pArray.length; i++) {
			if (pArray[i].getName().equals(name)) {
				return pArray[i].getTel();
			}
		}
		return null; 
	}
	
	void run() {
		read();
		while (true) {
			System.out.println("검색할 이름>>");
			String name = scanner.next();
			if (name.equals("그만")) {
				break;
			}
			String tel = search(name);
			if (tel == null) {
				System.out.println(name+"이 없습니다.");
			} else {
				System.out.println(name+"의 번호는"+tel+"입니다.");

			}
			
		}
		scanner.close();
	}

	public static void main(String[] args) {
		new PhoneBook2().run();
	}
}
