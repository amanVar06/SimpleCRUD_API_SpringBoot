package com.personal.simplewebapp.service;

import com.personal.simplewebapp.model.Product;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@Service
public class ProductService {

    // dummy list
    List<Product> products = Arrays.asList(
            new Product(101, "T-Shirt", 549.99),
            new Product(102, "Trouser", 789.99),
            new Product(103, "Pants", 999.99),
            new Product(104, "Coat", 4999.99));


    public Product getProductById(int id) {
        return products.stream().filter(product -> product.getId() == id).findFirst().orElse(null);
    }
}
