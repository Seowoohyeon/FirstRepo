package quiz;

import java.util.Scanner;

public class B17_CountAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String text;
		int[] count = new int[26];
		System.out.println("아무문장 : ");
		text = sc.nextLine();
		
		// # 문자열을 쉽게 대문자 또는 소문자로 변환하기
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
