// Write a program that implements multiple interfaces in a single class.


package Core_JavaMain;

interface InterfaceA {
 void methodA();
}


interface InterfaceB {
 void methodB();
}

class C10_2multipleInSingle implements InterfaceA, InterfaceB {
 
 public void methodA() {
     System.out.println("Method A from InterfaceA implemented.");
 }

 
 public void methodB() {
     System.out.println("Method B from InterfaceB implemented.");
 }

 public static void main(String[] args) {
     C10_2multipleInSingle obj = new C10_2multipleInSingle();
     obj.methodA(); 
     obj.methodB();
 }
}
