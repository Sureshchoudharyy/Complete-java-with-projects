package LockDemo;

public class Driver {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        Runnable t1 = ()->acc.withdraw("suresh",5000);
        Runnable t2 = ()->acc.withdraw("surya",500);
        new Thread(t1).start();
        new Thread(t2).start();
    }
}
