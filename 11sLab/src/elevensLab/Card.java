package elevensLab;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class Card {
	public static final String FACES[] = { "ZERO", "ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
			"NINE", "TEN", "JACK", "QUEEN", "KING" };

	// instance variables
	String suit;
	int face;
	String faceS;
	int pointValue;

	// constructors
	public Card() {
		suit = "";
		face = 0;
	}

	public Card(String s, int f) {
		setSuit(s);
		setFace(f);
	}

	public Card(String r, String s, int p) {
		setSuit(s);
		setFaceString(r);
		setPointValue(p);
	}

	// modifiers
	// set methods
	public void setSuit(String s) {
		suit = s;
	}

	public void setFace(int f) {
		face = f;
	}

	public void setFaceString(String r) {
		faceS = r;
	}

	public void setPointValue(int p) {
		pointValue = p;
	}

	// accessors
	// get methods
	public String getAct() {
		return suit + ", " + FACES[face];
	}

	public String getCB() {
		return getFaceString() + " of " + getSuit();
	}

	public String getSuit() {
		return suit;
	}

	public int getFace() {
		return face;
	}

	public String getFaceString() {
		return faceS;
	}

	public int getPointValue() {
		return pointValue;
	}

	public boolean matches(Card card) {
		boolean match = false;
		if (this.getSuit().equals(card.getSuit()))
			if (this.getFaceString().equals(card.getFaceString()))
				if (this.getPointValue() == card.getPointValue())
					match = true;
		return match;
	}

	// toString
	public String toString() {
		String o = "";
		if (pointValue > 0)
			o = getCB();
		else
			o = getAct();
		return o;
	}
}