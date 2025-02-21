package Core_JavaMain;

class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }

    void attend() {
        System.out.println("Attend class");
    }

}
class Principle extends Teacher {
    
    Principle(String name) {
        super(name);
    }

    void attend() {
        System.out.println(name + " Regular class");
    }
}

public class C6_1Singleinheritence {
    public static void main(String[] args) {
        
     
        Principle principle = new Principle("Good");

        
        principle.attend();  
    }
}

