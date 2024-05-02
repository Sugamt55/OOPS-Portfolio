package Week3;
import java.util.Scanner;

public class ReverseWords {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String reversedSentence = reverseWords(inputSentence);

        System.out.println("Reversed sentence: " + reversedSentence);

        scanner.close();
    }

    public static String reverseWords(String sentence) {
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(sentence);

        while (scanner.hasNext()) {
            String word = scanner.next();
            String reversedWord = reverseString(word);
            result.append(reversedWord).append(" ");
        }

        scanner.close();

        return result.toString().trim(); // Remove trailing space
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
