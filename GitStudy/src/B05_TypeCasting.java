
public class B05_TypeCasting {

	public static void main(String[] args) {
		
		/*
		  	@ Ÿ�� ĳ����
		  	  - Ÿ���� �ڿ������� ���ϴ� ��� (Ÿ���� ���ϴ��� ������ ���� ��)
		  	  - Ÿ���� ������ ��ȯ���Ѿ� �ϴ� ��� (Ÿ���� ���ϸ� ������ ���� ��)
		  	  
		  	@ Ÿ���� ũ��
		  	  - ���� Ÿ�� : byte < char, short < int < long
		  	  - �Ǽ� Ÿ�� : float < double
		  	  
		  	���� Ÿ���� ������ �Ǽ�Ÿ�� ���� ǥ�� ������ �۴�
		*/
		
		//1. �ڿ������� Ÿ�� ĳ����
		byte by = 127;
		short sh;
		int i;
		float flt;
		long lo;
		i = by;
		i = 2100000000;
		lo = i;
		flt = lo;
		
		//2. ���� �ջ�� ������ �ִ� Ÿ�� ĳ����
		i = 50000;
		sh = (short)i; // ���� �ջ�� ���� �����Ƿ� �����Ϸ��� ��� ���ش�.
		
		//3. ���� ���̴��� �ٸ��� �ؼ��� �� �ִ� Ÿ���� ��� Ÿ�� ĳ������ �ʿ��ϴ�
		int a = 80;
		char ch = 'z';
		
		System.out.println((char)a);
		System.out.println(a);
		System.out.println((int)ch);
		System.out.println(ch);
		
		
		
		
		
		
		
		
		
	}

}
