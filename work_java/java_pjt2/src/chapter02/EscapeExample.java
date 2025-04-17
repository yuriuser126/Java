package chapter02;

public class EscapeExample {
	public static void main(String[] args) {
		System.out.println("번호이름직업");
//		백슬래시t : 탭만큼 띄운다 \t
//		print : 엔터적용안됨
//		백슬래시n : 엔터(다음행)
		System.out.print("번호\t이름\t직업\n");
//		println : 엔터적용
		System.out.println("번호\t이름\t직업");
		System.out.print("번호\t이름\t직업");
		System.out.println();//엔터
//		System.out.print("번호\t이름\t직업");
		System.out.println("우리는 개발자 입니다.");
//		Syntax error on token "개발자", invalid AssignmentOperator
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.println("봄여름가을겨울");
//		\\ -> 특수문자로 인식된다 \하나 출력
		System.out.println("봄\\여름\\가을\\겨울");
	}
}
