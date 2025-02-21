package Core_JavaMain;

public class C4_3Encapsulation {
    
    private String name;
    private int age;
    private String course;

    
    public C4_3Encapsulation(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

   
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public int getAge() {
        return age;
    }

    
    public void setAge(int age) {
        if (age > 0) {  
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    
    public String getCourse() {
        return course;
    }

  
    public void setCourse(String course) {
        this.course = course;
    }

    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    
    public static void main(String[] args) {
        
        C4_3Encapsulation person = new C4_3Encapsulation("Ayan", 10, "Java Programming");

       
        System.out.println("Before update:");
        person.displayDetails();

       
        person.setName("Ruchi");
        person.setAge(25);
        person.setCourse("Java");

        
        System.out.println("\nAfter update:");
        person.displayDetails();
    }
}
