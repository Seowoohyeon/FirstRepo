package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

//length�� ���ڿ� , size�� �迭�� ũ��
public class D02_LottoSet {

	public static void main(String[] args) {
		
		System.out.println(lotto_set());
		System.out.println("������ ��÷ ��ȣ : " + jack_pot());
		
		System.out.println(random_numbers());
		
		System.out.println(getLottoArray2());
	}
	
	// 1���� 45������ �ߺ����� ���� ���� 7���� �̷���� HashSet�� �����ϴ� �޼��带 �ۼ�
	// ��ȯ�ϴ� �޼��带 �ۼ� �� �׽�Ʈ
	
	//				   ����Ÿ��
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
	
		
		// 1���� 45 ������ �ߺ� ���� ���� ���� 7���� �̷���� ArrayList�� �����Ͽ� ��ȯ
		public static ArrayList<Integer> random_numbers() {
			return new ArrayList<>(lotto_set());
		
		
		}
		
		
		// 1���� 45 ������ �ߺ� ���� ���� ���� 7���� �̷���� int[]�� �����Ͽ� ��ȯ
		
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
