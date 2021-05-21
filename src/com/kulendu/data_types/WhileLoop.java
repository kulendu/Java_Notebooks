package com.kulendu.data_types;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        while (num != 10){
            System.out.println("Enter 10.......");
            System.out.println("Enter the number: ");
            num = sc.nextInt();
        }
        System.out.println("Thank you");

    }
}
