package quiz;

import myobj.MyScanner;

public class C13_InputRightThing extends MyScanner {

	public static void main(String[] args) {
		int a = inputInt("���� >> ");
		int b = inputInt("�� ��° ���� >> ");
		
		System.out.println("input �Լ��� �Է� ���� �� : " + a);
		System.out.println("input �Լ��� �Է� ���� �� ��° �� : " + b);
		System.out.println("<< Exit >>");

	}
}
