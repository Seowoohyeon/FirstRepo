
public class B17_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		  	# 배열
		  	  - 같은 타입 변수를 한번에 여러게 선언하는 방법
		  	  - 같은 이름으로 변수를 여러개 선언한 뒤 인덱스를 활용햐 구분한다
		  	  - 배열을 한번 크기가 정해지면 크기를 변경할 수 없다
		  	  - 배열은 생겅과 동시에 초기화가 되어있다
		*/
		int[] a = new int[100];
		
		/*for (int i = 0; i < 100; i++) {
			a[i] = (int)(Math.random() * 101);
		}
		System.out.println(a.length);*/
		
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < 100; i++) {
			a[i] = (int)(Math.random() * 101);
		}
		for(int i = 0; i < 100; i++) {
			sum += a[i];
			avg = sum / a.length;
		}
		System.out.println(sum);
		System.out.printf("%.2f", avg);
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.printf("%d , %.2f\n", sum, sum/ (double)a.length);
		
		
		/*
		  	# 배열을 선언하는 방법
		  		1. 타입[] 배열이름  = new 타입[배열크기];
		  		2. 타입[] 배열이름 = {값1, 값2, ...};
		*/
		
		
		char[] g = new char[50];
		int[] age = {10,20,30,40,50,80};
		boolean[] pass = {true, false, true, false};
		String[] an = new String[] {"lion", "tiger", "penguin"};
		
		System.out.println(an[0]);
		
		if(pass[1]) {
			System.out.println("4번쨰 : 불합격");
		}
		for (int i = 0; i < g.length; i++) {
			System.out.println((int)g[i]);
		}
		
		// String은 char형 배열로 변환할 수 있다
		char[] mg1 = new char[] {'h','e','l','l','o'};
		String mg2 = "hello";
		
		char[] mg3 = mg2.toCharArray();
		
		System.out.println(mg3[0]);
		System.out.println(mg3[1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
