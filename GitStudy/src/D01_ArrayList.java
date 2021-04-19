import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class D01_ArrayList {
	
	/*
	 	# Java Collections
	 	  
	 	  - 자바에서 기본적으로 제공하는 자료구조 인터패이스
	 	
	 	  - Collection 인터페이스를 상속받은 인터페이스로는 List, Set이 있다
	 	
	 	# java.utill.ArrayList
	 	
	 	  - 배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스
	 	  - 배열과 유사한 형태이다
	 	  - 순차적으로 모든 데이터에 접근해야 할 때 가장 유리하다
	 	  	
	 */
	public static void main(String[] args) {
		
		// 타입을 지정하며 ArrayList 사용하기
		//  - 타입을 지정할 때 사용하는 <>를 제네릭(Generic)이라고 부른다
		//  - 제네릭에는 기본형 타입을 사용할 수 없다 (기본 타입의 WrapperClass 이용)
		ArrayList<String> fruits = new ArrayList<>();
		ArrayList<Integer> numbers = new ArrayList<>();
		
		// add(item) : 리스트의 원하는 데이터를 순차적으로 맨 뒤에 추가한다
		fruits.add("apple");
		fruits.add("kiwi");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("kiwi");
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		// add(index, item) : 리스트의 원하는 위치에 데이터를 넣는다
		fruits.add(2, "orange");
		fruits.add(2, "peach");
		fruits.add(2, "grape");
		
		System.out.println(fruits);
		System.out.println(numbers);
		
		// get(index) : 원하는 리스트에서 원하는 인덱스의 데이터를하나 꺼낸다
		System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));
		System.out.println(fruits.get(2));
		System.out.println(fruits.get(3));
		
		// size() : 해당 컬렉션의 크기를 반환한다
		System.out.println("Fruits 크기 : "+fruits.size());
		System.out.println("Numbers 크기 :  "+numbers.size());
		
		// remove(index) : 해당 번쨰의 데이터를 삭제한다. 방금 지운 데이터를 반환한다
		String del = fruits.remove(3);
		System.out.println("삭제 후 : " + fruits);
		System.out.println("삭제된 것 : " + del);
		
		// remove(item) : 해당 데이터를 삭제
		if (fruits.remove("strawberry")){
			System.out.println("삭제 성공");
		} else {
			System.out.println("그런거 없음");
		}
		
		// 정렬
		Collections.sort(fruits);
		System.out.println(fruits);
		
		//배열 정렬 (오름차순)
		int[] aa = {1,2,5,8,3,4};
		Arrays.sort(aa);
		System.out.println(Arrays.toString(aa));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
