
public class B04_Operator2 {

	public static void main(String[] args) {
		
		/* 
		     비교 연산자
			 - 산술연산과 비교 연산이 함께 있으면 산술 연산을 먼저 계산한다
			 -  
		
		*/
		int a = 8, b = 5;
		System.out.printf("a = %d, b = %d 일 때 \n", a,b);
		System.out.println("a > b \t: " + (a>b)); //sysout + 컨트롤 스페이스
		System.out.println("a < b \t: " + (a<b)); 
		System.out.println("a >= b \t: " + (a>=b)); 
		System.out.println("a <= b \t: " + (a<=b)); 
		System.out.println("a == d \t: " + (a == b)); //두 값이 같으면 1
		System.out.println("a != b \t: " + (a != b)); //두 값이 다르면 1
		 
		/*
		 	논리 연산자
		 	  - boolean 타입 값으로 하는 연산자
		 	  - && : AND
		 	  - || : OR
		 	  - !  : NOT
		 */
		System.out.println("\n-- AND --");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("\n-- OR --");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\n-- NOT --");
		System.out.println(!true);
		System.out.println(!false);
		
		int x=2, y=2, z=1;
		
		System.out.println(x > 5 && x % 3 == 0);
		System.out.println("3개가 모두 3의 배수면 : " + (x % 3 == 0 && y % 3 == 0 && z % 3 ==0));
		System.out.println("3개가 모두 3의 배수가 아니면 : " + (x % 3 != 0 && y % 3 != 0 && z % 3 != 0));
		
	}

}
