package com.kandy.innex.repository;

import com.kandy.innex.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, Integer> {
}
