public class Account {
    static int min_Bal=500;  // static 
    int acc_Bal = 5000;      //instance or non-static

    public void open_Account(){ 
        System.out.println("Account Opened Successfully");
    }
    public void deposit_Amount(){
        System.out.println("Deposited Successfully");
    }
    public void withdrawl_Amount(){
        System.out.println("Withdrawl Successfully");
    }
    public int get_Bal(){
        System.out.println("Getting the bal");
        return 0;
    }   
    public static void main(String[] args){
        Account obj=new Account();
        obj.open_Account();
        obj.deposit_Amount();
        obj.withdrawl_Amount();
        obj.get_Bal();
    }
}
