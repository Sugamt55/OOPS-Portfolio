package Week2;
import java.util.Scanner;

public class FractionToDecimal {
	
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator of the fraction: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator of the fraction: ");
        int denominator = scanner.nextInt();

        double decimalEquivalent = (double) numerator / denominator;

        System.out.println("Decimal equivalent of the fraction: " + decimalEquivalent);
    }
}