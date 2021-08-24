/*
 * Author: Doug Wettlaufer
 * Course: 44-241-1
 * Date:
 * Description:
 */

package stonelabexam2;

/**
 *
 * @author dwettlaufer
 */
public class Animal
{
    private String name;
    private String color;
    private double weight;

   
    public Animal(String name, String color, double weight)
    {
        this.name = name;
        this.color = color;
        this.weight = weight;

    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }


    //equals
	@Override
	public boolean equals(Object o) {
		if(o instanceof Animal){
			return this.weight ==((Animal)o).weight 
				&& this.name.equals(((Animal)o).name)
				&& this.color.equals(((Animal)o).color);
		}
		else{
			return false;		
		}
	}

   //toString
	 @Override
	public String toString(){
		 return "\nName: " + this.name 
			 + "\nColor: " + this.color 
			 + "\nWeight: " + this.weight + " lb";
	 }
}
