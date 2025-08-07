public class Exceptions2 {
    public static void main(String[] args){
        try{
            withdraw(1000,5000);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void withdraw(int bal, int amt) throws Exception{
        if(bal<amt){
            throw new Exception("Insufficient balance");
        }
            System.out.println("withdraw successful");
    }
}
