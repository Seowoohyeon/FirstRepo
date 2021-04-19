package myobj.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FiveDice {
	
	Random ran;
	int[] dice;
	int[] diceCount;
	int kindOfDice;
	
	
	public FiveDice() {
		dice = new int[5];
		ran = new Random();
		
		reroll(new int[] {1,2,3,4,5});
	}

	
	private void countCeck() {
		int[] diceCount = new int[6];
		
		for (int i = 0; i < dice.length; ++i) {
			diceCount[dice[i] - 1]++; 
		}
		
	}
	private void KindCeck() {
		kindOfDice = 0;
		
		for(int i = 0; i < 6; ++i) {
			if(diceCount[i]>0) {
				kindOfDice++;
			}
		}
		
	}
	
	private boolean countContains(int count) {
		for (int i = 0; i < diceCount.length; ++i) {
			if(diceCount[i] == count) {
				return true;
			}
		}
		return false;
	}
	
	private boolean checkLarge() {
		if(diceCount[0] == 0 || diceCount[5] == 0) {
			return true;
		}
		return false;
	}
	
	private boolean checkSmall() {
		for(int i = 0; i < 3; i++) {
			if(diceCount[i] > 0 && diceCount[i+1] > 0 && diceCount[i+2] > 0 && diceCount[i+3] > 0) {
				return true;
			}
		}
		return false;
	}
	
	
	public void check() {
		countCeck();
		KindCeck();
		
		
		System.out.println("집계 결과 : " + Arrays.toString(diceCount));
		System.out.println("주사위 눈의 종류 : " + kindOfDice);
		
		if(kindOfDice == 1) {
			System.out.println("Five Dice!!");
		} else if(countContains(4)) {
			System.out.println("4 Dice!!");
		} else if(kindOfDice == 2 && countContains(3)) {
			System.out.println("Full House!!");
		} else if(kindOfDice == 5 && checkLarge()) {
			System.out.println("Large Straight!!");
		} else if(kindOfDice >= 4 && checkSmall()) {
			
		}
		
	}
	
	public void reroll(int index) {
		if(index < 1 || index > 5) {
			System.out.println("인덱스가 이상함");
    		return;
		}
		dice[index - 1] = ran.nextInt(6) + 1;
		System.out.println("리롤결과 : "+Arrays.toString(dice));
	}
	
    public void reroll(int[] indexes) {
    	if(indexes.length > 5 || indexes.length == 0) {
    		System.out.println("이상해서 안굴림");
    		return;
    	}
		for (int i = 0; i < indexes.length; ++i) {
			dice[indexes[i] - 1] = ran.nextInt(6) + 1;
		}
		System.out.println("리롤결과 : "+Arrays.toString(dice));
		check();
	}
    
    public static void main(String[] args) {
		FiveDice mydice = new FiveDice();
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		/*while(true) {
			System.out.println("다시");
			while(sc.hasNext()) {
				mydice.reroll(sc.nextInt());
			}
		}*/
		mydice.reroll(new int[] {1,2,3,4,5,6});
		mydice.reroll(new int[] {1,2,3,4,5,6});
		mydice.reroll(new int[] {1,2,3,4,5,6});
		mydice.reroll(new int[] {1,2,3,4,5,6});
		
		
		
	}
    
    
}
