package service;

import dao.DbConnect;
import dao.MySql;

public class BookingService {
    DbConnect dbConnect;
    public BookingService(){
        dbConnect = new MySql();
    }
    void doBooking(){
        dbConnect.databaseProperty();
        System.out.println("Booking done");
    }
}
