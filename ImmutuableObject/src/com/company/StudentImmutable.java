package com.company;

public final class StudentImmutable {
    private final String name;
    private final Age age;
    public StudentImmutable(String name,Age age){
        this.name=name;
        Age cloneAge= new Age();
        cloneAge.setAge(age.getAge());
        this.age= age;
    }
    public String getName(){
        return name;
    }
    public Age getAge(){
        Age cloneAge = new Age();
        cloneAge.setAge(this.age.getAge());
        return cloneAge;
    }
    public StudentImmutable setName(String name){
        return new StudentImmutable(name,this.age);
    }
    public StudentImmutable setAge(Age age){
        return new StudentImmutable(this.name,age);
    }

}
