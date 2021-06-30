package com.company;

import java.util.Scanner;

public class Controller {
    private View view;
    private Model model;


    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;

    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        model.setLine(GlobalConstants.PRIMARY_MIN_BARRIER, GlobalConstants.PRIMARY_MAX_BARRIER);


        while (model.checkNumber(inputIntValueWithScanner(scanner)));

        view.printMessage(View.CONGRATULATION );
        view.printMessage(View.YOUR_WAY + String.valueOf(model.getAllNumber()));

    }

    private int inputIntValueWithScanner(Scanner sc) {
        int res = 0;
        view.printMessage(getInputIntMessage());
        while (true) {

            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_INT_DATA + getInputIntMessage());

                sc.next();
            }

            if ((res = sc.nextInt()) <= model.getBottonLine() ||
                    res >= model.getUpperLine()) {
                view.printMessage(View.WRONG_INPUT_INT_DATA + getInputIntMessage());
                continue;
            }
            break;
        }

        return res;
    }

    private String getInputIntMessage() {
        return view.concatenationString(
                View.INPUT_INT_DATA, View.OPENS_SQUARE_BRACKET,
                String.valueOf(model.getBottonLine()), View.SPACE_SING,
                String.valueOf(model.getUpperLine()),
                View.CLOSING_SQUARE_BRACKET, View.SPACE_SING,
                View.EQUAL_SING, View.SPACE_SING );
    }
}
