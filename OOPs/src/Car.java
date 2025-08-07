public class Car {
    int speed;
    String color;

    public void run(){
        System.out.println("Car is running at "+speed);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.speed = 80;
        c1.run();
    }
}
