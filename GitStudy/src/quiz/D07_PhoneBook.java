package quiz;

import java.awt.Insets;
import java.util.HashMap;
import java.util.Scanner;

import myobj.phone.Phone;

public class D07_PhoneBook {
	
	final int insert  = 0;
	int del = 1;
	int search = 2;
	int allnum = 3;
	int exit = 4;
	
	HashMap<String, Phone> map = new HashMap<>();
	private String name, tel, address;
	private Scanner sc;
	public D07_PhoneBook() {
		sc = new Scanner(System.in);
	}
	
	public void _main() {
	/*	while(true) {
			System.out.println("====================��ȭ��ȣ=====================");
			System.out.println("�Է� 0, ���� 1, ã�� 2, ��ü���� 3, ���� 4");
			System.out.println("�Է� -->");
			int menu = sc.nextInt();
			switch(menu) {
			case 
			}
		}*/
	}
}
