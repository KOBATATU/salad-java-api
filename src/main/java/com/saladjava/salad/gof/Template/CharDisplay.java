package com.saladjava.salad.gof.Template;

public class CharDisplay extends AbstractDisplay {

    String ch;
    public CharDisplay(String ch) {
        this.ch = ch;
    }
    @Override
    public void open(){
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
