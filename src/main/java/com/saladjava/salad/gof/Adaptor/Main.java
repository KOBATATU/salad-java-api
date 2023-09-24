package com.saladjava.salad.gof.Adaptor;

public class Main {
    public static void main(String[] args) {
        Banner banner = new Banner("Hello");
        banner.showWithParen();
        banner.showWithAster();
    }
}
