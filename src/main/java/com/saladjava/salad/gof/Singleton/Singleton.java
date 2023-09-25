package com.saladjava.salad.gof.Singleton;

public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("インスタンスを作成");
    }

    public static Singleton getSingleton(){
        return singleton;
    }
}
