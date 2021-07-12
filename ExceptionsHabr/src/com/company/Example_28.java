package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Example_28 {

    public void f() throws IOException, InterruptedException {}
}

class Child extends Example_28 {

    @Override
    public void f() throws FileNotFoundException {}
}