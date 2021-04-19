
public class B11_For {

	public static void main(String[] args) {
		
		/*
			반복문
			  - for, while, do-while ...
			  - 똑같은 코드를 여러번 반복하고 싶을 때 사용한다
			  
			  - for(초기화; 조건; 증가값;) {
			  		조건이 참일 동안 반복될 명령어들
			    }
		*/
		
		// 1. 가장 기본적인 형태(원하는 횟수만큼 반복하기 가장 좋음)
			// - 초기값 0을 주고 조건에는 반복하고 싶은 횟수
			// - 중가는 1씩
	/*	for(int i = 0; i <= 10; i++) {
			//System.out.println("Hello " + i);
		}
		
		// 2. 초기값, 증가값, 조건은 마음대로 변경 가능
		for(int i = 70; i < 555; i += 10) {
			System.out.println("Hello " + i);
		}
		for(int i = 9000; i >= 0; i -= 100) {
			System.out.println(i);
		}
		
		// 3. 초기값과 증가값의 위치는 마음대로 변경 가능
		int x = 0;
		for(;x < 10;) {
			System.out.println("3. " + x++);
		}  */
		
		// 변수는 자신이 속한 중괄호를 벗어나면 죽는다 (변수의 생명주기)
		
		// 4. 반복문 내부에 다른 문법들도 자유롭게 사용할 수 있다
		
		for(int month = 1; month <= 16; month++) {
			switch(month) {
			case 3: case 4: case 5:
				System.out.println("봄");
			 break;
			case 6: case 7: case 8:
				System.out.println("여름");
			 break;
			case 9: case 10: case 11:
				System.out.println("가을");
			 break;
			case 12: case 1: case 2:
				System.out.println("겨울");
				break;
			default:
				System.out.println("누구시죠");
				break;
			
			}
		}
		
		// 5. 조건을 비워놓으면 무한반복한다
		//  - 반복문은 원하는 타이밍에 break문을 통해 탈출할 수 있다
		int count = 0;
		
		
		for(;;) {
			System.out.println("go " + count++);
			if(count == 7) {
				break;
			}
		}
		
		// 6. 반복문 내부에서 continue를 만나면 바로 다음번 반복으로 넘어간다
		
		/*for(int i = 1; i <= 50; i++) {
			System.out.printf("%02d ", i);
			if(i % 10 != 0) {
				continue;
			}
			System.out.println();
						
		}*/
		
		
		 for(int i = 5000; i>100; i--){
			 if(i % 2 == 0) {
				continue;
			 }
			 System.out.println(i);
		 }
		
		/* 7. 반복문으로 총합 구하기
		 	 - 반복문 바깥쪽에 총합을 저장할 변수를 하나 선언후 0으로 초기화
		 	 - 반복문을 진행하면서 해당 변수에 값을 누적시킨다
		 	 
		*/
		 // 80 ~ 333 3의 배수의 총합을 구해보기
		int sum = 0;
		for(int i = 80; i <=333; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
