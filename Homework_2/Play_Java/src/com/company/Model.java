package com.company;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private int bottonLine;
    private int upperLine;
    private int randomNumber;
    private ArrayList<Integer> allNumber= new ArrayList<>();

    public void setLine(int min,int max){
        bottonLine=min;
        upperLine=max;
    }
    public void setRandomNumber(){
        randomNumber=(int)((bottonLine+1) + Math.random()*(upperLine-1));

    }

    public boolean checkNumber (int value){
        allNumber.add(value);
        if (value == randomNumber){
            return false;
        } else if (value > randomNumber){
            upperLine= value;
        } else {
            bottonLine = value;
        }
        return true;
    }
    public List<Integer> getAllNumber(){
        return allNumber;
    }
    public int getBottonLine(){
        return bottonLine;
    }
    public int getUpperLine(){
        return upperLine;
    }
    public int getRandomNummber(){
        return randomNumber;
    }


}

