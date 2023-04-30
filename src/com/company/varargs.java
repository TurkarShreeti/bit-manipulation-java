package com.company;

public class varargs {
//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a,int b, int c, int d){
//        return a+b+c+d;
//    }

//    THE ABOVE CODE CAN BE RETURN AS:
    static int sum(int x,int... arr){  //atleast one argument is necessary
//        Available as int [] arr
        int result =x;
        for(int element: arr){
            result += element;

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The value of nothing is"+ sum(9));
        System.out.println("Sum of 4 and 6 is " + sum(4, 6));
        System.out.println("Sum of 5 , 9 and 10 is " + sum(5, 9, 10));
        System.out.println("Sum of 6, 9, 3, 7 is " + sum(6,9,3,7));
    }
}
