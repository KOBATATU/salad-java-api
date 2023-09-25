package com.saladjava.salad.gof.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        if (singleton1.equals(singleton2)) {
            System.out.println("同じインスタンス");
        }
    }
}
