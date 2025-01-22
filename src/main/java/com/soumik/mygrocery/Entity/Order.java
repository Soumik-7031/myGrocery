package com.soumik.mygrocery.Entity;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime orderDate ;
    
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer ;

    @ManyToMany
    @JoinTable(
        name = "order_item",
        joinColumns = @JoinColumn(name = "order_id"),
        inverseJoinColumns = @JoinColumn(name = "groceryItem_id")
    )
    private List<GroceryItem> items ;
    
    @Column(name="total_price")
    private double totalPrice ;
    
}
