package Core_JavaMain;

class C9_1DemonstratesInheritance {
 String name;

 public C9_1DemonstratesInheritance(String name) {
     this.name = name;
 }

 public void greet() {
     System.out.println(name + " says hello!");
 }
}

 
class C9_1DemonstratesInheritanceChild extends C9_1DemonstratesInheritance {

 public C9_1DemonstratesInheritanceChild(String name) {
     super(name);  
 }

 public void play() {
     System.out.println(name + " is playing!");
 }
}

public class Main {
 public static void main(String[] args) {
     
     C9_1DemonstratesInheritance parent = new C9_1DemonstratesInheritance("Mom");
     parent.greet();

     
     C9_1DemonstratesInheritanceChild child = new C9_1DemonstratesInheritanceChild("Tommy");
     child.greet();   
     child.play();   
 }
}
