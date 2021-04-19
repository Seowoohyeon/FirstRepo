
public class B05_TypeCasting {

	public static void main(String[] args) {
		
		/*
		  	@ 타입 캐스팅
		  	  - 타입이 자연스럽게 변하는 경우 (타입이 변하더라도 문제가 없을 때)
		  	  - 타입을 강제로 변환시켜야 하는 경우 (타입이 변하면 문제가 생길 때)
		  	  
		  	@ 타입의 크기
		  	  - 정수 타입 : byte < char, short < int < long
		  	  - 실수 타입 : float < double
		  	  
		  	정수 타입은 무조건 실수타입 보다 표현 범위가 작다
		*/
		
		//1. 자연스러운 타입 캐스팅
		byte by = 127;
		short sh;
		int i;
		float flt;
		long lo;
		i = by;
		i = 2100000000;
		lo = i;
		flt = lo;
		
		//2. 값이 손상될 위험이 있는 타입 캐스팅
		i = 50000;
		sh = (short)i; // 값이 손상될 수도 있으므로 컴파일러가 경고를 해준다.
		
		//3. 같은 값이더라도 다르게 해석될 수 있는 타입의 경우 타입 캐스팅이 필요하다
		int a = 80;
		char ch = 'z';
		
		System.out.println((char)a);
		System.out.println(a);
		System.out.println((int)ch);
		System.out.println(ch);
		
		
		
		
		
		
		
		
		
	}

}
