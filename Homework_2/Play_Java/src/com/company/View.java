package com.company;

import java.util.List;

public class View {//Entered number is out of range: (%d, %d).
    public final String START_LINE = "Введите число в промежутке: {%d, %d} :";
    public final String ERROR_INPUT_LINE = "Некоретный ввод!!! ";
    public final String ERROR_Going_Out_Of_Bounds = "Выход за дозволеные граници!!! ";
    public final String TRYING = "Ваши попытки: ";
    public final String WIN = "Поздравляем!!! Вы выиграли !!!";

    public void view(String str ,int min,int max) {
        String msgToPrint = String.format(str, min, max);
        System.out.println(msgToPrint);
    }
    public void viewError(String error,String str,int min,int max){
        System.out.print(error);
        view(str, min, max);
    }
    public void viewWin(List<Integer> list){
        System.out.println(WIN);
        System.out.print(TRYING);
        for (Integer i:list){
            System.out.print(i+" ");
        }
    }
}