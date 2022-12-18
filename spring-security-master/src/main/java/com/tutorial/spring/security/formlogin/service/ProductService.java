package com.tutorial.spring.security.formlogin.service;

import com.tutorial.spring.security.formlogin.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> listProduct();

    List<Product> productDetail(String productCode);
}
