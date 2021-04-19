

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_HashSet {
	/*
	 * 	# Set
	 * 		- ������ �����س��� Ŭ����
	 * 		- ��ҷ� ���� ���� ������ ���� ������� �ʴ´�
	 * 
	 * 	# Hash
	 * 		- � ���� ���� �� ���� ������ �� ���� ���� �����Ǿ�� �ϴ� �˰���
	 * 		- ���� ���� �־��� ���� �׻� ������ ���� ���;� �Ѵ�
	 * 		- ������ ���� �־��� ���� �����ϱ� ���� ���� �ٸ� ���� ���´�
	 * 		- ������ �ؽ������� ���� ���� ã�� ���� �Ұ����ؾ� �Ѵ�
	 * 		- �ٽ� ���� ������ ���ư� ���� ���� �ܹ��⼺ �˰���
	 * 		- �ߺ� üũ�� �� �� �پ ������ ���� ���� ����
	 * 
	 * 	# �ؽ��� ����ϴ� �˰����� ����(�ε���)�� ����
	 * 
	 * 	example 
	 * 		# MD5
	 * 			hello 	-> AF5597C29467A96523A70787C319F4DB
	 			hello1	-> 1299118129AC98235697727158DEF400
	 		# SHA256
	 			hello	-> 2CF24DBA5FB0A30E26E83B2AC5B9E29E1B161E5C1FA7425E73043362938B9824
	 			hello1	-> 91E9240F415223982EDC345532630710E94A7F52CD5F48F5EE1AFC555078F0AB
	 */
	
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		
		numbers.add(100);
		numbers.add(100);
		numbers.add(100);
		numbers.add(100);
		numbers.add(100);
		
		System.out.println(numbers);
		
		// ���� �÷��� �������̽��̱� ������ ArrayList�� �ִ� �޼������ ���⿡�� �ִ�
		if(numbers.remove(100)) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}
			
			System.out.println(numbers);
			
			// # �̸��� �ؽ��� �� �˰������ ������ ����
			HashSet<String> english = new HashSet<>();
			
			english.add("apple");
			english.add("airplane");
			english.add("bio");
			english.add("drama");
			english.add("cat");
			
			System.out.println(english);
			
			//Set�� �ε����� ���� ������ for - each�� ����� �� �ִ�
			for(String word : english) {
				System.out.println(word);
			}
			
			// �÷��� ������ ��ȯ�� �����Ӵ�
			// - Set�� ������ �����ؾ� �Ѵٸ� List�� ��ȯ�Ͽ� �����Ѵ�
			// - List�� ����� �� �ߺ��� ������ ����� �ʿ��ϴٸ� Set���� ��ȯ�Ͽ� ����Ѵ�
			ArrayList<String> english_list = new ArrayList<>(english);
			Collections.sort(english_list); // sort�� ��������
			System.out.println(english_list);
			
			ArrayList<Integer> numbers2 = new ArrayList<>();
			
			
			numbers2.add(1);
			numbers2.add(1);
			numbers2.add(1);
			numbers2.add(3);
			numbers2.add(6);
			numbers2.add(6);
			numbers2.add(6);
			numbers2.add(13);
			numbers2.add(14);
			
			System.out.println(numbers2);
			System.out.println(new HashSet<>(numbers2));// �ߺ� ����!
			
			// # �÷��ǵ��� �迭�� ��ȯ�ϱ�
			Object[] arr1 = english.toArray();// 1�� ��� : Object[]�� ����
			
			String[] arr2 = new String[english.size()]; // 2�� ��� : �̸� ������ �迭�� ����
			english.toArray(arr2);
			
			System.out.println("Object[]�� ��ȯ�� english : " + Arrays.toString(arr1));
			System.out.println("�迭�� ��ȯ�� english : " + Arrays.toString(arr2));
			
		// ���׸��� �䱸�ϴ� Ŭ������ ���׸��� ������� �ʴ� ��� ��� Ÿ���� ���� �� �ִ�
			// - ��� Ÿ���� Object Ÿ������ ��ĳ���� �Ǿ� ����ȴ�
			// - �ش� ���� �ٽ� ����� ����ϱ� ���ؼ��� �ٿ�ĳ������ �ʿ��ؼ� ���ŷӴ�
			ArrayList numbers3 = new ArrayList(); 
			
			numbers3.add("ȫ�浿");
			numbers3.add('A');
			numbers3.add(123.123);
			numbers3.add(333);
			
			//String str = (String) numbers3.get(3); //������ �����δ� ��������
			
			
			// contains() : �÷��ǿ� �ش� ��Ұ� ���ԵǾ� �ִ��� ���θ� ��ȯ
			System.out.println(english.contains("apple"));
			System.out.println(english.contains("banana"));
			
			System.out.println(english_list.contains("apple"));
			System.out.println(english_list.contains("banana"));
			
			
			// containsAll(Collection) : ������ �÷����� '���' ���ԵǾ� �ִ����� �˻�
			Set<String> subset = new HashSet<>();
			List<String> sublist = new ArrayList<>();
			
			subset.add("zebra");
			subset.add("drama");
			
			sublist.add("apple");
			
			System.out.println("english���� subset�� ��� ������ ����ֳ���??"
					+ english.containsAll(subset));
			System.out.println("english���� sublist�� ��� ������ ����ֳ���??"
					+ english.containsAll(sublist));
			
			// addAll(Collection) : ������ �÷����� ������ ��� �߰� (�߰� ���� ���θ� ��ȯ)
			// - ���� �߰��� ���� ������ true
			// - �̹� ��� ���Ե� ��쿡�� false�� ��ȯ
			System.out.println(english.addAll(subset));
			System.out.println(english.addAll(subset));
			System.out.println(english.addAll(subset));
			
			// # removeAll(Collection) : ������ �÷��ǰ� ���� ������ ��� ����
			// - �������� ������ true ������ false
			System.out.println(english_list.removeAll(subset));	
			System.out.println(english_list);
			
			// # retainAll(Collection) : ������ �÷��ǰ� ��ġ�� ���븸 �����
			// - ���Ѱ��� ������ true ������ false
			english.retainAll(subset);
			System.out.println(english);
			
			// # isEmpty() : �ش� �÷����� ��� ������ true
			System.out.println(english.isEmpty());
		}
	}















