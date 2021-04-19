package quiz;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class D07_PhoneBook_Ver2 {
	
	public static class PhoneInfo {
		String name;
		String address;
		String number;
		String image;
	}
	
	HashMap<String, HashMap<String, String>> phonebook;
	
	public D07_PhoneBook_Ver2() {

		
		phonebook = new HashMap<>();
		
		phonebook.put("�̺з�", new HashMap<>());
		phonebook.put("����", new HashMap<>());
		phonebook.put("ģ��", new HashMap<>());
		phonebook.put("����", new HashMap<>());
		
		phonebook.get("����").put("010-1234-1234", "����");
	}
	
	public boolean addG(String groupName) {
		if(phonebook.containsKey(groupName)) {
			System.out.println("�̹� �����ϴ� �׷� �Դϴ� : " + groupName);
			return false;
		} else {
			System.out.println("���������� �߰� �Ǿ����ϴ� : " + groupName);
			phonebook.put(groupName, new HashMap<>());
			return true;
		}
	}
	
	public void printGroupList() {
		for(String groupName : phonebook.keySet()) {
			System.out.printf("#### %s ####\n", groupName);
		}
	}
	
	public boolean addNum(String groupName, String phoneNum, String name) {
		
		// phonebook - ���� �׷��� ������ �� �ִ� ��ü ��ȭ��ȣ�� �ν��Ͻ�
		// phonebook.keySet() : �׷���(����, ����, ģ��....)
		// phonebook.values() : �׷���� Ű������ ��� ������ �� �ִ� �׷� �ؽ��� �ν��Ͻ�
		
		for(HashMap<String, String> group : phonebook.values()) {
			if (group.containsKey(phoneNum)) {
				System.out.println("�̹� ��ϵ� ��ȣ �Դϴ�");
				return false;
			}
		}
		
		if (phonebook.containsKey(groupName)) {
			phonebook.get(groupName).put(phoneNum, name);
		} else {
			phonebook.get("�̺з�").put(phoneNum, name);
		}
		return true;
	}
	
	public void printPhoneBook() {
		// Ʈ������ �̿��ϸ� Ű���� ������� ���İ���
		for(String groupName : new TreeSet<>(phonebook.keySet())) {
			System.out.printf("---- %s ----\n", groupName);
			HashMap<String, String> group = phonebook.get(groupName);
			
			/*
			 	# Ʈ������ �ΰ��� ������
			 	  1 ���� ������ ���ϸ鼭 �ν��Ͻ��� ����
			 	  2 �÷����� ���� (���� ������ �����ϴ� �÷����� ���׸� Ÿ�� Comparble�� ���)
			 */
			TreeSet<Entry<String, String>> sortedSet = new TreeSet<>(new Comparator<Entry<String, String>>() {
				@Override
				public int compare(Entry<String, String> o1, Entry<String, String> o2) {
					int value_diff = o1.getValue().compareTo(o2.getValue());
					
					if(value_diff == 0) {
						return o1.getKey().compareTo(o2.getKey());
					} else {
						return value_diff;
					}
				}
			});
			
			sortedSet.addAll(group.entrySet());
			for(Entry<String, String> entry  : sortedSet) {
				System.out.printf("%s : %s\n", entry.getValue(), entry.getKey());
			}
		}
	}
	
	public static void main(String[] args) {
		D07_PhoneBook_Ver2 book = new D07_PhoneBook_Ver2();
	/*	Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�׷� �̸��� �Է�  >> ");
			book.addG(sc.nextLine());
			
			book.printGroupList();
		}  */
		
		book.addG("����");
		book.addG("����");
		book.addG("ģ��");
		book.addG("��ȣȸ");
		
		
		book.printGroupList();
		
		book.addNum(null, "010-154-1545", "�߼���");
		book.addNum(null, "010-154-1245", "������");
		book.addNum(null, "010-154-1345", "���ż�");
		book.addNum(null, "010-154-1655", "������");
		
		book.printPhoneBook();
		
	}
	
	
	
	
	
	
	
	
}
