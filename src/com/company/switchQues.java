package com.company;

import java.util.Scanner;

public class switchQues {
    public static void main(String[] args) {
//        System.out.println("Enter: ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        String day = new String("day");
//        switch (num){
//            case 1:
//                day = "Monday";
//                break;
//            case  2:
//                day = "Tuesday";
//                break;
//            case 3:
//                day = "Wednesday";
//                break;
//            case 4:
//                day ="Thusday";
//                break;
//            case 5:
//                day = "Friday";
//                break;
//
//        }
//        System.out.println("The number " + num + " is for " + day);

//        Question 6
        System.out.println("Write your sentence: ");
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();
        if(website.endsWith(".org")){
            System.out.println("It is Organisational website");
        }
        else if(website.endsWith(".in")){
            System.out.println("It is International website");
        }
        else if(website.endsWith(".com")){
            System.out.println("It is National website");
        }

    }
}
