package com.soumik.mygrocery.rapository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.soumik.mygrocery.Entity.GroceryItem;

@Repository
public interface GroceryRapository extends JpaRepository<GroceryItem, Long> {
    
}
