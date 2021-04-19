package myobj.game.poker;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HandRanking {

	public static Set<Rank> MOUNTAIN = new HashSet<>();
	public static Set<Set<Rank>> STRAIGHTS  = new HashSet<>();
	
	static {
		Collections.addAll(MOUNTAIN, Card.ACE, Card.KING, Card.QUEEN, Card.JACK, Card.TEN);
	}
	
}
