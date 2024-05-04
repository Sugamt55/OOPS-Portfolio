package Week4;
import java.util.Random;
import java.util.Scanner;

public class PinEncryption {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 4 digit pin number to encrypt: ");
        int pin = scanner.nextInt();

        while (pin < 1000 || pin > 9999) {
            System.out.print("Invalid input. Please enter a 4 digit pin number: ");
            pin = scanner.nextInt();
        }

        String pinHex = Integer.toHexString(pin);

        int random1 = getRandomNumber();
        int random2 = getRandomNumber();

        String random1Hex = Integer.toHexString(random1);
        String random2Hex = Integer.toHexString(random2);

        String encryptedPin = random1Hex + pinHex + random2Hex;

        System.out.println("Your encrypted pin number is " + encryptedPin);

        scanner.close();
    }

    private static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(64535) + 1001;
    }
}