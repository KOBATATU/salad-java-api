package com.saladjava.salad.gof.Factory.idcard;

import com.saladjava.salad.gof.Factory.framework.Factory;
import com.saladjava.salad.gof.Factory.framework.Product;

public class IDCardFactory extends Factory<Product> {

    @Override
    public Product createObj(String owner){
        return new IDCard(owner);
    };

    @Override
    public void register() {
        System.out.println("登録しました");
    };
}
