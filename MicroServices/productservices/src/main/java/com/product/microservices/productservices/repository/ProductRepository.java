package com.product.microservices.productservices.repository;

import com.product.microservices.productservices.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
