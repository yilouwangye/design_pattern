package com.yilouwangye.singleton_pattern;

public class Method {
    /**
     * 此时实例化报错
     * Singleton singleton = new Singleton();
     */
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        obj.getMsg();
        /**
         * apple
         * java design mind
         */
    }
}
