package com.kulendu.methods;

public class Methods {
    public static void main(String[] args) {
        System.out.println("Hello welcome to the Program");

        name("Kulendu is my name !"); // This has been called from the method called name
        System.out.println(square(5)); // This has been called from the method called square
    }

    // creating a new method (what we call function in other langs.) with arguments
    public static void name(String str){
        System.out.println(str);
    }

    // creating a new method (what we call function in other langs.) without arguments
    public static void without_arguments(){
        System.out.println("This is from the method without args");
    }

    // creating a new method (what we call function in other langs.) with arguments but with other data-types
    public static int square(int num){
        return (int) Math.pow(num,2);
    }
}
