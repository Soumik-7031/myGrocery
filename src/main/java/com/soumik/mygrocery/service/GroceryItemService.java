package com.soumik.mygrocery.service;

import java.util.List;

import com.soumik.mygrocery.Entity.GroceryItem;

public interface GroceryItemService {
    // Create
    GroceryItem createGroceryItem(GroceryItem groceryItem);
    // Read
    GroceryItem getGroceryItemById(Long id);
    // Update
    GroceryItem updaGroceryItemById(Long id,GroceryItem groceryItemDetails) ;
    // Delete
    void deleteGroceryItemById(Long id);
    // get all items
    List<GroceryItem> getAllGroceryItems();
}
