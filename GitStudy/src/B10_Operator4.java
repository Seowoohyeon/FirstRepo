
public class B10_Operator4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  	대입연산
		  	  - = 왼쪽을 변수에 오른쪽의 값을 대입한다
		*/
		int num = 10;
		num = num + 20;
		
		System.out.println(num);
		
		/*
		   복합 대입 연산자
		   - 변수의 결과를 누적 시키는 연산자
		  
		 */
		num = 10;
		System.out.println(num += 15);
		System.out.println(num -= 3);
		System.out.println(num *= 2);
		System.out.println(num /= 4);
		System.out.println(num %= 3);
		
		/*
		  단항 연산자
		  - 변수에 결과를 1씩 누적시키는 연산자
		  - 연산자의 위치에 따라 결과가 달라짐
		 */
		num = 10;
		num++;
		System.out.println(num);
		
		num = 3;
		System.out.println(num++); //연산자가 뒤에 붙는 경우에는 그 줄 앞에 모든 명령을 모두 실행 후 실행
		System.out.println(++num); //연산자가 앞에 붙는 경우에는 그 줄 명령을 실행 전 실행
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
