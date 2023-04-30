package com.company;

public class clearbit {
    public static void main(String args[]){
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int newNember = ~(bitMask);
        newNember= newNember&n;
        System.out.println(newNember);
    }
}
