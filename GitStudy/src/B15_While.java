import java.util.Scanner;

public class B15_While {

	public static void main(String[] args) {
		
		/*
		 
		  for문과 사용법이 약간 다른 반복문
		   초기값과 증가값의 위치가 정해져 있지 않다
		   괄호안의 조건이 참인동안 중괄호 안의 내용 반복
		
		*/
		
		int i = 0;
		
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		// 증가값의 위치에 따라 결과가 달라질 수 있다
		i = 0;
		while(i++<10) {
			System.out.println("반복문 2 : " + i);	
		}
		
		/*  
		   while문과 사용하기 좋게끔 설계된 클래스들이 있다
			 - has, next 등의 수식어가 붙은 메서드를 가지고 있다
			 - Scanner 등
		*/
		
		Scanner sc1 = new Scanner("apple banana");
		Scanner sc2 = new Scanner("1234 4567 7894 4154 4844");
		
		// Scanner.hasNext() - 다음 값이 잇으면 참, 없으면 거짓
		while(sc1.hasNext()) {
			//Scanner.next() - 다음 하나의 값을 String 타입으로 꺼낸다
			System.out.println(sc1.next());
		}
		while(sc2.hasNextInt()) {
			System.out.println(sc2.nextInt());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
