package com.saladjava.salad.gof.Template;

public class Main {
    public static void main(String[] args) {
        CharDisplay charDisplay = new CharDisplay("Hello");
        charDisplay.display();

        StringDisplay stringDisplay = new StringDisplay("Hello");
        stringDisplay.display();
    }
}
