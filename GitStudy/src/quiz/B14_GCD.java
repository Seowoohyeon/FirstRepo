package quiz;

import java.util.Scanner;

public class B14_GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int a = 0;
        
        System.out.print("ù ��° �� : ");
        int first = sc.nextInt();
        System.out.print("�� ��° �� : ");
        int second = sc.nextInt();
        int temp = first > second ? second : first;
        for(int i = temp; i >= 1; i--) {
        	if(first % i == 0 && second % i == 0) {
        		a = i;
        		break;
        	}
        }
        System.out.println("�ִ����� : " + a);
        
        
        
        
	}

}
