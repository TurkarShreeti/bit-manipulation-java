package com.company;

public class getbit {
    public static void main(System args[]){
        int n= 5; //n= 0101
        int pos = 3;
        int bitMask = 1<<pos;

        if((bitMask & n)==0){
            System.out.println("bit was zero");

        }
        else{
            System.out.println("bit was non-zero");
        }
    }
}
