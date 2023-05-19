package com.ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ai.model.Product;
import com.ai.persistant.dao.ProductDao;

@Controller
@RequestMapping("/api/products")
public class ProductController {

    private ProductDao productDao;

    @Autowired
    public ProductController(ProductDao productDao) {
        this.productDao = productDao;
    }

    @PostMapping
    public ResponseEntity<String> addProduct(@RequestBody Product product) {
        productDao.insertData(product);
        return ResponseEntity.ok("Product added successfully");
    }
}