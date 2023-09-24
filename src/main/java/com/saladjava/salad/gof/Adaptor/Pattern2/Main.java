package com.saladjava.salad.gof.Adaptor.Pattern2;

public class Main {
    public static void main(String[] args) {
        PrintBanner printBanner = new PrintBanner("Hello");
        printBanner.printWeak();
        printBanner.printStrong();
    }
}
