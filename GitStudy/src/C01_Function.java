
public class C01_Function {
	
	public static void print_rabbit() {
		
			System.out.println(" /)/) ");
			System.out.println("(  ..)");
			System.out.println("(   >$");
	}
	
	// �ݰ��� ������ �ٱ����� ũ�⸦ ���� �ϸ� �ʿ��� �ٱ����� ������ �˷��ִ� �Լ�
	
	// int : �� �Լ��� ���� ����� Ÿ�� = returnŸ��
	// name(int a, int b) 
	//      : �� �Լ��� ������ �� intŸ�� ���� �� �� ���� �޵��� ���� 
	public static int apple_basket(int apple, int size) {
		int result;
		if(apple % size == 0) {
			result = apple /size ;
		} else {
			result = apple / size + 1;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	�Լ�(Function)(Method)
		 	 - ����� �̸� �����صΰ� ���߿� ������ ���� ��
			 - �����ص� �Լ� �̸� �ڿ� ()�� �s���� �Լ��� ȣ���ϸ� ȣ���� �ڸ��� �Լ��� ���� ����� ��ȯ�ȴ�
			 - �Լ��� ������ �� �ش� �Լ��� ��ȯ�� ���� Ÿ���� �տ� ����д�
			 - �ڹٿ��� �Լ��� �ݵ�� Ŭ���� ���ο� �����ؾ� �Ѵ�
		*/
			print_rabbit();
	
			int basket = apple_basket(133, 10);
			System.out.println("�ٱ��� ���� : " + basket);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
