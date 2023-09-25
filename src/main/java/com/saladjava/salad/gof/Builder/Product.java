package com.saladjava.salad.gof.Builder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product {
    String title;
    String contents;

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    static class ProductBuilder {

        String title;
        String contents;

        public ProductBuilder() {}


        public ProductBuilder setTitle(String title) {
            this.title = title;
            return this;
        }
        public ProductBuilder setContents(String contents) {
            this.contents = contents;
            return this;
        }

        public Product build() {
            Product product = new Product();
            product.setTitle(this.title);
            product.setContents(this.contents);
            return product;
        }

    }
}
