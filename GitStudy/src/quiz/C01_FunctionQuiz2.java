package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz2 {
	/*
        # ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����2                 
            
         1. �ִ밪�� �Ű������� ���� ������
            0���� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
            range �Լ��� �������� (�ִ밪 �̸�)
            
            ex: range(10)�� ��� -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
            
         2. �ּҰ��� �ִ밪�� �Ű������� ������ 
                     �� ���̿� �����ϴ� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ� 
            range �Լ��� �������� (�ּҰ� �̻�, �ִ밪 �̸�)
            
            ex: range(5, 10)�� ��� -> [5, 6, 7, 8, 9]
            
         3. �ּҰ��� �ִ밪�� �������� �Ű������� ������ 
                     �ּҰ����� �����Ͽ� �ִ밪���� ��������ŭ �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
            range �Լ��� �������� (�ּҰ� �̻�, �ִ밪 �̸�)
            
            ex: range(50, 56, 5)�� ��� -> [50, 55]
                range(50, 55, 5)�� ��� -> [50]

	 */
	
	// 1
	public static int[] range(int num) {
		int range[] = new int[num];
		for (int i = 0; i < num; i++) {
			range[i] = i;
		}
		return range;
	}
	
	// 2
	// �Ű������� ���� Ȥ�� Ÿ���� �ٸ��� ���� �Լ����� ����� �� �ִ�
	// �Լ��� �����ε�
	public static int[] range(int start ,int end) {
		if(start >= end) {
			return null; // �߸��� ���� �� �������� �Լ��� ������ �����Ű��
		}
		
		int bound[] = new int[end - start];
		for (int i = 0, num = start; i < bound.length; i++, num++) {
			bound[i] = num;
		}
		return bound;
	}
	
	// 3
	public static int[] range(int start ,int end, int increment) {
		int len = (int) Math.ceil((end - start) / (double)increment);
		int[] bound = new int[len];
		
		for (int i = 0, num = start; i < bound.length; i++, num += increment) {
			bound[i] = start;
			start += increment;
		}
		return bound;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(range(10)));
		System.out.println(range(10)[3]);
		
		System.out.println(Arrays.toString(range(10, 20)));
		System.out.println(Arrays.toString(range(25, 10)));
		
		System.out.println(Arrays.toString(range(50, 56, 5)));
	}

}
