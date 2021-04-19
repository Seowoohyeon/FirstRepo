package quiz;

public class B15_Count369Ver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 40;
		int clap = 0;
		
		for(int i = 1; i <= input; ++i) {
			int test = i;
			System.out.print(i + ": ");
			while(test > 0) {
				int digit = test % 10;
				if(digit != 0 && digit % 3 ==0) {
					clap++;
					System.out.print("짝");
				}
				test /= 10;
			}
			System.out.println();
		}
		System.out.println("박수는 " + clap + "번 쳐야 합니다");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
