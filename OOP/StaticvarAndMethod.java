package OOP;

class Practice{
    static int static_counter;
    int instance_counter;

    void counter(){
        static_counter++;
        instance_counter++;
    }

    void displayCount(){
        System.out.println("StaticCounter : " + static_counter);
        System.out.println("instance counter : " + instance_counter);
    }

    static void staticMethod(){
        System.out.println("Static counter : " + static_counter);
        // System.out.println("instance counter : " + instance_counter); 
        //only allowed to access static class variable 
        // i.e. instance_counter is non-static instance variable
    }

    void regilarMethod(){
        System.out.println("instance counter : " + instance_counter);
        System.out.println("Static counter : " + static_counter);
    }
}
public class StaticvarAndMethod {
    public static void main(String[] args) {
        Practice r1 = new Practice();
        Practice r2 = new Practice();
        Practice r3 = new Practice();
        r1.counter();
        r2.counter();
        r3.counter();
        r3.displayCount();

        // static and regular method
        Practice.staticMethod();
        r3.regilarMethod();
    }
    
}