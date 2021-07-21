package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(4,5,-6,4,5,3,4,2,4,5,7));
        Map<Integer,Integer> map=NumberOfRepetitions.searchForRepetitions(list);
        System.out.println(map);
    }
}
