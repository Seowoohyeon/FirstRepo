
public class A03_VarTypes {

	public static void main(String[] args) {
		
		/*
		  
		 	정수 타입
		 		- byte  (1byte)
		 		1byte => 8bit
		 		0000 0000 (0) ~ 1111 1111 (255)
		 		# 첫 번째 bit는 부호 비트로 사용된다
		 		byte 타입의 양수 범위 0000 0000 (0) ~ 0111 1111 (127)
		 		byte 타입의 양수 범위 1000 0000 (-128) ~ 1111 1111 (-1) 
		 		
		 		- short (2byte, signed)
		 		양수  0 ~ 32767 
		 		음수 -32768 ~ -1
		 		
		 		- char  (2byte, unsigned)
		 		부호가 없기 때문에 0 ~ 65535의 양수만 저장할 수 있는 타입
		 		주로 문자 코드를 저장하는데에 사용한다 (문자타입)
		 		
		 		- int   (4byte)
		 		양수  0 ~ 21.5 억
		 		음수  -21.5억 ~ -1
		 		
		 		- long  (8byte)
		 	
		 	실수 타입
		 		- float(4)
		 		- double(8)
		 	
		 	boolean 타입
		 		- true
		 		- false
		 		
		 	참조형 타입(클래스 타입)
		  		참조형 타입은 대문자로 시작한다.
		  		- String : 문자열
		  		- 그 외 모든 클래스들..
		 */
		//참조형 타입
		String helloMessage = "Hello";
		//정수타입
		long _Long = 2_147_483_648l;
		//실수타입
		float weight = 65.66f;
		double height = 177.77;
		//boolean타입
		boolean hasfood = true;
		boolean over130cm = false;
	}

}
