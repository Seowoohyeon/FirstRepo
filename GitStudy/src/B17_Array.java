
public class B17_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		  	# �迭
		  	  - ���� Ÿ�� ������ �ѹ��� ������ �����ϴ� ���
		  	  - ���� �̸����� ������ ������ ������ �� �ε����� Ȱ���� �����Ѵ�
		  	  - �迭�� �ѹ� ũ�Ⱑ �������� ũ�⸦ ������ �� ����
		  	  - �迭�� ���ϰ� ���ÿ� �ʱ�ȭ�� �Ǿ��ִ�
		*/
		int[] a = new int[100];
		
		/*for (int i = 0; i < 100; i++) {
			a[i] = (int)(Math.random() * 101);
		}
		System.out.println(a.length);*/
		
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < 100; i++) {
			a[i] = (int)(Math.random() * 101);
		}
		for(int i = 0; i < 100; i++) {
			sum += a[i];
			avg = sum / a.length;
		}
		System.out.println(sum);
		System.out.printf("%.2f", avg);
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.printf("%d , %.2f\n", sum, sum/ (double)a.length);
		
		
		/*
		  	# �迭�� �����ϴ� ���
		  		1. Ÿ��[] �迭�̸�  = new Ÿ��[�迭ũ��];
		  		2. Ÿ��[] �迭�̸� = {��1, ��2, ...};
		*/
		
		
		char[] g = new char[50];
		int[] age = {10,20,30,40,50,80};
		boolean[] pass = {true, false, true, false};
		String[] an = new String[] {"lion", "tiger", "penguin"};
		
		System.out.println(an[0]);
		
		if(pass[1]) {
			System.out.println("4���� : ���հ�");
		}
		for (int i = 0; i < g.length; i++) {
			System.out.println((int)g[i]);
		}
		
		// String�� char�� �迭�� ��ȯ�� �� �ִ�
		char[] mg1 = new char[] {'h','e','l','l','o'};
		String mg2 = "hello";
		
		char[] mg3 = mg2.toCharArray();
		
		System.out.println(mg3[0]);
		System.out.println(mg3[1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
