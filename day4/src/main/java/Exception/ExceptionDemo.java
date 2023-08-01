package Exception;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.print("Enter a one digit number: ");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        try{
            System.out.println(500/num);
        }catch(ArithmeticException e){
            System.out.println("Can't divide by 0");
        }finally {
            System.out.println("Checked");
        }
    }

}
