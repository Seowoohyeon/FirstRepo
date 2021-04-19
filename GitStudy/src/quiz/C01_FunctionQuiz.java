package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz {
	
	// 1
	public static boolean is_contain_alpha(char ch) {
		return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
	}
	
	// 2
	public static int multiple (int inNum) {
		String ch = "false";
		int in = 0;
		in = inNum;
		if(inNum % 3 == 0) {
			ch = "true";
			System.out.println(ch);;
		} else {
			System.out.println(ch);
		}
		return in;	
		// return num % 3 == 0;
	}
	
	// 3
	public static int even_odd_numbers(int checkNum) {
		int cn = 0;
		cn = checkNum;
		if(cn % 2 == 1) {
			System.out.println("È¦¼öÀÔ´Ï´Ù");
		} else if(cn % 2 == 0) {
			System.out.println("Â¦¼öÀÔ´Ï´Ù");
		}
		return cn;
		// return checkNum % 2 == 0 ? "Â¦¼ö" : "È¦¼ö";
	}
	
	//4
	public static int[] findDivide(int num) {
		boolean[] divide = new boolean[num];
		int count = 0;
		for (int i = 1; i < num; i++) {
			if(num % 1 ==0) {
				divide[i - 1] = true;
				count++;
			}
		}
		int[] result = new int[count];
		int index = 0;
		for (int i = 0; i < divide.length; i++) {
			if(divide[i]) {
				result[index++] = i + 1;
			}
		}
		return result;
	}
	
	//5
	public static boolean primeNumber(int num) {
		if(num == 1) {
			return false; 
		}
		for(int i = 2; i <= Math.sqrt(num); i++) { 
			if(num % i == 0) {
				return false; 
			}
		}
		return true; 
	}

	// 6
	public static int factorial(int num) {
		if(num == 2) {
			return 2;
		}
		return num * factorial(num -1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		multiple(10);
		even_odd_numbers(45);
		boolean a = primeNumber(12);
		System.out.println(a);
		System.out.println(Arrays.toString(findDivide(40)));
	}

}
