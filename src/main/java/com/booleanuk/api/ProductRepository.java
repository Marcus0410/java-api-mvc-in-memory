package com.booleanuk.api;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> products = new ArrayList<>() {
        {
            add(new Product("How to build APIs", "Book", 1500));
            add(new Product("Grey bat", "Sports", 3000));
        }
    };

    List<Product> getAll() {
        return products;
    }

    Product getProduct(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    Product create(Product product) {
        // check if product with same name exists
        for (Product p : products) {
            if (p.getName().equals(product.getName())) {
                return null;
            }
        }

        products.add(product);
        return product;
    }

    Product update(int id, Product updated) {
        Product product = getProduct(id);
        if (product != null) {
            product.setName(updated.getName());
            product.setCategory(updated.getCategory());
            product.setPrice(updated.getPrice());
        }
        return product;
    }

    Product delete(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                products.remove(p);
                return p;
            }
        }
        return null;
    }
}
