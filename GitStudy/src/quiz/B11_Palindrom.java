package quiz;

import java.util.Scanner;

public class B11_Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String result = "PALINDROME";
		
		String input_String;
		System.out.println("아무단어나 입력");
		input_String = sc.next();
		for(int i = 0; i < input_String.length()/2; i++) {
			if(input_String.charAt(i) != input_String.charAt(input_String.length()-i-1)) {
				result = "NOT PALINDROME";
				break;
			}
		}
		System.out.println(result);

	}

}
