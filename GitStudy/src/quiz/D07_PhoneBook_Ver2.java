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
		
		phonebook.put("미분류", new HashMap<>());
		phonebook.put("가족", new HashMap<>());
		phonebook.put("친구", new HashMap<>());
		phonebook.put("직장", new HashMap<>());
		
		phonebook.get("가족").put("010-1234-1234", "엄마");
	}
	
	public boolean addG(String groupName) {
		if(phonebook.containsKey(groupName)) {
			System.out.println("이미 존재하는 그룹 입니다 : " + groupName);
			return false;
		} else {
			System.out.println("성공적으로 추가 되었습니다 : " + groupName);
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
		
		// phonebook - 여러 그룹을 저장할 수 있는 전체 전화번호부 인스턴스
		// phonebook.keySet() : 그룹명들(가족, 직장, 친구....)
		// phonebook.values() : 그룹명을 키값으로 삼아 접근할 수 있는 그룹 해쉬맵 인스턴스
		
		for(HashMap<String, String> group : phonebook.values()) {
			if (group.containsKey(phoneNum)) {
				System.out.println("이미 등록된 번호 입니다");
				return false;
			}
		}
		
		if (phonebook.containsKey(groupName)) {
			phonebook.get(groupName).put(phoneNum, name);
		} else {
			phonebook.get("미분류").put(phoneNum, name);
		}
		return true;
	}
	
	public void printPhoneBook() {
		// 트리셋을 이용하면 키들을 순선대로 정렬가능
		for(String groupName : new TreeSet<>(phonebook.keySet())) {
			System.out.printf("---- %s ----\n", groupName);
			HashMap<String, String> group = phonebook.get(groupName);
			
			/*
			 	# 트리셋의 두가지 생성자
			 	  1 정렬 기준을 정하면서 인스턴스를 생성
			 	  2 컬렉션을 전달 (정렬 기준은 전달하는 컬렉션의 제네릭 타입 Comparble을 사용)
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
			System.out.println("그룹 이름을 입력  >> ");
			book.addG(sc.nextLine());
			
			book.printGroupList();
		}  */
		
		book.addG("가족");
		book.addG("직장");
		book.addG("친구");
		book.addG("동호회");
		
		
		book.printGroupList();
		
		book.addNum(null, "010-154-1545", "추성훈");
		book.addNum(null, "010-154-1245", "김장훈");
		book.addNum(null, "010-154-1345", "나신수");
		book.addNum(null, "010-154-1655", "마동석");
		
		book.printPhoneBook();
		
	}
	
	
	
	
	
	
	
	
}
