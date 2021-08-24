package abstractwkshtemployee;

import java.util.*;
import java.lang.*;
/**
 *
 * @author DIANAR
 */
public class Abstractwkshtemployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        	ArrayList<Employee> emps = new ArrayList<Employee>();

		emps.add(new Salaried("Albert Einstein", "123 My Street", "Your Town", 75000));
		emps.add(new Waged("Isaac Newton", "123 E. Wilson", "Sunset", 60.0, 8.50));
		emps.add(new Salaried("Cranston Snort", "1600 Pennsylvania Ave", "Washington", 40000));
		emps.add(new Waged("Wilson", "1492 USA Way", "Morristown", 35.0, 11.15));
		emps.add(new Sales("John Smith", "417 El Toro", "Irvine", 54000, 0.05, 150000));

		for (Employee e : emps)
			System.out.printf("%s \nCalculated Pay: $%10.2f\n", e, e.calcPay());
    }
}
