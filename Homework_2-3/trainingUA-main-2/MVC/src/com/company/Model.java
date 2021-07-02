package com.company;

public class Model {
    private String word_number1;
    private String word_number2;
    private String line;
    public void setWord_number1(String word1){
        word_number1=word1;
    }
    public void setWord_number2(String word2){
        word_number2=word2;
    }
    public void addingLines(){
        line = word_number1+" "+word_number2;

    }
    public String getWord_number1(){
        return word_number1;

    }
    public String getWord_number2(){
        return word_number2;
    }
    public String getLine(){
        return line;
    }
}
