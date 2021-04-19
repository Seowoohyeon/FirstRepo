package quiz;

import java.util.Scanner;

public class B03_wonToDollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kor_Won;
		double exchange_Raty = 0.00089;
		System.out.println("원화 입력 : ");
		kor_Won = sc.nextInt();
		double usd = kor_Won * exchange_Raty;
		System.out.printf("%.2f 달러 입니다(수수료 1.75%)", usd - (usd * 1.75 /100));
		
	}

}
