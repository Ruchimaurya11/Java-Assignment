//o Implement an interface for a real-world example, such as a payment gateway.

package Core_JavaMain;


interface Vehicle {
 void start(); 
}


class Car implements Vehicle {
 @Override
 public void start() {
     System.out.println("Car");
 }
}

class Bike implements Vehicle {
 @Override
 public void start() {
     System.out.println("Bike");
 }
}


class Truck implements Vehicle {
 @Override
 public void start() {
     System.out.println("Truck");
 }
}


public class C10_3InterfaceInRealworld {
 public static void main(String[] args) {
     
     Vehicle car = new Car();
     Vehicle bike = new Bike();
     Vehicle truck = new Truck();

     
     car.start();
     bike.start();
     truck.start();
 }
}
