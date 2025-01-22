package com.soumik.mygrocery.service;

import java.util.List;

import com.soumik.mygrocery.Entity.Order;
import com.soumik.mygrocery.dto.OrderRequest;

public interface OrderService {
    // Create
    Order createOrder(OrderRequest order);
    // Read
    Order getOrderById(Long id);
    // delete
    void deleteOrderById(Long id);
    // get all orders
    List<Order> getAllOrders();
}
