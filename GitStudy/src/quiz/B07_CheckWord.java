package quiz;

import java.util.Scanner;

public class B07_CheckWord {

	public static void main(String[] args) {
		// next() : ������� ���� ���ڿ� �޾ƿ���  ex) ���� ����ʹ� -> ����
		// nextLine() : ���� �� ���� ���ڿ��� �޾ƿ��� ex) ���� ����ʹ� -> ���� ����ʹ�
		Scanner sc = new Scanner(System.in);
		String word;
		System.out.print("�ܾ �Է� : ");
		word = sc.nextLine();
		if(word.charAt(0) == word.charAt(word.length()-1)) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}
	}

}