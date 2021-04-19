
public class D03_WrapperClass {
	/*
	 	# WrapperClass
	 	  - �⺻ Ÿ�Ե��� ������ Ÿ������ ����ϱ� ���� Ŭ����
	 	  - �� Ÿ�Ե鿡 ���� ������ ��ɵ��� ���ִ�
	 	
	 	# �⺻�� �̸�
	 	  - byte, short, char, int, long....
	 	  
	 	# ������ �̸�
	 	  - Byte, Short, Character, Integer....
	 */
	public static void main(String[] args) {
		int a = 10;
		Integer i = Integer.valueOf(10);
		/*
		  # parse �ø���
	        -���ڿ��� ���ϴ� Ÿ������ ��ȯ��Ű�� ���
		    - �� Ÿ�Կ� ����ƽ �޼���� �����Ѵ�
		    - �����͸� �ְ� �������� ��� ���ڿ��� ��ȯ�Ͽ� ���۵´� ��찡 ����
		    - �ٽ� ����ϱ� ���ؼ��� ���� �����͸� ������ Ÿ�Ը��� �ǵ����� �Ѵ�
		    - radix�� �����ִ� �����ε��� ������ �ǹ��Ѵ�
		*/
		try {
			int a1 = Integer.parseInt("12314BC", 16);
			System.out.println(a1);
		} catch (NumberFormatException e) {
			System.out.println("Int�� ��ȯ�� �� ���� ���ڿ��̾����ϴ�");
		}
		
		System.out.printf("%.9f\n",Double.parseDouble("1231.212134124"));
		System.out.println(Boolean.parseBoolean("tRue"));
		System.out.println(Boolean.parseBoolean("yes"));
		
		/*
		 	# toString()
		 	  - �ش� Ÿ���� ���� �ս��� ���ڿ��� ��ȯ�� �� �ִ�
		 	  - toString()�� Object�� �޼����̱� ������ ��� Ŭ������ �������
		 	  - �ν��Ͻ� �޼��� toString()�� �ش� �ν��Ͻ� ���� ���ڿ��� ��ȯ�Ѵ�
		 	  - ����ƽ �޼��� toString()�� ������ ���� ���ڿ��� ��ȯ�Ѵ�
		 */
		
		System.out.println(Integer.toString(1242341, 2));
		System.out.println(Integer.toString(1242341, 8));
		System.out.println(Integer.toString(1242341)); // radix default 10
		System.out.println(Integer.toString(1242341, 16));
		
		/*
		 	# typeValue() �ø���
		 	  - �ش� �ν��Ͻ� ���� ���ϴ� �⺻�� Ÿ���� ������ �ս��� �����ϴ� �޼���
		 	  - Ÿ��ĳ������ ������ ����
		 */
		
		Integer num = 1000000002;
		System.out.println(num.byteValue());
		System.out.println(num.shortValue());
		System.out.println(num.longValue());
		System.out.println(num.floatValue());
		System.out.println(num.doubleValue());
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
