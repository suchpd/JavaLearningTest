package org.java.test.entities;

public abstract class Animal {

    private String name;

    public abstract void run();

    public void eat(){
        System.out.println("动物在吃！");
    }
}
