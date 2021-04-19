
public class A02_Variable {

	public static void main(String[] args) {
		/*
		 	변수(Variable)
		 		
		 		- 데이터를 담을 수 있는 공간
		 		- 자바에서는 변수를 반드시 선언한 뒤에 사용해야 한다
		 		- 변수 선언시에는 그 변수에 저장할 데이터의 타입을 정해줘야 한다
		 		- ""나 ''가 없는 모든 문자열 또는 문자는 변수다
		 		- 같은 이름의 변수는 다시 선언할 수 없다
		 		
		 	변수의 선언(declare)
		 */
		// int 정수만 저장할 수 있는 변수 타입
		// String 문자열만 저장 할 수 있는 변수 타입
		int a = 5000;
		System.out.println(a);
		int apple;
		apple = a + 50;
		System.out.println(apple);

		a = 50; //원래 있던 5000츤 사라지고, 50을 덮어쓴다
		System.out.println(a);
		
		//여러가지 변수 선언 방식
		int b;
		// 선언한 변수ㅇ[ 최초로 값을 대입하는 것을 '초기화(initialize)'라고 한다
		b = a + apple;
		System.out.println(b);
		int c,d;
		int e = 55;
		int f = 99, g = 999;
			
		
		
	}

}
