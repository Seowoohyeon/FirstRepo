

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D12_SimpleDateFormat {
	
	/*
	 * 		# SimpleDateFormat Ŭ����
	 *	 		- �����ϰ� ��¥ �ν��Ͻ��� ���ڷ� ��ȯ�� �� �ִ� ���� Ŭ����
	 * 
	 * 
	 * 		# ��¥ ����
	 * 			- y : ��
	 * 			- M : ��
	 * 			- m : ��
	 * 			- d : ��
	 * 			- D : �� ���о��� �� (1 ~365)
	 * 
	 * 			- E : ����
	 * 			- a : ���� / ����			
	 * 
	 * 			- H : 24��
	 * 			- h : 12��
	 * 			- m : ��
	 * 			- s : ��	
	 * 
	 * 			- w : day of week in year
	 * 			- W : day of week in month
	 */
	
	public static void main(String[] args) {
		
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy/MM/dd (DDD) a HH:mm:ss.SSS E");
		
		System.out.println(f1.format(Calendar.getInstance().getTime()));
		
	
	}

}
