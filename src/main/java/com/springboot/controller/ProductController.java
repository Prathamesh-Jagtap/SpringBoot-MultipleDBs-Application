package com.springboot.controller;

import com.springboot.model.Product;
import com.springboot.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductServiceImpl productServiceImpl;

    @PostMapping("/savedata")
    public ResponseEntity<Product> saveData(@RequestBody Product product){
        return ResponseEntity.ok(productServiceImpl.saveData(product));
    }

    @GetMapping("/getalldata")
    public ResponseEntity<List<Product>> getAllData(){
        return ResponseEntity.ok(productServiceImpl.getAllData());
    }
}
