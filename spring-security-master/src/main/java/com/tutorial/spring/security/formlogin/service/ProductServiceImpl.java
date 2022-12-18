package com.tutorial.spring.security.formlogin.service;

import com.tutorial.spring.security.formlogin.model.Product;
import com.tutorial.spring.security.formlogin.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository repository;
    @Override
    public List<Product> listProduct() {
        return repository.findAll();
    }

    @Override
    public List<Product> productDetail(String productCode) {
        return repository.findByproductCodeLike(productCode);
    }
}
