package Multithreading;

class Customer extends Thread{  
    int amount=10000;  
      
    synchronized void withdraw(int amount){  
    System.out.println("going to withdraw...");  
      
    if(this.amount<amount){  
    System.out.println("Less balance; waiting for deposit...");  
    try{wait();}catch(Exception e){}  
    }  
    this.amount-=amount;  
    System.out.println("withdraw completed...current balance is :"+this.amount );  
    }  
      
    synchronized void deposit(int amount) {
        System.out.println("going to deposit...");
        this.amount += amount;
        System.out.println("deposit completed... current balance is: " + this.amount);
        notify();
    }
    // Add interrupting thread   
    public void run() {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException("Thread interrupted ..." +e);
        }
    }
    // add Reentrant monitor
    public synchronized void m() {  
        n();  
        System.out.println("this is m() method");  
        }  

        public synchronized void n() {
            System.out.println("this is n() method");
        }
    }  
      
    class InterThread{  
    public static void main(String args[]){  
    final Customer c = new Customer();  
    
    new Thread(){  
    public void run(){c.withdraw(15000);}  
    }.start();  
    new Thread(){  
    public void run(){c.deposit(10000);}  
    }.start();
    
    // Adding interrupting thread
    Customer t1 = new Customer();
    t1.start();
    try{
        t1.interrupt();
    } catch (Exception e) {
        System.out.println("Exception handled");
    }
    
    // also add Reentrant Monitor by creating anonymous class  
    Thread t2 = new Thread(){
        public void run(){
            c.m();
        }
    };
    t2.start();
      
    }}