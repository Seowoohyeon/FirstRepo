package quiz;

import java.util.Scanner;

public class B06_AppleQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int apple;
		int appleBasket;
		
		System.out.print("��� ���� : ");
		apple = sc.nextInt();
		appleBasket = apple / 10;
		
		if(apple % 10 == 0 && apple > 0) {
			System.out.println("�ٱ��� ���� : " + appleBasket + "��"); 
		}else if(apple < 0) {
			System.out.println("����� �Է°���");
		} else {
			System.out.println("�ٱ��� ���� : " + (appleBasket + 1) + "��"); 
		} 
	}

}
