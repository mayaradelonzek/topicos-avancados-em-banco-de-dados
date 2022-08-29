package com.cassandra.fundatec.tabd.api.controller;

import com.cassandra.fundatec.tabd.domain.model.Product;
import com.cassandra.fundatec.tabd.domain.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAll() {
        return this.productService.findAll();
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return this.productService.create(product);
    }

}
