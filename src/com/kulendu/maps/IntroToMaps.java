package com.kulendu.maps;

import java.util.HashMap;
import java.util.Map;

public class IntroToMaps {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("Kulendu","Name");
        m.put(10,100);
        m.put("Home",1002);

        System.out.println(m);
    }
}
