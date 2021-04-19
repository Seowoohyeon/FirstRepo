package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

//length는 문자열 , size는 배열의 크기
public class D02_LottoSet {

	public static void main(String[] args) {
		
		System.out.println(lotto_set());
		System.out.println("금주의 당첨 번호 : " + jack_pot());
		
		System.out.println(random_numbers());
		
		System.out.println(getLottoArray2());
	}
	
	// 1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 HashSet을 생성하는 메서드를 작성
	// 반환하는 메서드를 작성 후 테스트
	
	//				   리턴타입
	public static HashSet<Integer> lotto_set() {
		//ArrayList<Integer> lotto = new ArrayList<>();
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		while(lotto.size() < 7) {
			lotto.add((int)(Math.random() * 45 + 1));
		}
		
		return lotto;
	}
	
	public static HashSet<Integer> jack_pot() {
		HashSet<Integer> jackpot = new HashSet<Integer>();
		
		while(jackpot.size() < 7) {
			jackpot.add((int)(Math.random() * 45 + 1));
		}
		
		return jackpot;
	}
	
		
		// 1부터 45 사이의 중복 없는 랜덤 숫자 7개로 이루어진 ArrayList를 생성하여 반환
		public static ArrayList<Integer> random_numbers() {
			return new ArrayList<>(lotto_set());
		
		
		}
		
		
		// 1부터 45 사이의 중복 없는 랜덤 숫자 7개로 이루어진 int[]를 생성하여 반환
		
		public static Integer[] random_numbers2() {
			return random_numbers().toArray(new Integer[7]);
		}
		
		public static int[] getLottoArray2() {
			Integer[] lotto = random_numbers2();
			int[] result = new int[7];
			
			for(int i = 0; i < 7; ++i) {
				result[i] = lotto[i];
			}
			
			return result;
		}
		
		
		
	
	
}
