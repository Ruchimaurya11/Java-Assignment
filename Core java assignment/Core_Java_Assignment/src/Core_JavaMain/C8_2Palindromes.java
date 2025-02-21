package Core_JavaMain;
import java.util.Scanner;

public class C8_2Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

       
        String reversedString = new StringBuilder(input).reverse().toString();

        
        if (input.equalsIgnoreCase(reversedString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }
}
