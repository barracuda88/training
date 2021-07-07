package com.company.controller;

import com.company.model.Model;
import com.company.view.View;

import java.util.Scanner;

/**
 * Created by Vlad Ulitin on 07.07.2021.
 */
public class Controller {
    private View view;
    private Model model;

    public Controller(View view,Model model){
        this.view=view;
        this.model=model;
    }

    public void startProgram(){
        Scanner scanner = new Scanner(System.in);
        InputDate inputDate = new InputDate(scanner,view);
        inputDate.input(View.bundle.getLocale().toString().equals("ua"));

    }
}
