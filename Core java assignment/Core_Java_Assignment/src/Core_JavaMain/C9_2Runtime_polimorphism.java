package Core_JavaMain;
\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

//Parent class
class WritingInstrument {
 // Method to be overridden
 public void write() {
     System.out.println("Writing with a generic writing instrument");
 }
}

//Child class Pen that overrides the write method
class Pen extends WritingInstrument {
 @Override
 public void write() {
     System.out.println("Writing with a pen");
 }
}

//Child class Pencil that overrides the write method
class Pencil extends WritingInstrument {
 @Override
 public void write() {
     System.out.println("Writing with a pencil");
 }
}

//Child class Marker that overrides the write method
class Marker extends WritingInstrument {
 @Override
 public void write() {
     System.out.println("Writing with a marker");
 }
}

public class C9_2Runtime_polymorphism {
 public static void main(String[] args) {
     // Creating objects of WritingInstrument, Pen, Pencil, and Marker
     WritingInstrument instrument1 = new Pen();     // Child class object (Pen)
     WritingInstrument instrument2 = new Pencil();  // Child class object (Pencil)
     WritingInstrument instrument3 = new Marker();  // Child class object (Marker)

     // Calling the write method (runtime polymorphism happens here)
     instrument1.write();  // Calls Pen's write method
     instrument2.write();  // Calls Pencil's write method
     instrument3.write();  // Calls Marker's write method
 }
}
