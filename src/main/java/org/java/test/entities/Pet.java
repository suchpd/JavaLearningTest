package org.java.test.entities;

public abstract class Pet extends Animal{

    @Override
    public void run() {
        System.out.println("宠物在跑！");
    }
}
