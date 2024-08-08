package com.hastycode.webApp.service;

import com.hastycode.webApp.model.Product;
import com.hastycode.webApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>( Arrays.asList(
//            new Product(14, "Tissue", 89),
//            new Product(56, "Mirror", 78),
//            new Product(88, "Exercise Book", 10)
//    ));

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProdById(int productId) {
        return repo.findById(productId).get();
    }

    public void addProduct(Product product) {
        repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product);
    }

    public void deleteProduct(int productId) {
        repo.deleteById(productId);
    }
}
