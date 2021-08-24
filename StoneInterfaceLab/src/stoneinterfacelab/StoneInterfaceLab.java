package stoneinterfacelab;

/**
 * @author s515012
 */

import java.util.Arrays;
public class StoneInterfaceLab 
{
   public static void main(String[] args) 
	{
	String s1 = "Tim";
	String s2 = "Jim";
	
	//System.out.println(s1.compareTo(s2));
	//System.out.println(s1.compareTo(s1));
	//System.out.println(s2.compareTo(s1));	

	/*if(s1.compareTo(s2) < 0){
		System.out.println(s1);
		System.out.println(s2);
	}
	else if(s1.compareTo(s2) > 0) { 
		System.out.println(s2);
		System.out.println(s1);
   }
	else{
		System.out.println("The two strings are equal.");
	}*/
	
	Comparable[] collection = new Comparable[10];
        
        try{
	collection[0] = new PlayCard(5, "spades");
	collection[1] = new PlayCard(2, "hearts");
	collection[2] = new PlayCard(12, "clubs");
	collection[3] = new PlayCard(9, "DIAMONDS");
	collection[4] = new PlayCard(5, "CLUBS");
	collection[5] = new PlayCard(11, "DIAMONDS");
	collection[6] = new PlayCard(8, "CLUBS");
	collection[7] = new PlayCard(10, "SPADES");
	collection[8] = new PlayCard(4, "HEARTS");
	collection[9] = new PlayCard(13, "SPADES");
        }
        catch(InvalidRankException ex){
            System.out.println("Invalid Rank" + ex);
        }
        catch (InvalidSuitException ex){
            System.out.println("Invalid Suit" + ex);
        }   
        
        
	Arrays.sort(collection);
	
	for(int i = 0; i < collection.length; i++){
		System.out.println(collection[i]);
	}
}
}
