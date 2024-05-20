abstract class  Bank{

    private int accountNumber;
    private double balance;
    private String name;

   public  Bank(int accountNumber , String name ){
    this.accountNumber=accountNumber;
    this.name=name;
    this.balance=0.0;
   }
   public int getAccountNumber(){
    return accountNumber;
   }
   public String getName(){
    return name;
   }
   public double getBalance(){
    return balance;
   }
   public abstract void  deposit(  double amount);
   public abstract  void withdraw(double amount);

}
class BankTranaction extends Bank{

    public BankTranaction(int accountNumber , String name){
        super(accountNumber, name);
       
    }

   @Override  
    public void deposit(double amount){
        

       double b= getBalance();
        b+= amount;


    }
    @Override 
    public void withdraw( double amount){
        double w=getBalance();
        w -=amount;

    }
    public void displayDetails(){
        System.out.println(" Account number " + getAccountNumber() + " Name " + getName() + " Balance "  + getBalance());
    }
}

public class Abstraction{
    public static void main(String[] args) {

        BankTranaction c1 =new BankTranaction(12345 , " Arun " );
       c1.deposit(500.0);
       c1.displayDetails();
        
    }

}