package quiz;

import java.util.Scanner;

public class B03_celtoFahr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double cel,fah;
		System.out.println("���� �µ� �Է�(������ �Է��� �ּ���)");
		cel = sc.nextDouble();
		fah = (cel * 9/5) + 32;
		System.out.printf("���� ȭ�� �µ��� %.1f��F �Դϴ�", fah);
	}

}
