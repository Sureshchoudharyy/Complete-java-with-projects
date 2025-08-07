public class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
    void sound(){
        System.out.println("Animal is making some sound....");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating...");
    }
    void sound(){
        System.out.println("barking...");
    }
}
