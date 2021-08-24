package stoneinterfacelab;

/*
 * Author: Diana Linville
 * Course: 44-241
 * Date: November 2013
 * PlayingCard class
 */

public class PlayCard implements Comparable<PlayCard> {
	
	//Class Constants
	public static final int JOKER = 0;
	public static final int ACE = 1;
	public static final int KING = 13;	
	public static final int QUEEN = 12;
	public static final int JACK = 11;
	public static final String SPADES = "spades";
	public static final String CLUBS = "clubs";	
	public static final String HEARTS = "hearts";
	public static final String DIAMONDS = "diamonds";

	//Instance Variables
	private int rank;
	private String suit;
	
	//OVERLOADED Constructor
	public PlayCard (){
		this.rank = PlayCard.QUEEN;
		this.suit = PlayCard.SPADES;
	}
	public PlayCard (int rank, String suit)
	throws InvalidRankException, InvalidSuitException  {
		this.rank = this.checkRank(rank);
		this.suit = this.checkSuit(suit);
	}
	
	//Mutators
	public void setRank (int rank) throws InvalidRankException  {
		this.rank = this.checkRank(rank);
	}
	public void setSuit (String suit) throws InvalidSuitException {
		this.suit = this.checkSuit(suit);
	}
	
	//Accessors
	public int getRank () {
		return this.rank;
	}
	public String getSuit () {
		return this.suit;
	}

	public String toString () {
		return PlayCard.rankToString(this.rank) + " of " + this.suit;
	}

	
	//OVERLOADED equality method
	public boolean equals(PlayCard card){
		if (this.rank == card.getRank() && this.suit.equals(card.getSuit())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean equals(int rank){
		if (this.rank == rank) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean equals(String suit){
		if (this.suit.equals(suit)) {
			return true;
		}
		else {
			return false;
		}
	}

        public int suitToInt(String suit) throws InvalidSuitException {
            String [] suits = new String [] {"SPADES", "CLUBS", "DIAMONDS", "HEARTS"};
            
            for (int i = 0; i < suits.length; i++){
                if(suit.equalsIgnoreCase(suits[i])){
                    return i;
                }
                
            }
	throw new InvalidSuitException(); //suit is invalid
		
        }
	
        @Override
        public int compareTo(PlayCard o) {
            
        try{ 
        PlayCard card = (PlayCard)o;
        int card1 = suitToInt(this.suit);
        int card2 = suitToInt(card.suit);
        
        if( card1 < card2){
            return -1;
        }
        else if(card1 > card2){
            return 1;
        }
        else{
            if (this.rank < card.rank) {
                return -1;
            }
            else if (this.rank > card.rank) {
                    return 1;
            }
            else{
                return 0;
            }

        }
        }
        catch(InvalidSuitException e){
            return 0; //card is invalid, 
        }
        }

	//Helpers
	private int checkRank(int rank) throws InvalidRankException {
		if (rank >= PlayCard.JOKER && rank <= PlayCard.KING) {
			return rank;
		}
		else {
			throw new InvalidRankException(); //rank is invalid
		}
	}
	
	private String checkSuit(String suit) throws InvalidSuitException {
		if (suit.equalsIgnoreCase(PlayCard.SPADES)
				|| suit.equalsIgnoreCase(PlayCard.CLUBS)
				|| suit.equalsIgnoreCase(PlayCard.HEARTS)
				|| suit.equalsIgnoreCase(PlayCard.DIAMONDS)) {
			return suit.toLowerCase();
		}
		else {
			throw new InvalidSuitException(); //suit is invalid
		}
	}
	
	//Class Method
	public static String rankToString(int rank) {
		switch (rank) {
		case(0): return "Joker";
		case(1): return "Ace";
		case(2): return "two";
		case(3): return "three";
		case(4): return "four";
		case(5): return "five";
		case(6): return "six";
		case(7): return "seven";
		case(8): return "eight";
		case(9): return "nine";
		case(10): return "ten";
		case(11): return "Jack";
		case(12): return "Queen";
		case(13): return "King";
		}
		return "INVALID RANK!";
	}

}
