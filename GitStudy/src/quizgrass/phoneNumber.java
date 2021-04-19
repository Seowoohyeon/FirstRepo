package quizgrass;

import java.util.Scanner;

public class phoneNumber {
	
	private static boolean checkNumeric(char ch) {
		return ch >= '0' && ch <= '9';
	}
	
	public static boolean checkValidPhoneNumber(String phoneNumber) {
		int len = phoneNumber.length();
		if(len != 12 && len != 13) {
			System.out.println("[invalid] ���̰� �ùٸ��� �ʴ�");
			return false;
		}
		
		for(int i = 0; i < len; ++i) {
			
			char ch = phoneNumber.charAt(i);
			
			if(i < 3 && !checkNumeric(ch)) {
				System.out.println("[invalid] �� �� 3�ڸ��� ���� �ƴѰ��� ����");
				return false;
				
			} else if ((i == 3 || (i == 7 && len == 12) || (i == 8 && len ==13)) && ch != '-') {
				System.out.println("[invalid] ������ �ڸ��� �ùٸ��� ����");
				return false;
			} else if (i > 3 && ((len == 12 && i < 7) || (len == 13 && i < 8)) && !checkNumeric(ch)) { 
				System.out.println("[invalid] ��� �ڸ��� ���� �ƴ� ���� ����");
				return false;
			} else if (((i > 7 && len == 12) || (i < 8 && len == 13)) && !checkNumeric(ch)) { // �̾ ����� ��
				System.out.println("[invalid] ������ �ڸ��� ���� �ƴ� ���� ����");
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		String inputnum = sc.nextLine();
		
		if(checkValidPhoneNumber("123-2232-1321")) {
			System.out.println("�ùٸ� �ڵ��� ��ȣ�Դϴ�.");
		}
	}

}
