package Core_JavaMain;

public class C2_3Demonstrate {
	  public static void main(String[] args) {
	        
	        int intValue = 100;
	        double doubleValue = intValue; 

	        System.out.println("Implicit Typecasting:");
	        System.out.println("Integer Value: " + intValue);
	        System.out.println("Converted to Double: " + doubleValue);

	        
	        double originalDouble = 99.99;
	        int convertedInt = (int) originalDouble; 

	        System.out.println("\nExplicit Typecasting:");
	        System.out.println("Double Value: " + originalDouble);
	        System.out.println("Converted to Integer: " + convertedInt);

	        
	        char charValue = 'A';
	        int asciiValue = charValue; 
	        char newCharValue = (char) (asciiValue + 1); 

	        System.out.println("\nChar and Int Typecasting:");
	        System.out.println("Char Value: " + charValue);
	        System.out.println("ASCII Value of Char: " + asciiValue);
	        System.out.println("Next Char Value: " + newCharValue);
	    }

}
