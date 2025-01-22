package com.soumik.mygrocery.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.soumik.mygrocery.Entity.Order;
import com.soumik.mygrocery.dto.OrderRequest;
import com.soumik.mygrocery.service.OrderService;


@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Create
    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody OrderRequest orderRequest) {
        Order order = orderService.createOrder(orderRequest) ;
        return ResponseEntity.ok(order) ;
    }
    // get all orders
    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders() ;
    }
    // Read 
    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(Long id) {
        Order order = orderService.getOrderById(id) ;
        return ResponseEntity.ok(order);
    }
    
    // Delete
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteOrderById(Long id) {
        orderService.deleteOrderById(id) ;
        return ResponseEntity.ok().build() ;
    }
    
}
