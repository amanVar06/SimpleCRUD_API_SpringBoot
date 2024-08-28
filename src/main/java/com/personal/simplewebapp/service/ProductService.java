package com.personal.simplewebapp.service;

import com.personal.simplewebapp.model.Product;
import com.personal.simplewebapp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    // dummy list
    // make it mutable
    /*List <Product> products = new ArrayList<>(
            Arrays.asList(
                    new Product(101, "T-Shirt", 549.99),
                    new Product(102, "Trouser", 789.99),
                    new Product(103, "Pants", 999.99),
                    new Product(104, "Coat", 4999.99)
            )
    );*/

    /*private int getIndexFromProductId(int id) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                index = i;
            }
        }
        return index;
    }*/

    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(int id) {
        return productRepo.findById(id).orElse(new Product());
    }

    public void add(Product product) {
        productRepo.save(product);
    }

    public void updateProduct(Product product) {
        productRepo.save(product);
    }

    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }
}
