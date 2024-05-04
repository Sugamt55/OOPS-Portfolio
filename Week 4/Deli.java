package Week4;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Deli{
	
   public static void main (String[] args) {
      final double OUNCES_PER_POUND = 16.0;

      double pricePerPound;
      double weightOunces;
      double weight;
      double totalPrice;

      @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);

      NumberFormat money = NumberFormat.getCurrencyInstance();
      DecimalFormat fmt = new DecimalFormat("#.##");

      System.out.println ("*****  CS Deli  *****\n");
        
      System.out.print ("Enter the price per pound of your item: ");
      pricePerPound = scan.nextDouble();

      System.out.print ("Enter the weight (ounces): ");
      weightOunces = scan.nextDouble();
      System.out.print("\n");

      weight = weightOunces / OUNCES_PER_POUND;
      totalPrice = pricePerPound * weight;

      System.out.println("Unit Price: " + money.format(pricePerPound) + " per pound");
      System.out.println("Weight: " + fmt.format(weight) + " pounds\n");
      System.out.print("\n");
      System.out.println("TOTAL: " + money.format(totalPrice));
   }
}