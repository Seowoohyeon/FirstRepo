package quiz;

import java.util.Calendar;
import java.util.TimeZone;

public class D11_DiscountDay {
	/*
	 * 		� ī�信�� ¦����° ����ϸ��� ������縦 �����Ѵٰ� �� �� 
	 * 		�⵵�� �Է��ϸ� �ش� �⵵�� ��� ���� ��¥�� ����غ�����
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
