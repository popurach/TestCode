package com.springboot.testcode.data.repository;

import com.springboot.testcode.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
