package abstractwkshtemployee;

/**
 * @author s515012
 */
public class Address extends Abstractwkshtemployee 
{
   private String city;
   private String street;
   
   public Address (String cityA, String streetA){
      this.city = cityA;
      this.street = streetA;
   }
   
   public String toString(){
       return "\nCity: " + this.city +
              "\nStreet: " + this.street;
   }
}
