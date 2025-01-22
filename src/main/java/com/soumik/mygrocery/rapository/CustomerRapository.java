package com.soumik.mygrocery.rapository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.soumik.mygrocery.Entity.Customer;


@Repository
public interface CustomerRapository extends JpaRepository<Customer, Long> {
    
}
