package question02;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수를 입력하세요: ");
		int time = scanner.nextInt();

//		ex>5000/3600=1
		int hour = time / 3600;
		int minute = (time / 60) % 60;
		int second = time % 60;

		System.out.println(time + "초는" + hour + "시간," + minute + "분," + second + "초 입니다.");

		scanner.close();

	}
}
