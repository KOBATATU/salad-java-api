package com.saladjava.salad.gof.Builder;

public class TextBuilder extends Builder {
    Product product;

    public TextBuilder() {
        this.product = new Product();
    }
    @Override
    public void makeTitle(String title) {
        product.setTitle(title);
    };

    @Override
    public void makeContents(String contents) {
        product.setContents(contents);
    }

    @Override
    public Product getResult(){
        return this.product;
    }
}
