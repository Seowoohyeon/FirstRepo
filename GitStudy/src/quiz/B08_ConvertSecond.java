package quiz;

import java.util.Scanner;

public class B08_ConvertSecond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year, day, hour, min, sec; 
		
		
		System.out.println("초를 입력해 주세요");
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
		System.out.println(src + "초는 변환하면");
		
		boolean ex = false;
		
		if(year != 0) {
			System.out.print(year + "년 ");
			ex = true;
		}
		if(ex || day != 0) {
			System.out.print(day + "일 ");
			ex = true;
		}
		if(ex || hour != 0) {
			System.out.print(hour + "시간 ");
			ex = true;
		}
		if(ex || min != 0) {
			System.out.print(min + "분 ");
			ex = true;
		}
		System.out.print(sec + "초 입니다");
	}

}
