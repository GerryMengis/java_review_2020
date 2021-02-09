package Interview_question_review;

class ABC {
    private double num = 100;

    private int square(int a) {
        return a * a;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }
}

class B extends ABC {
    
}

public class Test {
    public static void main(String args[]) {
        ABC obj = new ABC();
        B b = new B();
        System.out.println(obj.getNum());
        // System.out.println(b.square(10));
    }  
 }