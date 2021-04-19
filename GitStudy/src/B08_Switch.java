
public class B08_Switch {

	public static void main(String[] args) {
		/*
		  	switch ~ case
		  		- 괄호안에 연산 결과에 따라 실행할 코드를 결정
		  		- 괄호안에 boolean 타입 x
		  		- break를 만날때까지 내려가며 모든  case를 실행시킴
		  
		*/
		
		int a = 10;
		switch(a % 2) {
		case 0:
			System.out.println("a는 짝수");
			break;
		case 1:
			System.out.println("a는 홀수");
			break;
		}
		
		char grade  = 'A';
		
		switch(grade) {
		case 'E':
			System.out.println("전체 관람가 입니다");
			break;
		case 'K':
			System.out.println("12세 이상 관람가 입니다");
			break;
		case 'Y':
			System.out.println("15세 이상 관람가 입니다");
			break;
		case 'A':
			System.out.println("19세 이상 관람가 입니다");
			break;
			}
		
		
		
		
		
		
		
		
		
		
		
	}

}
