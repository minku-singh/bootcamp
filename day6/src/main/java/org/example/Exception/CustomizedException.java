package org.example.Exception;

class InvalidAgeException extends RuntimeException{
    String msg;

    public InvalidAgeException(String msg){
        super();
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }
}

class Customer{
    public void checkEligibility(int age){
        if(age >= 18){
            System.out.println("eligible");
        }else{
            throw new InvalidAgeException("age below 18, not eligible");
        }
    }
}

public class CustomizedException {
    public static void main(String[] args) {
        Customer c1 = new Customer();

        try{
            c1.checkEligibility(17);
        }catch (InvalidAgeException e){
            e.getMsg();
        }

    }
}
