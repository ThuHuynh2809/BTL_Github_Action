package com.example.githubactioncicd.controller;

import com.example.githubactioncicd.models.Product;
import com.example.githubactioncicd.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    //Hello fan
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        return productRepository.save(product);
    }
    // production
    // fix error
    // hello features/test 1
    // hello features/test 2
    @GetMapping("/products")
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }


    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable long id){
        return productRepository.findById(id).get();
    }
}
