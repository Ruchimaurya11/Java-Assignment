package Core_JavaMain;

public class C5_3Staticvariable {
    
    // Static variable
    static int counter = 0;

    // Static method to increment counter
    public static void incrementCounter() {
        counter++;
    }

    // Static method to display the counter value
    public static void displayCounter() {
        System.out.println("Counter value: " + counter);
    }

    // Main method to test static variables and methods
    public static void main(String[] args) {
        // Display initial counter value
    	C5_3Staticvariable.displayCounter();  // Static method can be called without an object

        // Increment the counter using the static method
    	C5_3Staticvariable.incrementCounter();

        // Display updated counter value
    	C5_3Staticvariable.displayCounter();

        // Increment again and display
    	C5_3Staticvariable.incrementCounter();
    	C5_3Staticvariable.displayCounter();
    }
}
