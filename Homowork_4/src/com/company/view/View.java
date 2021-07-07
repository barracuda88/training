package com.company.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static com.company.view.TextConstant.INPUT_LAST_NAME;

/**
 * Created by Vlad Ulitin on 07.07.2021.
 */
public class View {
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("UA"));

    public void printMessage(String line){
        System.out.println(bundle.getString(line));
    }
    public void printResult(String line,String allDate){
        System.out.println(bundle.getString(line) + allDate);
    }
}
