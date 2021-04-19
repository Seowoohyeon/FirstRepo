package quiz;

import java.util.Scanner;

public class B07_CheckWord {

	public static void main(String[] args) {
		// next() : 공백기준 다음 문자열 받아오기  ex) 집에 가고싶다 -> 집에
		// nextLine() : 다음 한 줄의 문자열을 받아오기 ex) 집에 가고싶다 -> 집에 가고싶다
		Scanner sc = new Scanner(System.in);
		String word;
		System.out.print("단어를 입력 : ");
		word = sc.nextLine();
		if(word.charAt(0) == word.charAt(word.length()-1)) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}
	}

}