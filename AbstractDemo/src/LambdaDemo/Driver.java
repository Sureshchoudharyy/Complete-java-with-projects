package LambdaDemo;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
//        ThreadDemo t = new ThreadDemo();
//        t.start();
//        t.join();
        Runnable task = () -> {
            for(int i=0;i<5;i++){
                System.out.println("Hello");
            }
        };
        new Thread(task).start();
        for(int i=0;i<5;i++){
            System.out.println("main.....");
        }
    }
}
