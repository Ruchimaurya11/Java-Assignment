package Core_JavaMain;

import java.util.Scanner;

public class C2_2Calculator {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.println("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        
	        System.out.println("Choose an operation (+, -, *, /, %): ");
	        char operator = scanner.next().charAt(0);

	        double result = 0;
	        boolean isValidOperation = true;

	        
	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                    isValidOperation = false;
	                }
	                break;
	            case '%':
	                if (num2 != 0) {
	                    result = num1 % num2;
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                    isValidOperation = false;
	                }
	                break;
	            default:
	                System.out.println("Invalid operator!");
	                isValidOperation = false;
	        }

	        
	        if (isValidOperation) {
	            System.out.println("Result: " + result);
	        }

	        
	        System.out.println("Relational Operations:");
	        System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
	        System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
	        System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
	        System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));

	        scanner.close();
	    }

}
