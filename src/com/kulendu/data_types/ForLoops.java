package com.kulendu.data_types;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        System.out.println("Enter the number of elemnets: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++){
            System.out.println("Element " + i +" :" + i);
        }


    }
}
