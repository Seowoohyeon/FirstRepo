
public class B12_SwapValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c;
		System.out.printf("a : %d, b : %d \n", a, b);
		
		//c�� a�� ��� ����
		c = a;
		// a�� b�� ����
		a = b;
		//�Ʊ���س��� a���� b�� ����
		b = c;
		
		System.out.printf("a : %d, b : %d", a, b);
	}

}
