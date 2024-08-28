package com.personal.simplewebapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
public class Product {

    @Id
    private int id;
    private String name;
    private double price;

}
