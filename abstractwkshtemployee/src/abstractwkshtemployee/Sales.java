package abstractwkshtemployee;

/**
 * @author s515012
 */
public class Sales extends Salaried
{
      private double commission;
      private double totSales;
      
      public Sales(String employname, String streetname, String homecity,
               double salaryamount, double comiss, double toSales){
         super(employname, streetname, homecity, salaryamount);
         this.commission = comiss;
         this.totSales = toSales;
      }
      
      @Override
      public String toString(){
         return "troll";
      }
      
      @Override
      public double calcPay(){
         return super.calcPay() + commission * totSales;
      }
  
}
