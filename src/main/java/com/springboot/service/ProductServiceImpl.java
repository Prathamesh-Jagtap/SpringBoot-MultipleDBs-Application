package com.springboot.service;

import com.springboot.dao.ProductDaoImpl;
import com.springboot.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl {

    @Autowired
    ProductDaoImpl productDaoImpl;

    public Product saveData(Product product){
        return productDaoImpl.saveData(product);
    }

    public List<Product> getAllData(){
        return productDaoImpl.getAllData();
    }
}
