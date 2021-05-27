package com.kulendu.conditional_operations;

import java.util.Scanner;

public class ConditionalOperations {
    public static void main(String[] args) {

        // finding the greatest of three numbers
        Scanner num_1 = new Scanner(System.in);
        Scanner num_2 = new Scanner(System.in);
        Scanner num_3 = new Scanner(System.in);

        int x = num_1.nextInt();
        int y = num_2.nextInt();
        int z = num_3.nextInt();

        if(x>y && x>z){
            System.out.println(x + " is greatest");
        }
        else if(y>x && y>z){
            System.out.println(y + " is greatest");
        }
        else{
            System.out.println(z + " is greatest");
        }


    }
}
