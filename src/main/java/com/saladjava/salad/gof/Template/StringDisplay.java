package com.saladjava.salad.gof.Template;

public class StringDisplay extends AbstractDisplay{
    String ch;
    public StringDisplay(String ch) {
        this.ch = ch;
    }
    @Override
    public void open(){
        System.out.println("+-----+");
    }

    @Override
    public void print() {
        System.out.println("|" + ch + "|");
    }

    @Override
    public void close() {
        System.out.println("+-----+");
    }
}
