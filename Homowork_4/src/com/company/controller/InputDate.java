package com.company.controller;

import com.company.view.View;

import java.util.Scanner;

import static com.company.controller.Regular.*;
import static com.company.view.TextConstant.*;

/**
 * Created by Vlad Ulitin on 07.07.2021.
 */
public class InputDate {
    private Scanner scanner;
    private View view;
    private String name;
    private String lastName;
    private String login;

    public InputDate(Scanner scanner,View view){
        this.scanner=scanner;
        this.view=view;
    }
    public void input(boolean language){
        String strName=language ? namePatternUA : namePattern;
        String strLastName=language ? surnamePatternUA : surnamePattern;
        this.name=checkInput(INPUT_FIRST_NAME,strName);
        this.lastName=checkInput(INPUT_LAST_NAME,strLastName);
        this.login=checkInput(INPUT_LOGIN_DATA,loginPattern);


       view.printResult(INPUT_INFO_DATA,getAllDate());
    }

    /**
     *
     * @return
     */
    public String getAllDate(){
        String all= name+" " + lastName + " " +login;
        return all;
    }

    /**
     *
     * @param message
     * @param regex
     * @return
     */
    public String checkInput(String message,String regex) {
        String res;
        view.printMessage(message);
        while (!(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            view.printMessage(WRONG_INPUT_DATA);
        }
        return res;
    }
}
