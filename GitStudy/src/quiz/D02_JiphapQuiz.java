package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class D02_JiphapQuiz {
	
	// 1. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� SetŸ������ ��ȯ�ϴ� �޼���
	// 2. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� SetŸ������
	// 3. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� SetŸ������
	// �ҹ��ڷ� �����ϴ� Ÿ�Ե���(�⺻��)�� �ŰԺ����� ������ �� ���� �����Ͽ� �����Ѵ� 
	// �빮�ڷ� �����ϴ� Ÿ�Ե�(������)�� �Ű������� ������ �� �ּҸ� �����Ͽ� �����Ѵ�
	
	public static boolean union(Set arrays1, Set arrays2) {
		arrays1.add(1);
		arrays1.add(2);
		arrays1.add(3);
		
		arrays2.add(2);
		arrays2.add(4);
		arrays2.add(5);
		return arrays1.addAll(arrays2);
	}
	
	public static boolean difference(Set arrays1, Set arrays2) {
		arrays1.add(1);
		arrays1.add(2);
		arrays1.add(3);
		
		arrays2.add(2);
		arrays2.add(4);
		arrays2.add(5);
		return arrays1.removeAll(arrays2);
	}
	
	public static boolean inter(Set arrays1, Set arrays2) {
		arrays1.add(1);
		arrays1.add(2);
		arrays1.add(3);
		
		arrays2.add(2);
		arrays2.add(4);
		arrays2.add(5);
		return arrays1.retainAll(arrays2);
	}
	
	public static void main(String[] args) {
		// �빮�ڷ� �����ϴ� Ÿ�Ե�(������)�� �Ű������� ������ �� �ּҸ� �����Ͽ� �����Ѵ�
		Set<Integer> arrays1 = new HashSet<Integer>();
		Set<Integer> arrays2 = new HashSet<Integer>();
		
		//��
		System.out.println(union(arrays1, arrays2));
		System.out.println("������ : " + arrays1);
		//��
		System.out.println(difference(arrays1, arrays2));
		System.out.println("������ : " + arrays1);
		//��
		System.out.println(inter(arrays1, arrays2));
		System.out.println("������ : " + arrays1);
		
	}
	
	
	
	
}
