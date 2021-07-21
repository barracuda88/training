package com.company;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    private int index = 0 ;
    T[] values;
    MyIterator(T[] value){
        this.values=value;
    }
    @Override
    public boolean hasNext(){
        return index<values.length;
    }
    @Override
    public T next(){
        return values[index++];
    }
}
