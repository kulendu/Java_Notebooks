package com.kulendu.working_with_integers;

import java.util.Scanner;

public class WorkingWithIntegers {
    public static void main(String[] args) {

        Scanner num_1 = new Scanner(System.in);
        Scanner num_2 = new Scanner(System.in);

        int x = num_1.nextInt();
        int y = num_2.nextInt();
        double exp = Math.pow(x,y);

        System.out.println(exp);
    }
}
