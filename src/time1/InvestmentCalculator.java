package time1;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author User1
 */
public class InvestmentCalculator {
    
    
    public static void main(String[] args){
    //Initial principal 
    BigDecimal principal = BigDecimal.valueOf(1200, 0);
    BigDecimal rate = BigDecimal.valueOf(0.1);
    
    //Create a header
    System.out.printf("Put away 100$ per month the first year you work.%n");
    System.out.printf("%4s%20s%n", "year","Amount on deposit");
            
    for (int year = 0; year <= 10; year++)
    {
        BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
        System.out.printf("%4s%20s%n", year,
                NumberFormat.getCurrencyInstance(Locale.CANADA).format(amount));
        principal = principal.add(BigDecimal.valueOf(1200));
    }
    
    }//end of main method
    
}//end of Investment Calculator
