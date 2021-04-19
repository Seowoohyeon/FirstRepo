

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D12_SimpleDateFormat {
	
	/*
	 * 		# SimpleDateFormat 클래스
	 *	 		- 간편하게 날짜 인스턴스를 문자로 변환할 수 있는 서식 클래스
	 * 
	 * 
	 * 		# 날짜 서식
	 * 			- y : 년
	 * 			- M : 월
	 * 			- m : 분
	 * 			- d : 일
	 * 			- D : 월 구분없는 일 (1 ~365)
	 * 
	 * 			- E : 요일
	 * 			- a : 오전 / 오후			
	 * 
	 * 			- H : 24시
	 * 			- h : 12시
	 * 			- m : 분
	 * 			- s : 초	
	 * 
	 * 			- w : day of week in year
	 * 			- W : day of week in month
	 */
	
	public static void main(String[] args) {
		
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy/MM/dd (DDD) a HH:mm:ss.SSS E");
		
		System.out.println(f1.format(Calendar.getInstance().getTime()));
		
	
	}

}
