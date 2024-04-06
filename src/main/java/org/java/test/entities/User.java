package org.java.test.entities;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userName;

    /**
     * transient修饰的变量不会被持久化
     */
    private transient String password;

    public User(){

    }

    public User(String userName,String password){
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return "姓名：" + userName + "密码：" + password;
    }
}
