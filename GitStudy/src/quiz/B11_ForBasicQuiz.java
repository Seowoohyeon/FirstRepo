package quiz;

import java.util.Scanner;

public class B11_ForBasicQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("10부터 n까지의 합?"); 
        System.out.print("숫자를 입력해주세요 ： ");
        int input_num = sc.nextInt(); 
        int n1 = 10;
        int n2 = 1;
        int sum = 0;                  
        
        if(n1 > input_num) {
        	int temp = n1;
        	n1 = input_num;
        	input_num = n1;
        }
        if(n2 > input_num) {
        	int temp = n2;
        	n2 = input_num;
        	input_num = n2;
        }
        
        for (int i = n1; i <= input_num; i++) {
        	sum += input_num;                   
        }
        System.out.println("10부터 " + input_num + "까지의 합은 " + sum + "입니다.");
        System.out.println("5의 배수");
        for(int i = n2; i <= input_num; i++) {
        	if(i % 5 == 0) {
        		System.out.println(i);
        	}
        }
    }
}
