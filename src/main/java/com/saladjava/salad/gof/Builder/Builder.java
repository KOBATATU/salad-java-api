package com.saladjava.salad.gof.Builder;

public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeContents(String contents);

    public abstract Object getResult();
}
