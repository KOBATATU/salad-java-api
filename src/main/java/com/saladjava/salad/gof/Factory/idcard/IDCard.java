package com.saladjava.salad.gof.Factory.idcard;

import com.saladjava.salad.gof.Factory.framework.Product;

public class IDCard extends Product {

    private final String owner;

    IDCard(String owner) {
        System.out.println(owner + "のカードを作ります。");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "を使います。");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }

}
