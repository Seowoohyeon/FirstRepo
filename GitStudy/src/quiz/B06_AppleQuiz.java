package quiz;

import java.util.Scanner;

public class B06_AppleQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int apple;
		int appleBasket;
		
		System.out.print("사과 개수 : ");
		apple = sc.nextInt();
		appleBasket = apple / 10;
		
		if(apple % 10 == 0 && apple > 0) {
			System.out.println("바구니 갯수 : " + appleBasket + "개"); 
		}else if(apple < 0) {
			System.out.println("양수만 입력가능");
		} else {
			System.out.println("바구니 갯수 : " + (appleBasket + 1) + "개"); 
		} 
	}

}
