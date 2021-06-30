package com.company;

import java.util.List;

public class View {
    public final String TYPE_ERROR = "На ввод принимается только число!";
    public final String RANGE_ERROR = "Число не входит в диапазон  (%d, %d).";
    public final String RANGE_MESSAGE = "Введите число из диапазона: (%d, %d).";
    public final String LAST_MESSAGE = "Вы выиграли!!!";
    public final String LIST_MESSAGE = "Вы уже ввели: ";
    public void show(String message) {
        System.out.println(message);
    }

    public void show(String message, int from, int to) {
        String msgToPrint = String.format(message, from, to);
        System.out.println(msgToPrint+" ");
    }

    public void show(String message, List<Integer> list) {
        System.out.print(message);
        for (Integer i:list) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
