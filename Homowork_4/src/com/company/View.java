package com.company;

import notebook.User;

public class View {
    public static final String INPUT_NAME = "Please,input name: ";
    public static final String INPUT_SURNAME= "Please,input surname: ";
    public static final String INPUT_NICKNAME= "Please,input nickname: ";
    public static final String ERROR = "Invalid input please try again: ";
    public static final String RESULT= "Your input ";

    /**
     *
     * @param line
     */
    public void info(String line){
        System.out.print(line);
    }

    /**
     *
     * @param line
     * @param name
     * @param surname
     * @param nickname
     */
    public void result(String line,String name,String surname,String nickname){
        System.out.println(line+" name:"+name+" surname:"+surname+" nickname:"+nickname);
    }
}
