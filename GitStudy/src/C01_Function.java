
public class C01_Function {
	
	public static void print_rabbit() {
		
			System.out.println(" /)/) ");
			System.out.println("(  ..)");
			System.out.println("(   >$");
	}
	
	// 솨과의 개수와 바구니의 크기를 전달 하면 필요한 바구니의 개수를 알려주는 함수
	
	// int : 이 함수의 실행 결과의 타입 = return타입
	// name(int a, int b) 
	//      : 이 함수를 실행할 때 int타입 값을 두 개 전달 받도록 정의 
	public static int apple_basket(int apple, int size) {
		int result;
		if(apple % size == 0) {
			result = apple /size ;
		} else {
			result = apple / size + 1;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	함수(Function)(Method)
		 	 - 기능을 미리 정의해두고 나중에 가져다 쓰는 것
			 - 정의해둔 함수 이름 뒤에 ()룰 븉여서 함수를 호츌하면 호출한 자리에 함수의 실행 결과가 반환된다
			 - 함수를 정의할 때 해당 함수가 반환할 값의 타입을 앞에 적어둔다
			 - 자바에서 함수는 반드시 클래스 내부에 선언해야 한다
		*/
			print_rabbit();
	
			int basket = apple_basket(133, 10);
			System.out.println("바구니 개수 : " + basket);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
