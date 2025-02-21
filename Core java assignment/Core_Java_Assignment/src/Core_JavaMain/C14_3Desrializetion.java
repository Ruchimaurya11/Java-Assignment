// Createaprogramthatdemonstrates object serialization and deserialization.

package Core_JavaMain;

import java.io.*;

class Personmain implements Serializable {
 private String name;
 private int age;
 
 // Constructor
 public Personmain(String name, int age) {
     this.name = name;
     this.age = age;
 }
 
 
 @Override
 public String toString() {
     return "Person[name=" + name + ", age=" + age + "]";
 }
}

public class C14_3Desrializetion {
 public static void main(String[] args) {
     
	 Personmain person = new Personmain("Ayan", 10);
     
     
     try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
         out.writeObject(person);
         System.out.println("Person object serialized: " + person);
     } catch (IOException e) {
         e.printStackTrace();
     }

     
     try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {
    	 Personmain deserializedPerson = (Personmain) in.readObject();
         System.out.println("Person object deserialized: " + deserializedPerson);
     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 }
}
