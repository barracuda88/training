package com.company;

import java.util.Scanner;

public class Controller {
    private View view;
    private Model model;
    private Scanner scanner;

    public Controller(View view,Model model){
        this.view=view;
        this.model=model;
        scanner=new Scanner(System.in);
    }
    public void start(){
        boolean prov = false;
        int userNumber;
        do {
            try {
                userNumber = scanNumber(scanner);
                prov = model.checkUserNumber(userNumber);
            } catch (NumberFormatException e) {
                view.show(view.TYPE_ERROR);
            } catch (NumberGoingOfBoundsException e) {
                view.show(view.RANGE_ERROR, model.from, model.to);
            }
        } while (!prov);
        view.show(view.LAST_MESSAGE);
        view.show(view.LIST_MESSAGE, model.allNumbers);

    }
    private int scanNumber(Scanner scanner) {
        view.show(view.LIST_MESSAGE, model.allNumbers);
        view.show(view.RANGE_MESSAGE, model.from, model.to);
        String userNumberStr = scanner.nextLine();
        return Integer.parseInt(userNumberStr);
    }


}
class  NumberGoingOfBoundsException extends Exception{

}
