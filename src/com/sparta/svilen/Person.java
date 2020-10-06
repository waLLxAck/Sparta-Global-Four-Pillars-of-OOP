package com.sparta.svilen;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak(){
        System.out.println("Hello! I'm pretty normal.");
    }
}
