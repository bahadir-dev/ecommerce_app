package com.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Address {

    @Id
    private String id;

    private String name;
    private String street;
    private String zipCode;

    @ManyToOne
    private Customer customer;


}
