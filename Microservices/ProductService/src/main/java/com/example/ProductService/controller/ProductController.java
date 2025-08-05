package com.example.ProductService.controller;

import com.example.ProductService.entities.Product;
import com.example.ProductService.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.add(product);
    }

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

//    @GetMapping("/{id}")
//    public Product getOne(@PathVariable int id) {
//        return productService.getProduct(id);
//    }

    @GetMapping("/user/{userId}")
    public List<Product> ProductsByUser(@PathVariable int userId){
        return productService.ProductByUser(userId);
    }
}
