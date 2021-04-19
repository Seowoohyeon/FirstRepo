import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class D01_ArrayList {
	
	/*
	 	# Java Collections
	 	  
	 	  - �ڹٿ��� �⺻������ �����ϴ� �ڷᱸ�� �������̽�
	 	
	 	  - Collection �������̽��� ��ӹ��� �������̽��δ� List, Set�� �ִ�
	 	
	 	# java.utill.ArrayList
	 	
	 	  - �迭�� �ٸ��� ũ�Ⱑ �ڵ����� �����Ǵ� �ڷᱸ�� Ŭ����
	 	  - �迭�� ������ �����̴�
	 	  - ���������� ��� �����Ϳ� �����ؾ� �� �� ���� �����ϴ�
	 	  	
	 */
	public static void main(String[] args) {
		
		// Ÿ���� �����ϸ� ArrayList ����ϱ�
		//  - Ÿ���� ������ �� ����ϴ� <>�� ���׸�(Generic)�̶�� �θ���
		//  - ���׸����� �⺻�� Ÿ���� ����� �� ���� (�⺻ Ÿ���� WrapperClass �̿�)
		ArrayList<String> fruits = new ArrayList<>();
		ArrayList<Integer> numbers = new ArrayList<>();
		
		// add(item) : ����Ʈ�� ���ϴ� �����͸� ���������� �� �ڿ� �߰��Ѵ�
		fruits.add("apple");
		fruits.add("kiwi");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("kiwi");
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		// add(index, item) : ����Ʈ�� ���ϴ� ��ġ�� �����͸� �ִ´�
		fruits.add(2, "orange");
		fruits.add(2, "peach");
		fruits.add(2, "grape");
		
		System.out.println(fruits);
		System.out.println(numbers);
		
		// get(index) : ���ϴ� ����Ʈ���� ���ϴ� �ε����� �����͸��ϳ� ������
		System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));
		System.out.println(fruits.get(2));
		System.out.println(fruits.get(3));
		
		// size() : �ش� �÷����� ũ�⸦ ��ȯ�Ѵ�
		System.out.println("Fruits ũ�� : "+fruits.size());
		System.out.println("Numbers ũ�� :  "+numbers.size());
		
		// remove(index) : �ش� ������ �����͸� �����Ѵ�. ��� ���� �����͸� ��ȯ�Ѵ�
		String del = fruits.remove(3);
		System.out.println("���� �� : " + fruits);
		System.out.println("������ �� : " + del);
		
		// remove(item) : �ش� �����͸� ����
		if (fruits.remove("strawberry")){
			System.out.println("���� ����");
		} else {
			System.out.println("�׷��� ����");
		}
		
		// ����
		Collections.sort(fruits);
		System.out.println(fruits);
		
		//�迭 ���� (��������)
		int[] aa = {1,2,5,8,3,4};
		Arrays.sort(aa);
		System.out.println(Arrays.toString(aa));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
