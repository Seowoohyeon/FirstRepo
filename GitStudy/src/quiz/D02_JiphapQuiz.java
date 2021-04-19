package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class D02_JiphapQuiz {
	
	// 1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set타입으로 반환하는 메서드
	// 2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 교집합을 Set타입으로
	// 3. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set타입으로
	// 소문자로 시작하는 타입들은(기본형)은 매게변수로 전달할 때 값을 복사하여 전달한다 
	// 대문자로 시작하는 타입들(참조형)은 매개뱐수로 전달할 때 주소를 복사하여 전달한다
	
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
		// 대문자로 시작하는 타입들(참조형)은 매개뱐수로 전달할 때 주소를 복사하여 전달한다
		Set<Integer> arrays1 = new HashSet<Integer>();
		Set<Integer> arrays2 = new HashSet<Integer>();
		
		//합
		System.out.println(union(arrays1, arrays2));
		System.out.println("합집합 : " + arrays1);
		//차
		System.out.println(difference(arrays1, arrays2));
		System.out.println("차집합 : " + arrays1);
		//교
		System.out.println(inter(arrays1, arrays2));
		System.out.println("교집합 : " + arrays1);
		
	}
	
	
	
	
}
