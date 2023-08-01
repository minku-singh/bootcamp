package dao;

public class MySql implements DbConnect{
    @Override
    public void databaseProperty() {
        System.out.println("Connected to MySQL");
    }
}
