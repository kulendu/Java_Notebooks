package com.kulendu.maps;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {10,20,56,3,100,453};

        Arrays.sort(arr);
        for (int ele:arr){
            System.out.println(ele + ",");
        }
    }
}
