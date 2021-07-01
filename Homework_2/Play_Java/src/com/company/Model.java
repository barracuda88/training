package com.company;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private int bottomBound;
    private int randomNumber;
    private int uperBound;
    private ArrayList<Integer> allTry= new ArrayList<>();
    public void setBound(int min,int max){
        bottomBound=min;
        uperBound=max;
    }
    public void setRandomNumber(){
       
        randomNumber=(int)Math.ceil(Math.random()*
                (uperBound - bottomBound - 1) + bottomBound);
    }
    public boolean numberComparison(int number){
        addTry(number);
        if(number==randomNumber){
            return false;
        }
        else if(number>randomNumber){
            uperBound=number;
        }else {
            bottomBound = number;
        }

        return true;

    }
    public int getRandomNumber(){
        return randomNumber;
    }
    public int getBottomBound(){
        return bottomBound;
    }
    public int getUperBound(){
        return uperBound;
    }
    public List<Integer> getAllTry(){
        return allTry;
    }
    public void addTry(int number){
        allTry.add(number);
    }

}

