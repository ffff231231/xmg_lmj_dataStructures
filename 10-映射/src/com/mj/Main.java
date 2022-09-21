package com.mj;

import com.mj.map.Map;
import com.mj.map.TreeMap;

public class Main {
    public static void main(String[] args) {
        test1();
    }

    static void test1() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("class", 2);
        map.put("public", 5);
        map.put("text", 6);
        map.put("public", 8);

        map.traversal(new Map.Visitor<String, Integer>() {
            @Override
            public boolean visit(String key, Integer value) {
                System.out.println(key + "_" + value);
                return false;
            }
        });
    }
}
