package com.professionalit.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    public List<String> getAllProducts() {
        return List.of("Laptop", "Mobile", "Mouse");
    }

    @GetMapping("/{id}")
    public String getProduct(@PathVariable Long id) {
        return "Product Id : " + id;
    }

    @PostMapping
    public String createProduct(@RequestBody String product) {
        return "Product Created";
    }

    @PutMapping("/{id}")
    public String updateProduct(@PathVariable Long id,
                                @RequestBody String product) {
        return "Product Updated";
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        return "Product Deleted";
    }
}