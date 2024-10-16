package com.springboot.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer {

    @Id
    @GeneratedValue
    private int custId;
    private String custName;
    private double custAccountBalance;
    @JsonFormat(pattern = "dd-MM-yyyy", timezone = "Asia/kolkata")
    private Date custDOB;
}
