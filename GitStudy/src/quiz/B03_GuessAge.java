package quiz;

import java.util.Scanner;

public class B03_GuessAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �¾�ش�?");
		int a = sc.nextInt();
		System.out.println("����� �¾�ش� " + a + "�� �Դϴ�");
		System.out.println("������ �⵵��?");
		int b = sc.nextInt();
		System.out.println("������ �⵵�� " + b + "�� �Դϴ�");
		System.out.println("����� �ѱ� ���̴� �� " + (b-a) + "�� �Դϴ�");
	}

}
