package com.company;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    public Controller(Model model,View view){
        this.model=model;
        this.view=view;
    }
    public void startGame(){
        Scanner scanner = new Scanner(System.in);
        model.setBound(GlobalConstants.PRIMARY_MIN_BARRIER,GlobalConstants.PRIMARY_MAX_BARRIER);
        model.setRandomNumber();
        while (model.numberComparison(inputIntValueWithScanner(scanner)));
        view.viewWin(model.getAllTry());
    }
    private int inputIntValueWithScanner(Scanner sc){

            int res = 0;
            view.view(view.START_LINE, model.getBottomBound(), model.getUperBound());
            while (true) {

                while (!sc.hasNextInt()) {
                    view.viewError(view.ERROR_INPUT_LINE, view.START_LINE, model.getBottomBound(), model.getUperBound());

                    sc.next();
                }

                if ((res = sc.nextInt()) <= model.getBottomBound() ||
                        res >= model.getUperBound()) {
                    view.viewError(view.ERROR_Going_Out_Of_Bounds, view.START_LINE, model.getBottomBound(), model.getUperBound());

                    continue;
                }
                break;
            }

            return res;
        }
    }
