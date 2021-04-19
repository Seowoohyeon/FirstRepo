package quizgrass;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DiscountDay {

	public static void main(String[] args) {
		
		int year = 2021;
		printAllEventDays(year);
		
		}
	
	
	
	// Calendar Ŭ������ � �ʵ带 �����ϸ� ������ �ʵ嵵 ��Ȳ�� �°� �˾Ƽ� ������Ʈ �ȴ�
	public static void printAllEventDays(int year) {
		SimpleDateFormat eventFormat = new SimpleDateFormat("yyyy�� M�� dd��");
		Calendar event = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
		
		event.set(year, 0, 1, 0, 0, 0); /// 1�� 1�Ϸ� �ʱ�ȭ
		int count = 1;
	
		for(int i = 0; i < 12; ++i) {
			event.set(Calendar.MONTH, i);
			event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY); // ����Ϸ� �ٲٰ�
			event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2);	// �̹��� �ι�° ���Ϸ� ����
			
			System.out.printf(eventFormat.format(event.getTime()) + "\t[%d��° ���]\n", count++);
		
	
			System.out.printf("%d/%d/%d\n", 
					event.get(Calendar.YEAR), event.get(Calendar.MONTH) + 1, event.get(Calendar.DATE));
	
			event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 4);	// �̹��� �׹�° ���Ϸ� ����
			
			System.out.printf(eventFormat.format(event.getTime()) + "\t[%d��° ���]\n", count++);
	
			System.out.printf("%d/%d/%d\n", 
					event.get(Calendar.YEAR), event.get(Calendar.MONTH) + 1, event.get(Calendar.DATE));
	
	
	// add() : ���ϴ� �ʵ带 ���ϴ� ��ġ��ŭ ���ϰų� �� �� �ִ�
			event.add(Calendar.MONTH, 1);
		}
	}
}
