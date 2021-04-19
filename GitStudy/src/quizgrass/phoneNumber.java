package quizgrass;

import java.util.Scanner;

public class phoneNumber {
	
	private static boolean checkNumeric(char ch) {
		return ch >= '0' && ch <= '9';
	}
	
	public static boolean checkValidPhoneNumber(String phoneNumber) {
		int len = phoneNumber.length();
		if(len != 12 && len != 13) {
			System.out.println("[invalid] 길이가 올바르지 않다");
			return false;
		}
		
		for(int i = 0; i < len; ++i) {
			
			char ch = phoneNumber.charAt(i);
			
			if(i < 3 && !checkNumeric(ch)) {
				System.out.println("[invalid] 맨 앞 3자리에 숫자 아닌것이 있음");
				return false;
				
			} else if ((i == 3 || (i == 7 && len == 12) || (i == 8 && len ==13)) && ch != '-') {
				System.out.println("[invalid] 하이픈 자리가 올바르지 않음");
				return false;
			} else if (i > 3 && ((len == 12 && i < 7) || (len == 13 && i < 8)) && !checkNumeric(ch)) { 
				System.out.println("[invalid] 가운데 자리에 숫자 아닌 것이 있음");
				return false;
			} else if (((i > 7 && len == 12) || (i < 8 && len == 13)) && !checkNumeric(ch)) { // 이어서 만들고 ㅂ
				System.out.println("[invalid] 마지막 자리에 숫자 아닌 것이 있음");
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
			System.out.println("올바른 핸드폰 번호입니다.");
		}
	}

}
