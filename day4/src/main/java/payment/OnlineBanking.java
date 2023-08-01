package payment;

public class OnlineBanking implements Payment {
    @Override
    public void doPayment(){
        System.out.println("Payment done");
    }
}
