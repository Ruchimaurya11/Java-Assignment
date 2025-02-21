package Core_JavaMain;

public class C5_1MaximumNumber {

    // Method to find the maximum of three numbers
    public int findMaximum(int num1, int num2, int num3) {
        int max = num1;  // Assume num1 is the maximum

        // Compare num2 with current maximum
        if (num2 > max) {
            max = num2;
        }

        // Compare num3 with current maximum
        if (num3 > max) {
            max = num3;
        }

        return max;  // Return the maximum number
    }

    // Main method to test the findMaximum method
    public static void main(String[] args) {
        // Create an object of C5_1MaximumNumber
        C5_1MaximumNumber obj = new C5_1MaximumNumber();

        // Test the method with different sets of numbers
        int num1 = 10, num2 = 20, num3 = 15;
        int max = obj.findMaximum(num1, num2, num3);

        // Display the maximum number
        System.out.println("The maximum number is: " + max);
    }
}
