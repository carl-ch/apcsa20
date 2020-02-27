package elevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		String suit;
		int face;

  	//constructors
	public Card() {
		suit = "";
		face = 0;
	}
	
	public Card(String s, int f) {
		setSuit(s);
		setFace(f);
	}

	// modifiers
		//set methods
	public void setSuit(String s) {
		suit = s;
	}
	
	public void setFace(int f) {
		face = f;
	}

  	//accessors
		//get methods
	public String getA() {
		return suit + ", " + FACES[face];
	}

  	//toString
	public String toString() {
		String o = "";
		o = getA();
		return o;
	}
 }