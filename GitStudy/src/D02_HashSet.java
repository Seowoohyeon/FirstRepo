

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_HashSet {
	/*
	 * 	# Set
	 * 		- 집합을 구현해놓은 클래스
	 * 		- 요소로 같은 값이 들어오는 것을 허용하지 않는다
	 * 
	 * 	# Hash
	 * 		- 어떤 값을 넣을 시 전혀 예측할 수 없는 값이 생성되어야 하는 알고리즘
	 * 		- 같은 값을 넣었을 때는 항상 일정한 값이 나와야 한다
	 * 		- 유사한 값을 넣었을 때도 예측하기 힘든 전혀 다른 값이 나온다
	 * 		- 생성된 해쉬값으로 원래 값을 찾는 것이 불가능해야 한다
	 * 		- 다시 원래 값으로 돌아갈 수도 없는 단방향성 알고리즘
	 * 		- 중복 체크를 할 때 뛰어난 성능을 보여 많이 사용됨
	 * 
	 * 	# 해쉬를 사용하는 알고리즘은 순서(인덱스)가 없다
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
		
		// 같은 컬렉션 인터페이스이기 때문에 ArrayList에 있는 메서드들이 여기에도 있다
		if(numbers.remove(100)) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}
			
			System.out.println(numbers);
			
			// # 이름에 해쉬가 들어간 알고리즘들은 순서가 없다
			HashSet<String> english = new HashSet<>();
			
			english.add("apple");
			english.add("airplane");
			english.add("bio");
			english.add("drama");
			english.add("cat");
			
			System.out.println(english);
			
			//Set은 인덱스가 없기 때문에 for - each만 사용할 수 있다
			for(String word : english) {
				System.out.println(word);
			}
			
			// 컬렉션 끼리는 변환이 자유롭다
			// - Set의 내용을 정렬해야 한다면 List로 변환하여 정렬한다
			// - List의 내용들 중 중복을 제거한 목록이 필요하다면 Set으로 변환하여 사용한다
			ArrayList<String> english_list = new ArrayList<>(english);
			Collections.sort(english_list); // sort는 내림차순
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
			System.out.println(new HashSet<>(numbers2));// 중복 제거!
			
			// # 컬렉션들을 배열로 변환하기
			Object[] arr1 = english.toArray();// 1번 방법 : Object[]을 생성
			
			String[] arr2 = new String[english.size()]; // 2번 방법 : 미리 만들어둔 배열을 전달
			english.toArray(arr2);
			
			System.out.println("Object[]로 변환된 english : " + Arrays.toString(arr1));
			System.out.println("배열로 변환된 english : " + Arrays.toString(arr2));
			
		// 제네릭을 요구하는 클래스에 제네릭을 사용하지 않는 경우 모든 타입을 넣을 수 있다
			// - 모든 타입이 Object 타입으로 업캐스팅 되어 저장된다
			// - 해당 값을 다시 제대로 사용하기 위해서는 다운캐스팅이 필요해서 번거롭다
			ArrayList numbers3 = new ArrayList(); 
			
			numbers3.add("홍길동");
			numbers3.add('A');
			numbers3.add(123.123);
			numbers3.add(333);
			
			//String str = (String) numbers3.get(3); //컴파일 상으로는 문제없음
			
			
			// contains() : 컬렉션에 해당 요소가 포함되어 있는지 여부를 반환
			System.out.println(english.contains("apple"));
			System.out.println(english.contains("banana"));
			
			System.out.println(english_list.contains("apple"));
			System.out.println(english_list.contains("banana"));
			
			
			// containsAll(Collection) : 전달한 컬렉션이 '모두' 포함되어 있는지를 검사
			Set<String> subset = new HashSet<>();
			List<String> sublist = new ArrayList<>();
			
			subset.add("zebra");
			subset.add("drama");
			
			sublist.add("apple");
			
			System.out.println("english에는 subset의 모든 내용이 들어있나요??"
					+ english.containsAll(subset));
			System.out.println("english에는 sublist의 모든 내용이 들어있나요??"
					+ english.containsAll(sublist));
			
			// addAll(Collection) : 전달한 컬렉션의 내용을 모두 추가 (추가 성공 여부를 반환)
			// - 새로 추가된 것이 있으면 true
			// - 이미 모두 포함된 경우에는 false를 반환
			System.out.println(english.addAll(subset));
			System.out.println(english.addAll(subset));
			System.out.println(english.addAll(subset));
			
			// # removeAll(Collection) : 전달한 컬렉션과 같은 내용을 모두 제거
			// - 지워진게 있으면 true 없으면 false
			System.out.println(english_list.removeAll(subset));	
			System.out.println(english_list);
			
			// # retainAll(Collection) : 전달한 컬렉션과 일치한 내용만 남긴다
			// - 변한것이 있으면 true 없으면 false
			english.retainAll(subset);
			System.out.println(english);
			
			// # isEmpty() : 해당 컬렉션이 비어 있으면 true
			System.out.println(english.isEmpty());
		}
	}















