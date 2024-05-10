class BankAccount{

    int accountnumber;
    String name;
    int balance;
    public BankAccount(int accountnumber, String name, int balance){
        this.accountnumber=accountnumber;
        this.name=name;
        this.balance=balance;


    }
    public void withdraw(int amount){
        if(balance > amount){
            balance -= amount;

        }else{
            System.out.println("Insufficient balance");

        }
       
        
    }
    public void deposit(int amount){
        balance += amount;
    }
    public void bankDetails(){
        System.out.println(accountnumber +  " " + name +  " " + balance);
    }
    public int  getBalance(){
        return balance;
    }
}
class SavingAccount extends BankAccount{
    public SavingAccount(int account , String name, int balance){
        super(account, name, balance);
    }

   @Override
   public void withdraw(int amount){
    if(balance - amount <100){
        System.out.println("Balance is at minimum");

    }
    else{
        super.withdraw(amount);
    }
   }
}

public class Inherit3 {
    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount(1001, "Arun", 1000);
        BankAccount customer2 = new BankAccount(1002, "Vaibhav", 100);
        customer1.bankDetails();
        customer2.bankDetails();
        customer1.withdraw(600);
        customer2.deposit(300);
        customer1.bankDetails();
        customer2.bankDetails();
        SavingAccount customer3= new SavingAccount(1003, "Kiyan", 500);
        SavingAccount customer4= new SavingAccount(1004, "Dikshika", 200);
        customer3.bankDetails();
        customer4.bankDetails();
        customer3.withdraw(450);
        customer4.withdraw(100);
        customer3.bankDetails();
        customer4.bankDetails();

    }
    
}
