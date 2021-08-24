package abstractwkshtemployee;

/**
 * @author s515012
 */
public abstract class Employee extends Abstractwkshtemployee
{
      private String name;
      private String street;
      private String city;
      
      public Employee(String employname, String streetname, String homecity){
         this.name = employname;
         this.street = streetname;
         this.city = homecity;
      }
      
      @Override
      public String toString(){
         return "Name: " + this.name +
                "\nAddress: " + this.street +
                ", " + this.city;               
      }
      
      abstract double calcpay();
}
