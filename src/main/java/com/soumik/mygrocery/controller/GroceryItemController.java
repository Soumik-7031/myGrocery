package com.soumik.mygrocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.soumik.mygrocery.Entity.GroceryItem;
import com.soumik.mygrocery.service.GroceryItemService;


@RestController
@RequestMapping("/api/groceryItems")
public class GroceryItemController {

    @Autowired
    private GroceryItemService groceryItemService;
    
    // Create
    @PostMapping
    public ResponseEntity<GroceryItem> createGroceryItem(@RequestBody GroceryItem groceryItem) {
        GroceryItem item = groceryItemService.createGroceryItem(groceryItem) ;
        return ResponseEntity.ok(item) ;
    }
    // get all grocery items
    @GetMapping
    public List<GroceryItem> getAllGroceryItems() {
        return groceryItemService.getAllGroceryItems() ;
    }
    // Read 
    @GetMapping("{id}")
    public ResponseEntity<GroceryItem> getGroceryItemById(@PathVariable Long id) {
        GroceryItem item = groceryItemService.getGroceryItemById(id) ;
        return ResponseEntity.ok(item) ;
    }
    // Update
    @PutMapping("{id}")
    public ResponseEntity<GroceryItem> updateGroceryItemById(@PathVariable Long id,@RequestBody GroceryItem groceryItemDetails) {
        GroceryItem item = groceryItemService.updaGroceryItemById(id, groceryItemDetails) ;
        return ResponseEntity.ok(item) ;
    }
    // Delete
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteGroceryItemById(@PathVariable Long id) {
        groceryItemService.deleteGroceryItemById(id);
        return ResponseEntity.ok().build() ;
    }
}
