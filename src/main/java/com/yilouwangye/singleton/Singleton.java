package com.yilouwangye.singleton;

public class Singleton {
    // 自己创建一个Singleton对象
    private static Singleton instance  = new Singleton();
    // 提供唯一访问对象的方式
    public static Singleton getInstance(){
        return instance;
    }
    // 让构造函数为 private，这样该类就不会被实例化
    private Singleton(){System.out.println("apple");}

    protected void getMsg(){
        System.out.println("java design mind");
    }
}
