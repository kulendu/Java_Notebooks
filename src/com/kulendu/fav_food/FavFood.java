package com.kulendu.fav_food;

import java.util.Scanner;

public class FavFood {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + " Lets match our food sensations");

        // checking the food item
        System.out.println("Enter you fav food :");
        String food = sc.nextLine();

        if (food.equals("Pizza")){
            System.out.println("Ok so since you are here, Lets check your license. Enter your age: ");
            int age = sc.nextInt();

            if (age < 18){
                System.out.println(name + " you are underaged and connot drive, go back home");
            }else{
                System.out.println(name + " your age is fine");
            }

            System.out.println("Oh wow, I love Pizza too 😀");
        }else{
            System.out.println("Oh cool , but I love pizza 🍕");
        }


    }
}
