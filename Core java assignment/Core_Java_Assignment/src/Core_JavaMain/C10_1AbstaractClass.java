//  Create an abstract class and implement its methods in a subclass.



package Core_JavaMain;


abstract class C10_1AbstaractClass { 
 abstract void displayMessage();

 
 void show() {
     System.out.println("abstract class.");
 }


 public static void main(String[] args) {
     SubClass obj = new SubClass();
     obj.displayMessage(); 
     obj.show();           
 }
}

class SubClass extends C10_1AbstaractClass {
 @Override
 void displayMessage() {
     System.out.println("SubClass.");
 }
}
