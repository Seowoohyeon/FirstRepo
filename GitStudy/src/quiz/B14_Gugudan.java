package quiz;

public class B14_Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		// 1��
		for (int i = 2; i <= 9; i++) {
			System.out.printf("%d�� : ", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("  %2d x %d = %2d ", i, j, i*j);
			}
			System.out.println("");
		}
		System.out.println("");
		
		// 2��
		for (int i = 2; i <= 9; i++) {
			System.out.printf("%d �� : \t\t", i);
		}
		System.out.println();
		for(int j = 1; j <= 9; j++) {
			for (int k = 2; k <= 9; k++) {
				System.out.printf("%d x %d = %d\t", k, j, k*j);
			}
			System.out.println();
		}
	
	
	
	
	
	
	
	
	
	}

}
