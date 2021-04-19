package quiz;

import java.util.Scanner;

public class B11_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String input_String;
		System.out.println("아무단어나 입력");
		input_String = sc.next();
		for(int i = input_String.length()-1; i >= 0 ; i--) {
			System.out.print(input_String.charAt(i));
		}
	}

}
