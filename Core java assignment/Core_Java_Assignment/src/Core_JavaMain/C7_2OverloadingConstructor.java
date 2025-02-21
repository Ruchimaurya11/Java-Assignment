//Demonstrate constructor overloading by passing different types of parameters.

package Core_JavaMain;


class PersonOne {
    String name;
    int age;
    String address;

    
    PersonOne(String name) {
        this.name = name;
        this.age = 0;  
        this.address = "Unknown";  
    }

 
    PersonOne(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = "Unknown";
    }

   
    PersonOne(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

  
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

public class C7_2OverloadingConstructor {
    public static void main(String[] args) {
        
        PersonOne person1 = new PersonOne("Ruchi");  
        PersonOne person2 = new PersonOne("Ayan", 10); 
        PersonOne person3 = new PersonOne("Rudra", 3, "Dehli"); 
        System.out.println("Person 1 Details:");
        person1.displayDetails();
        System.out.println();

        System.out.println("Person 2 Details:");
        person2.displayDetails();
        System.out.println();

        System.out.println("Person 3 Details:");
        person3.displayDetails();
    }
}
