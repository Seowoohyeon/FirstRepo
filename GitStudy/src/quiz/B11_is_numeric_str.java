package quiz;

import java.util.Scanner;

public class B11_is_numeric_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		char check;
		int result = 1;
		
		String input_String;
		System.out.println("아무말이나 입력");
		input_String = sc.nextLine();
		for(int i = 0; i < input_String.length(); i++ ) {
			check = input_String.charAt(i);
			if(check < '0' || check > '9') {
				result = 0;
				break;
			}
		}
		System.out.println(result);
	}
}
