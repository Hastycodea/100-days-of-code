package com.hastycode.webApp.service;

import com.hastycode.webApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>( Arrays.asList(
            new Product(14, "Tissue", 89),
            new Product(56, "Mirror", 78),
            new Product(88, "Exercise Book", 10)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProdById(int productId) {
        return products.stream()
                .filter(p -> p.getProductId() == productId)
                .findFirst()
                .orElse(new Product(22, "null", 0));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index = 0;
        for(int i=0; i < products.size(); i++) {
            if (products.get(i).getProductId() == product.getProductId())
                index = i;
        }
        products.set(index, product);
    }

    public void deleteProduct(int productId) {
        Product product = products.stream().filter(p -> p.getProductId() == productId).findFirst().get();
        products.remove(product);
    }
}
