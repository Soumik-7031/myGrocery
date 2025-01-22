package com.soumik.mygrocery.rapository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.soumik.mygrocery.Entity.Order;

@Repository
public interface  OrderRapository extends JpaRepository<Order, Long> {
    
}
