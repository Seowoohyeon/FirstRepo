package quiz;

import java.util.Scanner;

public class B03_celtoFahr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double cel,fah;
		System.out.println("현재 온도 입력(섭씨로 입력해 주세요)");
		cel = sc.nextDouble();
		fah = (cel * 9/5) + 32;
		System.out.printf("현재 화씨 온도는 %.1f°F 입니다", fah);
	}

}
