package com.sparta.svilen;

import java.util.concurrent.TimeUnit;

public class Spartan extends Person{
    private final int hoursInSparta;

    public Spartan(String name, int age, int hoursInSparta) {
        super(name, age);
        this.hoursInSparta = hoursInSparta;
    }

    public int getHoursInSparta() {
        return hoursInSparta;
    }

    @Override
    public void speak() {
        System.out.println("Hello! As a Spartan, I can do things like..." +
                "\n solveComplexJavaProblems()");
    }

    public void solveComplexJavaProblems(){
        System.out.println("----------" +
                "\nSolving inheritance...");
        Sleeper.sleep(2);
        System.out.println("Success! Now, I'm a person!");

        System.out.println("----------" +
                "\nSolving polymorphism...");
        Sleeper.sleep(3);
        System.out.println("Done! Let me speak and I'll show you!");

        System.out.println("----------" +
                "\nSolving encapsulation...");
        Sleeper.sleep(4);
        System.out.println("You cannot increase my hours in Sparta anymore!");

        System.out.println("----------" +
                "\nSolving abstraction...");
        Sleeper.sleep(4);
        System.out.println("I wish I was an actual Spartan, but it's too complex...");
    }
}
