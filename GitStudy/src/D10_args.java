

public class D10_args {
	
	// main �޼��� ù ��° �Ű�����(args)�� ����
			
	/*		- ���α׷� ���� �� ����ڰ� ������ �ɼ��� main�� ù ��° �Ű������� �޴´�
	 * 		- ����ڰ� ������ �ɼǿ� ���� �ٸ��� �����ϴ� ���α׷��� ���� �� �ִ�
	 * 		-
	 */
	
	public static void main(String[] args) {
		
		System.out.println("args.length : " + args.length);
		
		boolean apple = false;
		
		if(args[0].equals("apple")) {
			System.out.println("��� ���� �����");
			apple = true;
		}
		System.out.println("���α׷� ����");
	}

}
