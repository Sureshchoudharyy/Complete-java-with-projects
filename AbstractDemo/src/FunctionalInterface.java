@java.lang.FunctionalInterface
public interface FunctionalInterface{
    int add(int a,int b);

    default void m1(){
        System.out.println("This is default method");
    }
}

//class Child implements FunctionalInterface{
//    @Override
//    public int add(int a, int b) {
//        return a+b;
//    }
//}

class Addition{
    public static void main(String[] args) {
//        Child c = new Child();
        FunctionalInterface fi = (a,b)->a+b;
        System.out.println(fi.add(3,4));
    }
}
