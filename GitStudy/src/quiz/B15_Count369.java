package quiz;

import java.util.Scanner;

public class B15_Count369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input_num = 0;
		System.out.println("숫자 입력 : ");
		input_num = sc.nextInt();
		int clap_count = 0;
		for(int i = 1; i <= input_num; i++) {
			String digit = Integer.toString(i);
			if(digit.contains("3") || digit.contains("6") || digit.contains("9")) {
				clap_count++;
			}
		}
		System.out.println("박수는 " + clap_count +"번 쳐야 합니다");
		clap_count = 0;
		
		//정수로 풀기
		for(int i = 0; i <= input_num; ++i) {
			int test = i;
			int count = 1;
			int n = 1;
			System.out.print(i + ": ");
			while((n *= 10) <= test) {
				//System.out.println(n + " < " + test);
				count++;
			}
			//System.out.println("count : " + count);
			for(int j = n; j > 0; --j) {
				int value = test % (int)Math.pow(10, j) / (int)Math.pow(10, j-1);;
				if(value == 3 || value == 6 || value == 9) {
					clap_count++;
					System.out.print("짝");
				}
				//test %= (int)Math.pow(10, j-1);
			}
			System.out.println();
		}
		System.out.println("박수는 " + clap_count +"번 쳐야 합니다");
		
		
		
		
		
	
	}

}
