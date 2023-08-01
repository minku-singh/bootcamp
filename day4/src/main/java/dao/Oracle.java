package dao;

public class Oracle implements DbConnect{
    @Override
    public void databaseProperty() {
        System.out.println("Connected with Oracle db");
    }
}
