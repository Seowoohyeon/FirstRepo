
public class B04_Operator2 {

	public static void main(String[] args) {
		
		/* 
		     �� ������
			 - �������� �� ������ �Բ� ������ ��� ������ ���� ����Ѵ�
			 -  
		
		*/
		int a = 8, b = 5;
		System.out.printf("a = %d, b = %d �� �� \n", a,b);
		System.out.println("a > b \t: " + (a>b)); //sysout + ��Ʈ�� �����̽�
		System.out.println("a < b \t: " + (a<b)); 
		System.out.println("a >= b \t: " + (a>=b)); 
		System.out.println("a <= b \t: " + (a<=b)); 
		System.out.println("a == d \t: " + (a == b)); //�� ���� ������ 1
		System.out.println("a != b \t: " + (a != b)); //�� ���� �ٸ��� 1
		 
		/*
		 	�� ������
		 	  - boolean Ÿ�� ������ �ϴ� ������
		 	  - && : AND
		 	  - || : OR
		 	  - !  : NOT
		 */
		System.out.println("\n-- AND --");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("\n-- OR --");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\n-- NOT --");
		System.out.println(!true);
		System.out.println(!false);
		
		int x=2, y=2, z=1;
		
		System.out.println(x > 5 && x % 3 == 0);
		System.out.println("3���� ��� 3�� ����� : " + (x % 3 == 0 && y % 3 == 0 && z % 3 ==0));
		System.out.println("3���� ��� 3�� ����� �ƴϸ� : " + (x % 3 != 0 && y % 3 != 0 && z % 3 != 0));
		
	}

}
