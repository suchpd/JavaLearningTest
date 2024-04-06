package org.java.test;

import org.java.test.entities.Huawei;
import org.java.test.entities.Iphone;
import org.java.test.entities.Person;
import org.java.test.entities.User;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Person a = new Person();
//        Person b = new Person();
//        System.out.println(b.count);
//        a.count = 10;
//        System.out.println(b.count);
//        Person.count = 30;
//        System.out.println(b.count);
//        a.setAge(5);
//        System.out.println("Before：a的地址= " + a + ",age = " + a.getAge() );
//        method(a);
//        System.out.println("After：a的地址= " + a + ",age = " + a.getAge() );
//        int d = 97;
//        char e = (char)d;
//        System.out.println(e);

//        Iphone iphone = new Iphone();
        //这是错误的调用方法，因为call_1()方法是被private修饰了，不可以直接调用
//        iphone.call_1();
        //被public调用的方法可以直接调用
//        iphone.call_2();
        //被protected修饰的方法不能被其他包调用
//        iphone.call_3();
        //没有修饰符的方法，即default修饰的方法，也是不能被其他包下的类调用
//        iphone.call_4();
//        Huawei huawei = new Huawei();
        User user = new User("张三","123456");
        System.out.println(user);

        //序列化对象
        File file = new File("C:\\Users\\Such\\Desktop\\User.txt");
        try(FileOutputStream fileOutputStream = new FileOutputStream(file)){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(user);
            objectOutputStream.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }

        //从文件中反序列化
        try(FileInputStream fileInputStream = new FileInputStream(file)){
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            User newUser = (User) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println(newUser);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void method(Person b){
        b.setAge(10);
    }
}