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
public class Fish extends Animal
{
    private String waterType;
    private double length;

    public Fish(String name, String color, double weight, 
                                                String waterType, double length)
    {
        super(name, color, weight);
        this.waterType = waterType;
        this.length = length;

    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public String getWaterType()
    {
        return waterType;
    }

    public void setWaterType(String waterType)
    {
        this.waterType = waterType;
    }

    //equals
	@Override
	public boolean equals(Object o) {
		if(o instanceof Animal){
			return super.equals(o) &&
			this.waterType.equals(((Fish)o).waterType)
			&& this.length == ((Fish)o).length;
		}
		else{
			return false;		
		}
	}
    //toString
    @Override
	public String toString(){
		 return super.toString()
			 + "\nWater Type: " + this.waterType
			 + "\nLength: " + this.length;
	 }

}
