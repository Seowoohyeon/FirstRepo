package quiz;

import java.util.Scanner;

public class B17_CountAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String text;
		int[] count = new int[26];
		System.out.println("�ƹ����� : ");
		text = sc.nextLine();
		
		// # ���ڿ��� ���� �빮�� �Ǵ� �ҹ��ڷ� ��ȯ�ϱ�
		text = text.toUpperCase();
		
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			System.out.println(ch);
			if(ch >= 'A' && ch <= 'Z') {
				count[ch - 'A']++;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
