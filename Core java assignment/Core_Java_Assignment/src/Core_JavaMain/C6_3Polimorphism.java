package Core_JavaMain;

class Employer {
 
 void role() {
     System.out.println("I am an employer.");
 }
}


class Employe extends Employer {
 
 @Override
 void role() {
     System.out.println("I am an employee.");
 }
}

public class C6_3Polimorphism {
 public static void main(String[] args) {
     
     Employer employer = new Employer();  
     Employer employe = new Employe(); 

     
     employer.role(); 
     employe.role(); 
 }
}
