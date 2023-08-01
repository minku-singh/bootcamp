package payment;

public class UPI implements Payment {
    @Override
    public void doPayment(){
        System.out.println("Payment done");
    }
}
