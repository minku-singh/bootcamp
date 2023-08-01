package org.example.app;

class Account{
    int id;
    String name;
    int balance;

    public Account(){
        super();
    }

    public Account(int id, String name, int balance){
        super();
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

}

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account(1, "Minku", 200);
    }
}
