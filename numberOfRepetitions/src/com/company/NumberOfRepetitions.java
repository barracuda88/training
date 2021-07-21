package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class NumberOfRepetitions {
    public static Map<Integer,Integer> searchForRepetitions(List<Integer> list){
        Map<Integer,Integer> map = new TreeMap<>();
        System.out.println(list);
        for (Integer i: list){
            if(!(map.containsKey(i))){
               map.put(i,1);
            }
            else {
                map.put(i, map.get(i) + 1);
            }
        }
        return map;
    }
}
