// Implementmultiple catch blocks for different types of exceptions.

package Core_JavaMain;
import java.util.Scanner;
import java.util.InputMismatchException;

public class C12_2MultipleCatchBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            
            int result = num1 / num2;
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numbers only!");
        } finally {
            System.out.println("Execution completed.");
            scanner.close(); 
        }

        System.out.println("Program continues...");
    }
}
