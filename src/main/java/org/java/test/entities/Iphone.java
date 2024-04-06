package org.java.test.entities;

public class Iphone {

    /**
     * private修饰的方法不能直接被外部调用，只能内部调用
     */
    private void call_1(){
        System.out.println("Iphone手机打电话1！");
    }

    /**
     * public修饰的方法可以被直接调用
     */
    public void call_2(){
        System.out.println("Iphone手机打电话2！");
    }

    /**
     * protected修饰的方法不可以被其他包调用
     * 但是可以被本包下的其他类调用
     */
    protected void call_3(){
        System.out.println("Iphone手机打电话3！");
    }

    /**
     * 没有修饰符的方法，即default修饰的方法，不能被其他包下的类调用
     * 但是可以被本包下的其他类调用
     */
    void call_4(){
        System.out.println("Iphone手机打电话4! ");
    }
}
