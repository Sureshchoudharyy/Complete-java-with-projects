abstract class Vehicle{
    String brand;

    Vehicle(String brand){
        this.brand = brand;
    }

    abstract void start();

    public void m1(){
        System.out.println("this is m1");
    }
}

class Thar extends Vehicle{

    Thar(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("raa-tatatatataaaaattttttttt");
    }
}

public class Example1 {
    public static void main(String[] args) {
    Thar t = new Thar("Supra");
    t.start();
    }
}
