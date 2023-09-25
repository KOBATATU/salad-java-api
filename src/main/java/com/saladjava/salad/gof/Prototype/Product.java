package com.saladjava.salad.gof.Prototype;

public interface Product extends Cloneable {
    public abstract void use();
    public abstract Product createCopy();
}
