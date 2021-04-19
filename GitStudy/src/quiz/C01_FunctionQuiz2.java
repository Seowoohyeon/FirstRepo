package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz2 {
	/*
        # 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요2                 
            
         1. 최대값을 매개변수로 전달 받으면
            0부터 최대값 미만의 모든 값을 포함하는 int 배열을 생성하여 반환하는
            range 함수를 만들어보세요 (최대값 미만)
            
            ex: range(10)의 결과 -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
            
         2. 최소값과 최대값을 매개변수로 받으면 
                     그 사이에 존재하는 모든 값을 포함하는 int 배열을 생성하여 반환하는 
            range 함수를 만들어보세요 (최소값 이상, 최대값 미만)
            
            ex: range(5, 10)의 결과 -> [5, 6, 7, 8, 9]
            
         3. 최소값과 최대값과 증가값을 매개변수로 받으면 
                     최소값에서 시작하여 최대값까지 증가값만큼 증가하는 int 배열을 생성하여 반환하는
            range 함수를 만들어보세요 (최소값 이상, 최대값 미만)
            
            ex: range(50, 56, 5)의 결과 -> [50, 55]
                range(50, 55, 5)의 결과 -> [50]

	 */
	
	// 1
	public static int[] range(int num) {
		int range[] = new int[num];
		for (int i = 0; i < num; i++) {
			range[i] = i;
		}
		return range;
	}
	
	// 2
	// 매개변수의 개수 혹은 타입이 다르면 같은 함수명을 사용할 수 있다
	// 함수의 오버로딩
	public static int[] range(int start ,int end) {
		if(start >= end) {
			return null; // 잘못된 값일 때 리턴으로 함수를 빠르게 종료시키기
		}
		
		int bound[] = new int[end - start];
		for (int i = 0, num = start; i < bound.length; i++, num++) {
			bound[i] = num;
		}
		return bound;
	}
	
	// 3
	public static int[] range(int start ,int end, int increment) {
		int len = (int) Math.ceil((end - start) / (double)increment);
		int[] bound = new int[len];
		
		for (int i = 0, num = start; i < bound.length; i++, num += increment) {
			bound[i] = start;
			start += increment;
		}
		return bound;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(range(10)));
		System.out.println(range(10)[3]);
		
		System.out.println(Arrays.toString(range(10, 20)));
		System.out.println(Arrays.toString(range(25, 10)));
		
		System.out.println(Arrays.toString(range(50, 56, 5)));
	}

}
