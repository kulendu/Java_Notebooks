package com.kulendu.conditional_operations;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Welcome to Leap Year Calculator");
        System.out.println("Enter the year: ");

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // checking the conditions for the year
        if (year % 400 == 0){
            System.out.println(year + " is a Leap Year");
        }else if(year % 100 == 0){
            System.out.println(year + " is not a Leap Year");
        }else if(year % 4 == 0){
            System.out.println(year + " is not  Leap Year");
        }else{
            System.out.println(year + " is not a Leap Year");
        }
    }
}
