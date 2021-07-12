package com.company;

import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private int age;
    public Student(String name,String group,int age){
        this.name= name;
        this.group=group;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setGroup(String group){
        this.group=group;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public String getGroup(){
        return group;
    }
    public int getAge(){
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null) return false;
        if (o instanceof Student){
            Student temp= (Student) o;
            return this.age==temp.getAge() && this.name.equals(temp.getName())&& this.group.equals(temp.getGroup());
        }else return false;
    }

    @Override
    public int hashCode() {
        return ((29*name.hashCode())+group.hashCode())*29+age;
    }
}
