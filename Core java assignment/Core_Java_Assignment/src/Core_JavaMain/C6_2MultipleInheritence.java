package Core_JavaMain;


class Person {
 String name;

 
 Person(String name) {
     this.name = name;
 }

 
 void showDetails() {
     System.out.println("Name: " + name);
 }
}

class Employee extends Person {
 double salary;


 Employee(String name, double salary) {
     super(name);  
     this.salary = salary;
 }

 
 void showEmployeeDetails() {
     showDetails();  
     System.out.println("Salary: " + salary);
 }
}

class Manager extends Employee {
 String department;

 Manager(String name, double salary, String department) {
     super(name, salary);  
     this.department = department;
 }

 void showManagerDetails() {
     showEmployeeDetails();  
     System.out.println("Department: " + department);
 }
}

public class C6_2MultipleInheritence {
 public static void main(String[] args) {
    
     Manager manager = new Manager("Ruchi", 50000, "Frontend Developer");

  
     manager.showManagerDetails();
 }
}
