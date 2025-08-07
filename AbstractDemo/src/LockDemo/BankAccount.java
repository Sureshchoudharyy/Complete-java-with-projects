package LockDemo;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int bal = 2000;
    private final ReentrantLock rl = new ReentrantLock();
    public void withdraw(String threadName, int amt){
        System.out.println(threadName+" is trying to withdraw "+amt);
        rl.lock();
        try{
            System.out.println(threadName+" acquired lock");
            if(bal>=amt){
                Thread.sleep(2000);
                bal -= amt;
                System.out.println("Withdraw successful");
                System.out.println("Remaining Balance "+bal);
            }
            else{
                System.out.println("Insufficient balance!");
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        finally {
           rl.unlock();
        }
    }
}
