package com.springboot.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    private int productId;
    private String productName;
    private double productPrice;
    @JsonFormat(pattern = "dd-MM-yyyy", timezone = "Asia/kolkata")
    private Date productLaunchDate;
}
