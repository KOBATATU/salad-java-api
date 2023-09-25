package com.saladjava.salad.gof.Factory.framework;

public abstract class Factory<T> {

    public T create(String owner){
        T product = createObj(owner);
         register();
         return product;
    }

    public abstract T createObj(String owner);

    public abstract void register();
}
