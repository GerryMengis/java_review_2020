package OOP.Abstract;

abstract class Bike {
    // constructor can create in abstract class
    Bike() {
        System.out.println("Bike is created");
    }
    // abstract method not allowed to have 
    // to have an abstract method this class class must be abstract
    abstract void run();

    // non-abstract method can create
    void chargeGear() {
        System.out.println("Gear charged");
    }
}

public class Honda extends Bike {
   
    void run() {
        System.out.println("Running safe");
    }
    public static void main(String[] args) {
        
        Bike h = new Honda();
        h.run();
        h.chargeGear();
  
    }
}