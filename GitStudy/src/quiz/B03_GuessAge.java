package quiz;

import java.util.Scanner;

public class B03_GuessAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 태어난해는?");
		int a = sc.nextInt();
		System.out.println("당신의 태어난해는 " + a + "년 입니다");
		System.out.println("현재의 년도는?");
		int b = sc.nextInt();
		System.out.println("현재의 년도는 " + b + "년 입니다");
		System.out.println("당신의 한국 나이는 만 " + (b-a) + "세 입니다");
	}

}
