package com.tutorial.spring.security.formlogin.controller;

import com.tutorial.spring.security.formlogin.model.Product;
import com.tutorial.spring.security.formlogin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/")
    public String product(final Model model)  {
        List<Product> productList = productService.listProduct();
        model.addAttribute("products", productList);
        return "home";
    }

    @GetMapping(value = "/details/{productCode}")
    public String productDetail(@PathVariable(value = "productCode") String productCode,Model model)  {
        List<Product> product = productService.productDetail(productCode);
        model.addAttribute("productDetail", product);
        return "productDetails";
    }
}
