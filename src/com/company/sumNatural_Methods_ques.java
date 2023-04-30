package com.company;

public class sumNatural_Methods_ques {
    static int sum_natural(int a){
        if(a==1){
            return 1;
        }
        return a + sum_natural(a-1);
    }
    public static void main(String[] args) {
        System.out.println(sum_natural(4));
    }
}
