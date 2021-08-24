/*
 * Author: Doug Wettlaufer
 * Course: 44-241-1
 * Date:
 * Description:
 */
package stonelabexam2;

import java.util.ArrayList;

/**
 *
 * @author dwettlaufer
 */
public class TestDriver
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //ArrayList
        ArrayList<Animal> zoo = new ArrayList<Animal>();
        
         Animal cat = new Animal("Mr. Kitty", "Black", 12);
         Animal cat2 = new Animal("Pickles", "Grey", 10);
        
         Fish fish1 = new Fish("Shark", "Silver", 250.1, "Saltwater", 7.0);
         Fish fish2 = new Fish("Sharky", "Silver", 260.2, "Saltwater", 9.0);
         
         Fish fish3 = new Fish("Copernicus", "Silver", 260.2, "Saltwater", 9.0);

        //Add elements to the ArrayList
        zoo.add(fish1);
        zoo.add(fish2);
        zoo.add(fish3);
        zoo.add(cat);
        zoo.add(cat2);

        //ForEach Loop
        for (Animal creature: zoo){
           System.out.print(creature + "\n");
        }
       
        //Test equals
         
        for (Animal creature: zoo){
           System.out.print(fish1.equals(creature) + "\n");
        }
        
         //System.out.println(fish1.equals(fish2));
         //System.out.println(cat.equals(cat2));
         //System.out.println(fish1);
        
    }
}
