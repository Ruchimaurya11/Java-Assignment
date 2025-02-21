package Core_JavaMain;

// Define the Student class
class Student {
    // Attributes
    private String name;
    private int age;

    // Constructor to initialize attributes
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class C4_1Method {

    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Rudra", 3);

        // Display the student's details
        student.displayDetails();
    }
}