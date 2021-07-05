package com.company;

import notebook.User;

public class Main {

    /**
     * @author Vlad Ulitin
     */
    public static void main(String[] args) {
	View view = new View();
        User user = new User();
	Controller controller = new Controller(view,user);
	controller.run();
    }
}
