package com.kulendu.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapsExample {
    public static void main(String[] args) {
        Map m = new HashMap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = sc.next();

        for (char element:sentence.toCharArray()){
            if (m.containsKey(element)){
                int old_ele = (int) m.get(element);
                m.put(element, old_ele+1);
            }else{
                m.put(element, 1);
            }
        }
        m.remove(' ');


        System.out.println(m);

    }
}
