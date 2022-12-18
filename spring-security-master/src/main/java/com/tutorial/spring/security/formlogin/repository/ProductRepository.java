package com.tutorial.spring.security.formlogin.repository;

import com.tutorial.spring.security.formlogin.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByproductCodeLike(String productCode);
}
