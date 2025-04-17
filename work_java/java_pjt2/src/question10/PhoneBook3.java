package question10;

import java.util.Scanner;

class Phone2{
	private String name;
	private String tel;
	public Phone2(String name, String tel) {
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

public class PhoneBook3 {
	private Scanner scanner;
	private Phone[] pArray;
	public PhoneBook3() {
		scanner = new Scanner(System.in);
	}
	
	void read() {
		System.out.print("인원수>>");
		int n = scanner.nextInt();
		pArray = new Phone[n];
		
		for (int i = 0; i < pArray.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			pArray[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
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
			System.out.print("검색할 이름>>");
			String name = scanner.next();
			if (name.equals("그만")) {
				break;
			}
			String tel = search(name);
			if (tel == null) {
				System.out.println(name+" 이 없습니다.");
			} else {
				System.out.println(name+" 의 번호는 "+tel+" 입니다.");
			}
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		new PhoneBook3().run();
	}
}









