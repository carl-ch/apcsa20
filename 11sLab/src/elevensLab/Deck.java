package elevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck{
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards = new ArrayList<Card>();
	private int top;
	private int t;

   //make a Deck constructor
	int z;
	public Deck() {
		top = 51;
		t = top;
		for(int i=0; i<=3; i++) {
			z = i;
			for(int i2=1; i2<=13; i2++) {
				cards.add(new Card(SUITS[z], i2));
			}
		}
	}
	
	int s;
	public Deck(String[] ranks, String[] suits, int[] pointValues) {
		top = 51;
		t = top;
		for(int i3=0; i3<=3; i3++) {
			s = i3;
			for(int i4=1; i4<=13; i4++) {
				cards.add(new Card(ranks[i4], suits[s], pointValues[i4]));
			}
		}
	}
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
   	
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck

   
   //make a dealCard() method that returns the top card
	public Card dealCard() {
		Card o = cards.get(t);

		t--;
		if(t<0) {
			t = 51;
		}
		
		return o;

	}
	
	public int Size() {
		return t;
	}
	
	public boolean isEmpty() {
		boolean empty;
		if(t<=0)
			empty = true;
		else
			empty = false;
		return empty;
	}
	
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
	public void shuffle() {
		Collections.shuffle(cards);
		dealCard();
	}
}