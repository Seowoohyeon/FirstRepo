
public class B08_Switch {

	public static void main(String[] args) {
		/*
		  	switch ~ case
		  		- ��ȣ�ȿ� ���� ����� ���� ������ �ڵ带 ����
		  		- ��ȣ�ȿ� boolean Ÿ�� x
		  		- break�� ���������� �������� ���  case�� �����Ŵ
		  
		*/
		
		int a = 10;
		switch(a % 2) {
		case 0:
			System.out.println("a�� ¦��");
			break;
		case 1:
			System.out.println("a�� Ȧ��");
			break;
		}
		
		char grade  = 'A';
		
		switch(grade) {
		case 'E':
			System.out.println("��ü ������ �Դϴ�");
			break;
		case 'K':
			System.out.println("12�� �̻� ������ �Դϴ�");
			break;
		case 'Y':
			System.out.println("15�� �̻� ������ �Դϴ�");
			break;
		case 'A':
			System.out.println("19�� �̻� ������ �Դϴ�");
			break;
			}
		
		
		
		
		
		
		
		
		
		
		
	}

}
