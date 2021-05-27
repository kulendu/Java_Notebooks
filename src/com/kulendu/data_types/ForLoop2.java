package com.kulendu.data_types;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("\nNow enter the elemenst: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element: ");
            int input = sc.nextInt();
            arr[i] = input;
        }

        System.out.println("\nThe elements are: ");
        for (int ele : arr) {
            System.out.println(ele);
        }
    }
}
