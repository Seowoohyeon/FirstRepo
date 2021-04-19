package quiz;

import myobj.MyScanner;

public class C13_InputRightThing extends MyScanner {

	public static void main(String[] args) {
		int a = inputInt("숫자 >> ");
		int b = inputInt("두 번째 숫자 >> ");
		
		System.out.println("input 함수로 입력 받은 값 : " + a);
		System.out.println("input 함수로 입력 받은 두 번째 값 : " + b);
		System.out.println("<< Exit >>");

	}
}
