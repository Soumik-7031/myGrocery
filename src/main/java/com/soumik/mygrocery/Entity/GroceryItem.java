package com.soumik.mygrocery.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "grocery_Item")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroceryItem {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="item_name")
    private String name ;
    @Column(name = "item_catagory")
    private String catagory ;
    @Column(name = "item_price")
    private double price ;
    @Column(name = "item_quantity")
    private double quantity ;
}
