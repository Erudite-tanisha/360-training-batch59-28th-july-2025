package com.example.UserService.services;

import com.example.UserService.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url = "localhost:8082", value = "Product-Client")
@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductClient {

    @GetMapping("/product/user/{userId}")
    List<Product> getProductByUser(@PathVariable int userId);

}
