package com.company;

import com.company.controller.Controller;
import com.company.view.View;
import com.company.model.Model;


import java.util.stream.Collectors;

public class Main {

    /**
     * @author Vlad Ulitin
     */
    public static void main(String[] args) {
        View view = new View();
        Model model= new Model();
        Controller controller = new Controller(view,model);
       controller.startProgram();

    }
}
