package OOP.Abstract;


interface A {

   public void a();

   public void b();

   default void x() {
       System.out.println("default x from interface");
   }

   static int cube(int x) {
       return x*x*x;}  
}

interface B {
    void c();
}

abstract class M implements A, B {
    M() {
        System.out.println("class method in abstract class");
    }
    public void a() {
        System.out.println("abstract a interface A is running");
    }

    public void b() {
        System.out.println("abstract b interface A is running ");
    }

    public void c() {
        System.out.println("abstract c interface B is running");
    }

    abstract void d();

    public void e() {
        System.out.println("non-abstract e method in abstract class is running ");
    }

}

class N extends M {
    // public void a() {
    //     System.out.println("extended a interface A is running");
    // }
    public void b() {
        System.out.println("extended b interface A is running ");
    }

    public void c() {
        System.out.println("extended c interface B is running");
    }

    void d() {
        System.out.println("abstract d is running ");
    }
}


 public class InterfaceAbstract {
    public static void main(String[] args) {

        N objn = new N();
        A a = new N();
        B b = new N();
        objn.a();
        objn.b();
        objn.c();
        objn.d();
        objn.e();
        a.a();
        a.b();
        b.c();
        a.x();
        objn.x();
        int staticInterface = A.cube(5);
        System.out.println(staticInterface);
    }
}
