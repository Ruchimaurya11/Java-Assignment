package Core_JavaMain;

class Studentt {
 String name;
 int age;

 
 Studentt(String name, int age) {
     this.name = name;
     this.age = age;
 }


 void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

public class C7_1ParameterizedConstructor {
 public static void main(String[] args) {
    
	 Studentt student1 = new Studentt("Ayan", 10);

     
     student1.displayDetails();  
 }
}
