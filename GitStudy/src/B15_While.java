import java.util.Scanner;

public class B15_While {

	public static void main(String[] args) {
		
		/*
		 
		  for���� ������ �ణ �ٸ� �ݺ���
		   �ʱⰪ�� �������� ��ġ�� ������ ���� �ʴ�
		   ��ȣ���� ������ ���ε��� �߰�ȣ ���� ���� �ݺ�
		
		*/
		
		int i = 0;
		
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		// �������� ��ġ�� ���� ����� �޶��� �� �ִ�
		i = 0;
		while(i++<10) {
			System.out.println("�ݺ��� 2 : " + i);	
		}
		
		/*  
		   while���� ����ϱ� ���Բ� ����� Ŭ�������� �ִ�
			 - has, next ���� ���ľ ���� �޼��带 ������ �ִ�
			 - Scanner ��
		*/
		
		Scanner sc1 = new Scanner("apple banana");
		Scanner sc2 = new Scanner("1234 4567 7894 4154 4844");
		
		// Scanner.hasNext() - ���� ���� ������ ��, ������ ����
		while(sc1.hasNext()) {
			//Scanner.next() - ���� �ϳ��� ���� String Ÿ������ ������
			System.out.println(sc1.next());
		}
		while(sc2.hasNextInt()) {
			System.out.println(sc2.nextInt());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
