
public class B14_InnerLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�ݺ��� ���ο� �ݺ��� ����ϱ�
		
	/*	for (int i = 0; i < 10; i++) {
			System.out.printf("=========================== �ٱ��� �ݺ��� %d \n", i);
			for (int j = 0; j < 8; j++) {
				System.out.printf("------------ ���� �ݺ��� %d-%d\n", i,j);
				for (int k = 0; k < 3; k++) {
					System.out.printf("++++++++ ���� ���� �ݺ��� %d-%d-%d \n", i,j,k);	
				}
			}
		} */
		
		for (int i = 2; i <= 9; i++) {
			System.out.printf("%d�� : ", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d ", i,j, i*j);
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
