package com.personal.simplewebapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Product {

    private int id;
    private String name;
    private double price;

}
