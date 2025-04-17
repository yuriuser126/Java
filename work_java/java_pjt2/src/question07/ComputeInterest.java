package question07;
/*
 * 
 * 정기예금의 원리금, 원금
 * 원리금=원리금*(1.0+연이율/100.0)->1년후 원리금
 * ex>1,000,000*(1.0+5/100)=1,000,000(1.0+0.05)
 */
import java.util.Scanner;

public class ComputeInterest {
	public static void main(String[] args) {
		
		int years=0;
		double balance=0.0;
		
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("원금을 입력하시오:");
		int principal = scanner.nextInt();
		
		System.out.println("연이율을 입력하세요:");
		double rate = scanner.nextDouble();
		balance = principal;
		
		System.out.println("\t연도수 \t원리금");//\t넣기
		
		
		do {
			years = years + 1;
			balance = balance*(1.0+rate/100.0);
			System.out.println(years + balance);
		} while (balance <= principal*2.0);
		System.out.println("필요한 연도수"+ years);
		scanner.close();
		}
	}

