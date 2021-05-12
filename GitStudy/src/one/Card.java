package one;

import java.util.HashSet;

public class Card {
	
	public static HashSet<Character> SUITS;
	public static HashSet<String> RANKS;
	
	static {
		SUITS = new HashSet<>();
		RANKS = new HashSet<>();
		
		SUITS.add('¢¼');
		SUITS.add('¢À');
		SUITS.add('¢¾');
		SUITS.add('¡ß');
		RANKS.add("A");
		RANKS.add("2");
		RANKS.add("3");
		RANKS.add("4");
		RANKS.add("5");
		RANKS.add("6");
		RANKS.add("7");
		RANKS.add("8");
		RANKS.add("9");
		RANKS.add("10");
		RANKS.add("J");
		RANKS.add("Q");
		RANKS.add("K");
		RANKS.add("JOKER");
		
	}
	
	private Character suit;
	private String rank;
	private boolean isAttack;
	private boolean isSpecial;
	private int attackValue;
	
	public Card(Character suit, String rank) {
		// TODO Auto-generated constructor stub
		this.rank = rank;
		this.suit = suit;	  
	}

	public static HashSet<Character> getSUITS() {
		return SUITS;
	}

	public static void setSUITS(HashSet<Character> sUITS) {
		SUITS = sUITS;
	}

	public static HashSet<String> getRANKS() {
		return RANKS;
	}

	public static void setRANKS(HashSet<String> rANKS) {
		RANKS = rANKS;
	}

	public Character getSuit() {
		return suit;
	}

	public void setSuit(Character suit) {
		this.suit = suit;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public boolean isAttack() {
		return isAttack;
	}

	public void setAttack(boolean isAttack) {
		this.isAttack = isAttack;
	}
	
	public boolean isSpecial() {
		return isSpecial;
	}

	public void setSpecial(boolean isSpecial) {
		this.isSpecial = isSpecial;
	}

	public int getAttackValue() {
		return attackValue;
	}

	public void setAttackValue(int attackValue) {
		this.attackValue = attackValue;
	}
	
	public String toString() {
		return String.format("[%c%s]", this.suit, this.rank);
	}
	
}
