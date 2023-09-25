package com.saladjava.salad.gof.Builder;

// 参考：https://qiita.com/takutotacos/items/33cfda205ab30a43b0b1
// gofを参照するよりもEffective Javaに登場するようなFactoryパターンの方が直感的ではある
// Product.builder().setTitle("title").setContents("contents").build();
public class Main {
    public static void main(String[] args) {
        //gof pattern
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        Product product = textBuilder.getResult();

        // Effectve Java pattern
        Product product2 = Product.builder().setTitle("hoge").setContents("contents").build();

        System.out.println(product2.getTitle());
        System.out.println(product2.getContents());
    }
}
