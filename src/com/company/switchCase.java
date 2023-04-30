package com.company;

import java.util.Scanner;

//WHEN WE WANT TO MAKE A CHOICE
public class switchCase {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("You are in correct age");
                break;
            case 23:
                System.out.println("Ready for job");
                break;
            case 45:
                System.out.println("You are not young anymore");
                break;
            case 60:
                System.out.println("Soon you will get retired");
                break;
            default:
                System.out.println("Enjoy your life");
        }
    }
}
