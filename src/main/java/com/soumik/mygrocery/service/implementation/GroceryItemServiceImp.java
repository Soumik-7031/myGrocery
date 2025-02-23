package com.soumik.mygrocery.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.soumik.mygrocery.Entity.GroceryItem;
import com.soumik.mygrocery.rapository.GroceryRapository;
import com.soumik.mygrocery.service.GroceryItemService;

@Service
public class GroceryItemServiceImp implements  GroceryItemService {

    @Autowired
    private GroceryRapository groceryItemRepository;
    
    @Override
    public GroceryItem createGroceryItem(GroceryItem groceryItem) {
        return groceryItemRepository.save(groceryItem);
    }

    @Override
    @Cacheable(value = "products")
    public GroceryItem getGroceryItemById(Long id) {
        return groceryItemRepository.findById(id).orElse(null);
    }

    @Override
    @CachePut(value = "products")
    public GroceryItem updaGroceryItemById(Long id,GroceryItem groceryItemDetails) {
        GroceryItem item = groceryItemRepository.findById(id).orElse(null) ;
        if(item != null) {
            item.setName(groceryItemDetails.getName());
            item.setPrice(groceryItemDetails.getPrice());
            item.setQuantity(groceryItemDetails.getQuantity());
            return groceryItemRepository.save(item);
        }
        return null ;
    }

    @Override
    @CacheEvict(value = "products")
    public void deleteGroceryItemById(Long id) {
        groceryItemRepository.deleteById(id);
    }

    @Override
    public List<GroceryItem> getAllGroceryItems() {
        return groceryItemRepository.findAll() ;
    }
    
}
