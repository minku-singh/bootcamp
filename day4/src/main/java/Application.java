import payment.Payment;
import payment.UPI;
import service.BookingService;

public class Application {
//    BookingService bookingService = new BookingService();
//    bookingService.doBooking();

    public static void main(String[] args) {
        Payment p1 = new UPI();
        p1.doPayment();
    }


}
