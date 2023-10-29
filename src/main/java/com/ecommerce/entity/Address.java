package com.ecommerce.entity;

import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

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

    public Address(String id, String name, String street, String zipCode) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.zipCode = zipCode;
    }


}
