package com.company;

import notebook.User;
import templates.Template;

import java.util.Scanner;


public class Controller {

    private View view;
    private User user;
    private Scanner scanner;

    /**
     *
     * @param view
     * @param user
     */
    public Controller(View view,User user){
        this.view=view;
        this.user=user;
        scanner=new Scanner(System.in);
    }


    public void run(){
        Scanner scanner = new Scanner(System.in);
        user.setName(inputName());
        user.setSurname(inputSurname());
        user.setNickname(inputNickname());
       view.result(View.RESULT,user.getName(),user.getSurname(),user.getNickname());
    }
    public String inputName(){
        String name="";
        boolean check= true;
        view.info(View.INPUT_NAME);
        while (check){
            name=scanner.next();
            if(!(checkInput(name,Template.namePattern))){
                view.info(View.ERROR);
                continue;
            }
            check=false;

        }
        return name;
    }

    /**
     *
     * @return surname
     */
    public String inputSurname(){
        String surname="";
        boolean check= true;
        view.info(View.INPUT_SURNAME);
        while (check){
            surname=scanner.next();
            if(!(checkInput(surname,Template.surnamePattern))){
                view.info(View.ERROR);
                continue;
            }
            check=false;

        }
        return surname;
    }

    /**
     *
     * @return nickname
     */

    public String inputNickname(){
        String nickname="";
        boolean check= true;
        view.info(View.INPUT_NICKNAME);
        while (check){
            nickname=scanner.next();
            if(!(checkInput(nickname,Template.nicknamePattern))){
                view.info(View.ERROR);
                continue;
            }
            check=false;

        }
        return nickname;
    }

    /**
     *
     * @param input
     * @param template
     * @return
     */
    public boolean checkInput(String input,String template){
        return input.matches(template);
    }
}
