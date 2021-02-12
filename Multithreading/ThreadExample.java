package Multithreading;

public class ThreadExample extends Thread{


    public void run() {

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
        
        ThreadExample t1 = new ThreadExample();
        ThreadExample t2 = new ThreadExample();
        ThreadExample t3 = new ThreadExample();

        System.out.println(t1.getName());
        t1.setName("Gerry");
        System.out.println("t1 name :" + t1.getName());   
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("ti priority is: " + t1.getPriority());
     
        t1.start();
        t2.start();

        try{t2.join(3000); //wait for 3000 millisecond t1 to run then perform the next step
        } catch (InterruptedException e)
        {
            t2.getStackTrace();
        }

        t3.start();

       
    }
}
