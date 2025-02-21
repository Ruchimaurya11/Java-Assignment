package Core_JavaMain;

public class C4_2Constructor {
    
    private String name;
    private int age;
    private String course;

   
    public C4_2Constructor(String name) {
        this.name = name;
        this.age = 0;  
        this.course = "Not Assigned"; 
    }

    
    public C4_2Constructor(String name, int age) {
        this.name = name;
        this.age = age;
        this.course = "Not Assigned"; 
    }

    
    public C4_2Constructor(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

   
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    
    public static void main(String[] args) {
        
        C4_2Constructor person1 = new C4_2Constructor("Ruchi");
        C4_2Constructor person2 = new C4_2Constructor("Ayan", 10);
        C4_2Constructor person3 = new C4_2Constructor("Rudra", 3, "Class");

        
        System.out.println("Person 1 Details:");
        person1.displayDetails();

        System.out.println("\nPerson 2 Details:");
        person2.displayDetails();

        System.out.println("\nPerson 3 Details:");
        person3.displayDetails();
    }
}
