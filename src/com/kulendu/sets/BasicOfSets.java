package com.kulendu.sets;

import java.util.Set;
import java.util.HashSet;

public class BasicOfSets {
    public static void main(String[] args) {
        Set<Integer> int_set = new HashSet<Integer>(); // set declaration
        for (int i=1; i<=10; i++){
            int_set.add(i); // appending values in set
        }
        System.out.println(int_set);
    }
}
