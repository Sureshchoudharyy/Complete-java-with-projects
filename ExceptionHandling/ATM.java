public class ATM {
    public static void main(String[] args) {
        try{
            withdraw(1000,1500);
        }
        catch (CustomException e){
            System.out.println(e);
        }
    }

    public static void withdraw(int bal, int amt) throws CustomException{
        if(amt>bal){
            throw new CustomException("Insufficient Balance");
        }
        System.out.println("Successful Withdrawal");
    }
}
