package com.telstra;

public class Calculation {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int subtract(int n1, int n2){
        return n1-n2;
    }

    public boolean checkEligibility(int age){
        if(age >= 18){
            return true;
        }else{
            return false;
        }
    }
}
