
public class B11_For {

	public static void main(String[] args) {
		
		/*
			�ݺ���
			  - for, while, do-while ...
			  - �Ȱ��� �ڵ带 ������ �ݺ��ϰ� ���� �� ����Ѵ�
			  
			  - for(�ʱ�ȭ; ����; ������;) {
			  		������ ���� ���� �ݺ��� ��ɾ��
			    }
		*/
		
		// 1. ���� �⺻���� ����(���ϴ� Ƚ����ŭ �ݺ��ϱ� ���� ����)
			// - �ʱⰪ 0�� �ְ� ���ǿ��� �ݺ��ϰ� ���� Ƚ��
			// - �߰��� 1��
	/*	for(int i = 0; i <= 10; i++) {
			//System.out.println("Hello " + i);
		}
		
		// 2. �ʱⰪ, ������, ������ ������� ���� ����
		for(int i = 70; i < 555; i += 10) {
			System.out.println("Hello " + i);
		}
		for(int i = 9000; i >= 0; i -= 100) {
			System.out.println(i);
		}
		
		// 3. �ʱⰪ�� �������� ��ġ�� ������� ���� ����
		int x = 0;
		for(;x < 10;) {
			System.out.println("3. " + x++);
		}  */
		
		// ������ �ڽ��� ���� �߰�ȣ�� ����� �״´� (������ �����ֱ�)
		
		// 4. �ݺ��� ���ο� �ٸ� �����鵵 �����Ӱ� ����� �� �ִ�
		
		for(int month = 1; month <= 16; month++) {
			switch(month) {
			case 3: case 4: case 5:
				System.out.println("��");
			 break;
			case 6: case 7: case 8:
				System.out.println("����");
			 break;
			case 9: case 10: case 11:
				System.out.println("����");
			 break;
			case 12: case 1: case 2:
				System.out.println("�ܿ�");
				break;
			default:
				System.out.println("��������");
				break;
			
			}
		}
		
		// 5. ������ ��������� ���ѹݺ��Ѵ�
		//  - �ݺ����� ���ϴ� Ÿ�ֿ̹� break���� ���� Ż���� �� �ִ�
		int count = 0;
		
		
		for(;;) {
			System.out.println("go " + count++);
			if(count == 7) {
				break;
			}
		}
		
		// 6. �ݺ��� ���ο��� continue�� ������ �ٷ� ������ �ݺ����� �Ѿ��
		
		/*for(int i = 1; i <= 50; i++) {
			System.out.printf("%02d ", i);
			if(i % 10 != 0) {
				continue;
			}
			System.out.println();
						
		}*/
		
		
		 for(int i = 5000; i>100; i--){
			 if(i % 2 == 0) {
				continue;
			 }
			 System.out.println(i);
		 }
		
		/* 7. �ݺ������� ���� ���ϱ�
		 	 - �ݺ��� �ٱ��ʿ� ������ ������ ������ �ϳ� ������ 0���� �ʱ�ȭ
		 	 - �ݺ����� �����ϸ鼭 �ش� ������ ���� ������Ų��
		 	 
		*/
		 // 80 ~ 333 3�� ����� ������ ���غ���
		int sum = 0;
		for(int i = 80; i <=333; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
