package com.cassandra.fundatec.tabd.infrastructure.repository;

import com.cassandra.fundatec.tabd.domain.model.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ProductRepository extends CassandraRepository<Product, Integer> {
}
