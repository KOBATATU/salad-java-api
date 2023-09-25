package com.saladjava.salad.gof.Builder;

public class Director {
    Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeContents("一般的な挨拶");
    }
}
