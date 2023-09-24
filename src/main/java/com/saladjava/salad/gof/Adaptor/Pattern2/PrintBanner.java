package com.saladjava.salad.gof.Adaptor.Pattern2;

import com.saladjava.salad.gof.Adaptor.Banner;

public class PrintBanner extends Print {
    Banner banner;
    public PrintBanner(String string){
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak(){
        this.banner.showWithParen();
    }

    @Override
    public void printStrong(){
        this.banner.showWithAster();
    }
}
