package OOP.Abstract;

abstract class Bank {
    abstract int getRate();
}

class WallsFargo extends Bank {
    int getRate() {
        return 7;
    }
}
class Chase extends Bank {
    int getRate() {
        return 9;
    }
}
public class TestBank {
 public static void main(String[] args) {
     Bank wf = new WallsFargo();
     Bank c = new Chase();

     System.out.println(wf.getRate()); 
     System.out.println(c.getRate());
     
 }   
}
