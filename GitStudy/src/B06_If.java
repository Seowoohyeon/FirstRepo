
public class B06_If {

	public static void main(String[] args) {	
		/*
		  if ��
		  	- ()��ȣ �ȿ� ���� ���� �� {}�ȿ� ������ �����Ѵ�
		  	- ()��ȣ �ȿ� ���� ������ �� {}�ȿ� ������ �����Ѵ�
		  	
		  	
		*/
		char a = 'A';
		if(a >= 0xAC00 && a <= 0xD7FB) {
			System.out.println("�ѱ���");
		} else if(a >= 0x3041 && a <= 0x3096) {
			System.out.println("�Ϻ���"); 	
		} else {
			System.out.println("��������");
		}
				
	}

}
