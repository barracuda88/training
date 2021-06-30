package com.company;

import java.util.ArrayList;
import java.util.List;

public class Model {
    public int from;
    public int to;
    private final int bottonLine=0;
    private final int upperLine=100;
    private int randomNumber;

    public List<Integer> allNumbers ;
    public Model() {
        randomNumber=(int)(bottonLine +Math.random()* upperLine);
        from=bottonLine;
        to=upperLine;
        allNumbers=new ArrayList<>();
    }


    public boolean checkUserNumber(int userNumber) throws NumberGoingOfBoundsException{
        numberCheck(userNumber);
        allNumbers.add(userNumber);
        if (randomNumber > userNumber) {
            from = userNumber;
        } else if (randomNumber< userNumber) {
            to = userNumber;
        } else {
            return true;
        }
        return false;
    }

    public void numberCheck(int userNumber) throws NumberGoingOfBoundsException {
        if (userNumber < from || userNumber > to) {
            throw new NumberGoingOfBoundsException();
        }
    }



}

