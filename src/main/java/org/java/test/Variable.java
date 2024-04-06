package org.java.test;

import org.java.test.entities.User;

import java.io.*;

public class Variable {
    private int a; // 私有成员变量a
    public String b = "Hello"; // 公有成员变量b

    public static int count = 0;//静态变量

    public static void main(String[] args){
        //局部变量
//        localVariable();

        //成员变量
//        Variable variable = new Variable();
//
//        variable.a = 10; // 访问成员变量a，并设置其值为10
//        System.out.println("a = " + variable.a);
//
//        variable.b = "World"; // 访问成员变量b，并设置其值为"World"
//        System.out.println("b = " + variable.b);

        //静态变量
//        Variable variable1 = new Variable();
//        Variable variable2 = new Variable();
//        System.out.println(variable1.count);
//        variable2.count = 10;	// 通过实例名访问
//        System.out.println(variable1.count);
//        Variable.count = 30;	// 通过类名访问
//        System.out.println(variable1.count);

        //参数变量
//        int a = 10,b = 20;
//        swap(a,b);
//        System.out.println("a = " + a + ", b = " + b); // 输出a和b的值

//        User user = new User("张三","123456");
//        System.out.println(user);
//
//        //序列化对象
//        File file = new File("C:\\Users\\Such\\Desktop\\User.txt");
//        try(FileOutputStream fileOutputStream = new FileOutputStream(file)){
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(user);
//            objectOutputStream.close();
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
//
//        //从文件中反序列化
//        try(FileInputStream fileInputStream = new FileInputStream(file)){
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            User newUser = (User) objectInputStream.readObject();
//            objectInputStream.close();
//            System.out.println(newUser);
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
    }

    public static void localVariable() {
        int a = 10; // 局部变量a的声明和初始化
        int b;			//局部变量b的声明
        b = 20;			//局部变量b的初始化

        // 如果在使用之前不初始化局部变量，编译器会报错
        // int c;
        // System.out.println("c = " + c);
    }

    public static void swap(int x,int y){
        int temp = x;
        x = y;
        y = temp;
    }

    public static void method(int x){
        x = 2;
    }
}
