
public class A03_VarTypes {

	public static void main(String[] args) {
		
		/*
		  
		 	���� Ÿ��
		 		- byte  (1byte)
		 		1byte => 8bit
		 		0000 0000 (0) ~ 1111 1111 (255)
		 		# ù ��° bit�� ��ȣ ��Ʈ�� ���ȴ�
		 		byte Ÿ���� ��� ���� 0000 0000 (0) ~ 0111 1111 (127)
		 		byte Ÿ���� ��� ���� 1000 0000 (-128) ~ 1111 1111 (-1) 
		 		
		 		- short (2byte, signed)
		 		���  0 ~ 32767 
		 		���� -32768 ~ -1
		 		
		 		- char  (2byte, unsigned)
		 		��ȣ�� ���� ������ 0 ~ 65535�� ����� ������ �� �ִ� Ÿ��
		 		�ַ� ���� �ڵ带 �����ϴµ��� ����Ѵ� (����Ÿ��)
		 		
		 		- int   (4byte)
		 		���  0 ~ 21.5 ��
		 		����  -21.5�� ~ -1
		 		
		 		- long  (8byte)
		 	
		 	�Ǽ� Ÿ��
		 		- float(4)
		 		- double(8)
		 	
		 	boolean Ÿ��
		 		- true
		 		- false
		 		
		 	������ Ÿ��(Ŭ���� Ÿ��)
		  		������ Ÿ���� �빮�ڷ� �����Ѵ�.
		  		- String : ���ڿ�
		  		- �� �� ��� Ŭ������..
		 */
		//������ Ÿ��
		String helloMessage = "Hello";
		//����Ÿ��
		long _Long = 2_147_483_648l;
		//�Ǽ�Ÿ��
		float weight = 65.66f;
		double height = 177.77;
		//booleanŸ��
		boolean hasfood = true;
		boolean over130cm = false;
	}

}
