package com.company;

import java.util.Scanner;

public class Controller {
    private View view;
    private Model model;
    public Controller(View view,Model model){
        this.model=model;
        this.view=view;
    }
    public void process(){
        Scanner sc = new Scanner(System.in);

        model.setWord_number1(inputWordHelloWithScanner(sc));
       model.setWord_number2(inputWordWorldWithScanner(sc));
       model.addingLines();
       view.printSentence(model.getLine());
    }
    public String inputWordHelloWithScanner(Scanner sc){
      view.printMessage(View.INPUT_HELLO);
        String line=null;
      Boolean check=false;
      while (!check){
           line=sc.nextLine();
          if(line.equals("Hello")){
              return line;
          }
          else {
              view.printMessage(View.WRONG_INPUT_WORD + View.INPUT_HELLO);
          }


      }
      return line;
    }
    public String inputWordWorldWithScanner(Scanner sc){
        view.printMessage(View.INPUT_WORLD);
        String line=null;
        Boolean check=false;
        while (!check){
            line=sc.nextLine();
            if(line.equals("world!")){
                return line;
            }
            else {
                view.printMessage(View.WRONG_INPUT_WORD + View.INPUT_WORLD);
            }
        }
        return line;
    }
}
