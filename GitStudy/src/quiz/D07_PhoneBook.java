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
			System.out.println("====================전화번호=====================");
			System.out.println("입력 0, 삭제 1, 찾기 2, 전체보기 3, 종료 4");
			System.out.println("입력 -->");
			int menu = sc.nextInt();
			switch(menu) {
			case 
			}
		}*/
	}
}
