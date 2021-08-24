package lab5;

/**
 * @author s515012
 */
import java.util.*;
public class Lab5 
{
   public static void main(String[] args) 
	{
    Scanner input = new Scanner(System.in);
	 System.out.print("Enter the number of balls to drop: ");
	 int balls = input.nextInt();
	 System.out.print("Enter the number of slots in the bean machine: ");
	 int num_of_slots = input.nextInt();
	 
	 int [] slots = new int[num_of_slots];
	 
	 onePath(num_of_slots);
	 printHistogram(slots);
	 max(slots);
   }
	
	public static int onePath(int numOfSlots){
		int position = 0;
		
		int [] slots = new int[numOfSlots];
	  for (int i = 0; i < numOfSlots; i++) {
            Random num = new Random();
            position = num.nextInt(3);
            if (position == 2) {
                System.out.print("L");
            } else {
                System.out.print("R");
            }
        }
        System.out.println();
        return (numOfSlots);
	}
	
	public static void printHistogram(int [] slots){
        int max;
        for (int height =0; height <=slots.length; height++) {
                if (height < slots.length) {
                    System.out.print(" ");
                } 
					 else {
                    System.out.print("O");
                }
                
            }
	}
	
	public static int max(int [] slots){
		int max = 0;
		for (int i = 1; i < slots.length; i++) {
            if (max < slots[i]) {
                max = slots[i];
            }
	}
		return max;
}
}