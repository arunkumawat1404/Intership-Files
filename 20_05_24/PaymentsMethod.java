
//product
interface Payments{
     
    public void proceesPayment(double amount);

}
//concrete product
class CreditCard implements Payments{
    public void proceesPayment(double amount){
        System.out.println("Credit card transaction is done of amount " + amount);
    }
}
class DebitCard implements Payments{
    public void proceesPayment(double amount){
        System.out.println(" Debit card transaction is done of amount " + amount);
    }
}
class Paypal implements Payments{
    public void proceesPayment(double amount){
        System.out.println(" Paypal Transaction of  amount " + amount);
    }
}
// factory

class Tranaction {
    public Payments getPaymentType(String paymentType){
        if(paymentType.equalsIgnoreCase("Credit Card")){
            return new CreditCard();
        }
        else if(paymentType.equalsIgnoreCase("Debit Card")){
            return new DebitCard();
        }
        else if(paymentType.equalsIgnoreCase("Paypal")){
            return new Paypal();
        }
        return null;
    }
}
public class PaymentsMethod {

    public static void main(String[] args) {

        Tranaction payment = new Tranaction();
        Payments  payment1 =payment.getPaymentType("Credit Card");
        payment1.proceesPayment(1500);
        Payments  payment2 =payment.getPaymentType("Debit Card");
        payment2.proceesPayment(500);
        Payments  payment3 =payment.getPaymentType("Paypal");
        payment3.proceesPayment(2500);
    }
    
}
