package quiz;

import java.util.Scanner;

public class B14_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input_Num = 0;
		
		System.out.print("아무 숫자나 입력 : ");
		input_Num = sc.nextInt();
		
		for(int i = 2; i <= input_Num; i++) {
			for(int j = 2; j <= i; j++) {
				if(i % j == 0) {
					if(i == j) {
						System.out.println(i + "");
					} else {
						break;
					}
				}
			}
		}
	
		
		
		
		
		
		
		
	}

}
