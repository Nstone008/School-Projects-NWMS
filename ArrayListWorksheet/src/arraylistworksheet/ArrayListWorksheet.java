package arraylistworksheet;

/**
 * @author s515012
 */
import java.util.*;
public class ArrayListWorksheet 
{
    public static void main(String[] args) 
    {
     ArrayList<Sales> salesList = new ArrayList<Sales>();
     
     Sales obj1 = new Sales("June", 3456, 55566.75);
     Sales obj2 = new Sales("Todd", 3444, 201.99);
     Sales obj3 = new Sales("Bev", 5555, 42301.00);
     
     salesList.add(obj1);
     salesList.add(obj2);
     salesList.add(obj3);
     
     salesList.get(1).setBalance(105.15);
     
     //System.out.println(salesList.get(0));
     //System.out.println(salesList.get(1));
     //System.out.println(salesList.get(2));
     
     salesList.remove(1);
     
     
     for (Sales customer: salesList){
        System.out.print(customer.getCustomerName() + "\n");
     }
     
     double balance = 0;
     for (int i = 0; i < salesList.size(); i++){
        System.out.println(salesList.get(i).getCustomerName() + " "
                + salesList.get(i).getBalance());
        balance += salesList.get(i).getBalance();
     }
     System.out.println(balance);
    }

}
