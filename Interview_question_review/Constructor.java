package Interview_question_review;

class Constr {

    String name;
    private int i;

    Constr(String n) {
        name = n;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    Constr(Constr Ge) {
        name = Ge.name;
    }

    void display() {
        System.out.println("name is " + name);
    }

    String Constr(String name2) {
        return name2;
    }
}

public class Constructor {
    public static void main(String[] args) {

        Constr obj1 = new Constr("Gerry");
        obj1.display();

        Constr obj2 = new Constr(obj1);
        obj2.display();

        Constr obj3 = new Constr("fhbgihregr");

        System.out.println(obj3.Constr("Gerry M"));
        System.out.println(obj3.getI());

    }
}
