package Multithreading;


public class Runnablethrtead implements Runnable {
    public void run() {
        System.out.println("Thread start running ...");
        for (int i = 0; i <5; i++) {
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        Runnablethrtead rt = new Runnablethrtead();
        Thread t1 = new Thread(rt);

        System.out.println(t1.getName());
        t1.setName("Gerry");
        System.out.println("t1 name :" + t1.getName());   
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("ti priority is: " + t1.getPriority());

        t1.start();
    }
    
}
