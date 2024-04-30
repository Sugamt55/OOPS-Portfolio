package Week2;
import java.util.Scanner;

public class SquareCalculations {
	
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the square's side: ");

        int sideLength = scanner.nextInt();

        int perimeter = 4 * sideLength;

        int area = sideLength * sideLength;

        System.out.println("Square's Perimeter: " + perimeter);
        System.out.println("Square's Area: " + area);
    }
}