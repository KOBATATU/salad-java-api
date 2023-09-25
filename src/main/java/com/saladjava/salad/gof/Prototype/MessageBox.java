package com.saladjava.salad.gof.Prototype;

public class MessageBox implements Product {

    private final String str;
    public MessageBox(String str) {
        this.str = str;
    }

    @Override
    public void use() {
        System.out.println(str);
    }

    @Override
    public Product createCopy() {
        Product p;
        try {
          p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return p;
    }
}
