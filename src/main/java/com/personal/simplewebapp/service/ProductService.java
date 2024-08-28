package com.personal.simplewebapp.service;

import com.personal.simplewebapp.model.Product;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@Service
public class ProductService {

    // dummy list
    // make it mutable
    List <Product> products = new ArrayList<>(
            Arrays.asList(
                    new Product(101, "T-Shirt", 549.99),
                    new Product(102, "Trouser", 789.99),
                    new Product(103, "Pants", 999.99),
                    new Product(104, "Coat", 4999.99)
            )
    );

    private int getIndexFromProductId(int id) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                index = i;
            }
        }
        return index;
    }

    public Product getProductById(int id) {
        return products.stream().filter(product -> product.getId() == id).findFirst().orElse(null);
    }

    public void add(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index = getIndexFromProductId(product.getId());
        if (index != -1) {
            products.set(index, product);
        }
    }

    public void deleteProduct(int id) {
        int index = getIndexFromProductId(id);
        if (index != -1) {
            products.remove(index);
        }
    }
}
