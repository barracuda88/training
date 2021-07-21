package com.company;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class MyArrayList<T> implements Simple<T>{
    private T[] values;
public MyArrayList(){
    values=(T[]) new Object[0];
}
    @Override
    public boolean add(T t) {
    try {
        T[] temp = values;
        values = (T[]) new Object[temp.length+1];
        System.arraycopy(temp,0,values,0,   temp.length );
        values[values.length-1]=t;
        return true;

    }catch (ClassCastException ex){
        ex.printStackTrace();
    }
    return false;

    }

    @Override
    public void remove(int index) {
         throw new UnsupportedOperationException();
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, T t) {
         values[index]=t;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(values);
    }
}

