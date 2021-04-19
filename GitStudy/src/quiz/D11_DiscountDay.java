package quiz;

import java.util.Calendar;
import java.util.TimeZone;

public class D11_DiscountDay {
	/*
	 * 		어떤 카페에서 짝수번째 목요일마다 할인행사를 진행한다고 할 때 
	 * 		년도를 입력하면 해당 년도의 모든 할인 날짜를 출력해보세요
	 * 		
	 */
	public static void main(String[] args) {
		Calendar year = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
		
		year.set(Calendar.YEAR, 2020);
		int dowim = year.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		int thurs = Calendar.THURSDAY;
		
	
		
		
		
		
		
		
		System.out.println(dowim);
	}
}
