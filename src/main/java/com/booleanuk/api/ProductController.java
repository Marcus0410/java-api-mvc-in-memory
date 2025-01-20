package com.booleanuk.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {
    private ProductRepository repo = new ProductRepository();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@RequestBody Product product) {
        return repo.create(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return repo.getAll();
    }

    @GetMapping("/{id}")
    public Product getSpecificProduct(@PathVariable int id) {
        return repo.getProduct(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Product updateProduct(@PathVariable int id, @RequestBody Product updated) {
        return repo.update(id, updated);
    }

    @DeleteMapping("/{id}")
    public Product deleteProduct(@PathVariable int id) {
        return repo.delete(id);
    }

}
