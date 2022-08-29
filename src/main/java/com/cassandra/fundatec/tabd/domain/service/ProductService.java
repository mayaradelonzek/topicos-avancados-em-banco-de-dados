package com.cassandra.fundatec.tabd.domain.service;

import com.cassandra.fundatec.tabd.domain.model.Product;
import com.cassandra.fundatec.tabd.infrastructure.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    public Product create(Product product) {
        return this.productRepository.save(product);
    }

}
