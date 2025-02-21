package Core_JavaMain;

public class C5_2DiffDatatype {

    // Method to find the maximum of two integers
    public int findMaximum(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    // Method to find the maximum of two double values
    public double findMaximum(double num1, double num2) {
        return (num1 > num2) ? num1 : num2;
    }

    // Method to find the maximum of two strings based on their length
    public String findMaximum(String str1, String str2) {
        return (str1.length() > str2.length()) ? str1 : str2;
    }

    // Main method to test method overloading
    public static void main(String[] args) {
        // Create an object of C5_2DiffDataType
    	C5_2DiffDatatype obj = new C5_2DiffDatatype();

        // Test the method with integers
        int int1 = 10, int2 = 20;
        System.out.println("Maximum of integers: " + obj.findMaximum(int1, int2));

        // Test the method with doubles
        double double1 = 15.5, double2 = 10.3;
        System.out.println("Maximum of doubles: " + obj.findMaximum(double1, double2));

        // Test the method with strings
        String str1 = "Hello", str2 = "World!";
        System.out.println("Maximum of strings: " + obj.findMaximum(str1, str2));
    }
}
