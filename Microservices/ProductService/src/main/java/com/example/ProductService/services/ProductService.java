package com.example.ProductService.services;

import com.example.ProductService.entities.Product;

import java.util.List;

public interface ProductService {

    Product add(Product product);

    List<Product> getAll();

    Product getProduct(int id);

    List<Product> ProductByUser(int userId);
}