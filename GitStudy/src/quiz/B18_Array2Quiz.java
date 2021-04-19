package quiz;

import java.util.Arrays;

public class B18_Array2Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] numArr = new int[][] {
			{1,1,1,1},
			{1,1,1,1,1,1,1},
			{1,1,1,1,1,1},
			{1,1},
			{1,1,1,1,1}
		};
		
		//1
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				numArr[i][j] = (int)(Math.random() * 101);
				System.out.println(numArr[i][j]);
			}
		} 
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		// 2
		int sum = 0;
		int count = 0;

		for ( int i = 0 ; i <numArr.length; i++){
			for (int j = 0; j < numArr[i].length; j++){
				sum += numArr[i][j];
				count++;
			}
		}
		System.out.printf("%d, %.2f\n", sum, (double)sum / count);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		// 3
		for (int i = 0; i < numArr.length; i++) {
			sum = 0;
			for (int j = 0; j < numArr[i].length; j++) {
				sum += numArr[i][j];
			}
			System.out.printf("%d행의 합계: %d\n", i, sum);
		}
		
		// 배열 편하게 출력하기
		// System.out.printf(Arrays.toString(numArr));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		// 4
		// 제일 긴 배열 찾기
		int longest = 0;
		for (int i = 0; i < numArr.length; i++) {
			longest = Math.max(longest, numArr[i].length);
		}
		int[] colsum = new int[longest];
		
		for (int i = 0; i < numArr.length; i++) {
			sum = 0;
			for (int j = 0; j < numArr[i].length; j++) {		
				colsum[j] += numArr[i][j];
			}
			System.out.println("열의 합 : " + Arrays.toString(colsum));
		}
		
		
	/*	for (int i = 0; i < colsum.length; i++) {
			sum = 0;
			for (int j = 0; j < numArr.length; j++) {
				if(numArr[j].length > i) {
					colsum[i] += numArr[i][j];
				}
			}
			System.out.println("열의 합 : " + Arrays.toString(colsum));
		}*/
		
		
		
		
	}

}
