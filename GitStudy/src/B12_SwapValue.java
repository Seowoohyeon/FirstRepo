
public class B12_SwapValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c;
		System.out.printf("a : %d, b : %d \n", a, b);
		
		//c에 a를 잠시 보관
		c = a;
		// a에 b를 넣음
		a = b;
		//아까보관해놨던 a값을 b에 넣음
		b = c;
		
		System.out.printf("a : %d, b : %d", a, b);
	}

}
