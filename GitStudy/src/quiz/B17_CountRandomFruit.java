package quiz;

import java.util.Random;
import java.util.Scanner;

public class B17_CountRandomFruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		String[] fruit = {"apple","banana","kiwi","orange","peach","strawberry","pineapple"};
		int[] fcount = new int[fruit.length];
		
		System.out.print("배열 크기 >> ");
		int input = sc.nextInt();
		
		String[] array = new String[input];
		
		for (int i = 0; i < input; i++) {
			array[i] = fruit[ran.nextInt(fruit.length)];
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
