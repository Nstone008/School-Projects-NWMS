package abstractwkshtemployee;

/**
 * @author s515012
 */
public class Salaried extends Employee
{
      private double salary;
      
      public Salaried(String employname, String streetname, String homecity,
               double salaryamount){
         super(employname, streetname, homecity);
         this.salary = salaryamount;
      }
      
      @Override
      public String toString(){
         return super.toString() +
                "\nSalary: " + this.salary;                
      }
      
      public double calcPay(){
         return this.salary / 24;
      }
}
