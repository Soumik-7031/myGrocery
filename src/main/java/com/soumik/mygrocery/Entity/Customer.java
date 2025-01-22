package com.soumik.mygrocery.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "customer")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="customer_name")
    private String name ;
    @Column(name="cutomer_email")
    private String email;
    @Column(name ="cutomer_address")
    private String address;
    @Column(name="customer_phno")
    private String phNo ;
}
