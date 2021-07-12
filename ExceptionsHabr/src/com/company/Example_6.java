package com.company;

public class Example_6 {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (RuntimeException e) {
            System.err.print(" 2");
            if (true) {throw new Error();}
        }
        System.err.println(" 3");
    }
}


