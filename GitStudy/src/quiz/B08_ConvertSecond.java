package quiz;

import java.util.Scanner;

public class B08_ConvertSecond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year, day, hour, min, sec; 
		
		
		System.out.println("�ʸ� �Է��� �ּ���");
		int inputTime;
		inputTime = sc.nextInt();
		int src = inputTime;
		sec = inputTime;
		min = sec / 60;
		hour = min / 60;
		day = hour / 24;
		year = day / 365;
		
		if(min % 60 != 0) {
			sec = sec - 60 * min;
		} else {
			sec = sec - 60 * min;
		} if(hour % 60 != 0) {
			min = min - 60 * hour;
		} else {
			sec = sec - 3600 * hour;
		} if(day % 24 != 0) {
			hour = hour -24 * day;
		} else {
			sec = sec - 86400 * day;
		} if(year % 365 != 0) {
			day = day - 365 * year;
		} else {
			sec = sec - (60 * 60 * 24 * 365) * year;
		}
		System.out.println(src + "�ʴ� ��ȯ�ϸ�");
		
		boolean ex = false;
		
		if(year != 0) {
			System.out.print(year + "�� ");
			ex = true;
		}
		if(ex || day != 0) {
			System.out.print(day + "�� ");
			ex = true;
		}
		if(ex || hour != 0) {
			System.out.print(hour + "�ð� ");
			ex = true;
		}
		if(ex || min != 0) {
			System.out.print(min + "�� ");
			ex = true;
		}
		System.out.print(sec + "�� �Դϴ�");
	}

}
