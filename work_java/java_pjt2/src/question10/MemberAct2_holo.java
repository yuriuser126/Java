package question10;

import java.util.Scanner;

class Helseclub{
	private String id;
	private String name;
	private String tel;
	public Helseclub(String id ,String name, String tel) {
		this.id = id;
		this.name = name;
		this.tel = tel;
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}

public class MemberAct2_holo {
	private Scanner scanner;
	private Member[] mArray;
	
	public MemberAct2_holo() {
		scanner = new Scanner(System.in);
	}
	
	void read() {
		System.out.print("인원수>>");
		int n = scanner.nextInt();
		mArray = new Member[n];
		
		for (int i = 0; i < mArray.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			mArray[i] = new Member(name, tel);
		}
		System.out.println("저장되었습니다...");
	}
	
	String search(String name) {
		for (int i = 0; i < mArray.length; i++) {
			if (mArray[i].getName().equals(name)) {
				return mArray[i].getTel();
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
		new MemberAct2_holo().run();
	}
}









