public class Exceptions {
    public static void main(String[] args) {
        System.out.println("Hello, I am suresh");
        System.out.println("I am graduate engineer");
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("Exception : "+e.getMessage());
            System.out.println(e.toString());
        }
        System.out.println("How can i help you!");
    }
}
