package quiz;

public class B15_WhileBasicQuiz {

	public static void main(String[] args) {
		
		int q1 = 0, sum = 0;
		
		while(q1<=100) {
			if(q1 % 3 ==0) {
			sum += q1;
			}
			q1++;
		}
		System.out.println("3의 배수의 합 : " + sum);
		
		System.out.println("==============================");
		
		int q2 = 200;
		while(q2 > 0) {
			System.out.print(q2-- + " ");
		}
		System.out.println();
		System.out.println("==============================");
		
		int q3 = 300;
		while(q3++ <= 500) {
			if(q3 % 7 != 0) {
				continue;
			}
			System.out.println(q3);
		}
		
		System.out.println("==============================");
		
		int q4 = 0;
		sum = 0;
		while(q4++ < 200) {
			if(q4 % 2 != 0 && q4 % 3 != 0) {
				sum += q4;
			}
		}
		System.out.println("aa : " + sum);
		
		
		
		
		
		
		
		
		

	}

}
