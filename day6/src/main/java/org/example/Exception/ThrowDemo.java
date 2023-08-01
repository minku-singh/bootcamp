package org.example.Exception;

import java.io.IOException;

class User{
    public void checkEligibility(int age){
        if(age >= 18){
            System.out.println("Eligible to vote");
        }else{
            throw new ArithmeticException("Not eligible to vote");
        }
    }

    public void checkEligibility2(int age) throws IOException{
        if(age >= 18){
            System.out.println("Eligible to vote");
        }else{
            throw new IOException("Not eligible to vote");
        }
    }
}
public class ThrowDemo {
    public static void main(String[] args) throws IOException {
        User u1 = new User();

        try{
            u1.checkEligibility(15);
            u1.checkEligibility2(34);
        }catch (Exception e){
            System.out.println("Error occured");
        }

    }

}
