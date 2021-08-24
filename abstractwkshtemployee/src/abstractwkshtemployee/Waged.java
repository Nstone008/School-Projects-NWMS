package abstractwkshtemployee;

/**
 * @author s515012
 */
public class Waged extends Employee
{
      private double hour;
      private double wages;
   
     public Waged(String employname, String streetname, String homecity, 
             double hours, double wage){
        super(employname, streetname, homecity);
        this.hour = hours;
        this.wages = wage;
     }
     
      @Override
     public String toString(){
        return super.toString() +
               "\nHours: " + this.hour +
               "\nWage: " + this.wages;
     }
      
     public double calcPay(){
        return this.hour * this.wages;
     }
}
