package org.java.test.entities;

public class Person {

    public static int count = 0;

    //声明常量
    public static final int WEIGHT = 50;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void speak(){
        System.out.println("说话！");
    }

    /**
     * 被final修饰的方法可以被继承，但不可以被重写
     */
    public final void printWeight(){
        System.out.println("体重：" + WEIGHT);
    }
}
