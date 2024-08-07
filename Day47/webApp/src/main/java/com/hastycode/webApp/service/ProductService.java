package com.hastycode.webApp.service;

import com.hastycode.webApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(14, "Tissue", 89),
            new Product(56, "Mirror", 78),
            new Product(88, "Exercise Book", 10)
    );

    public List<Product> getProducts() {
        return products;
    }

}
