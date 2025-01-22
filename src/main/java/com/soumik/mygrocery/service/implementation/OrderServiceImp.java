package com.soumik.mygrocery.service.implementation;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soumik.mygrocery.Entity.Customer;
import com.soumik.mygrocery.Entity.GroceryItem;
import com.soumik.mygrocery.Entity.Order;
import com.soumik.mygrocery.dto.OrderRequest;
import com.soumik.mygrocery.rapository.CustomerRapository;
import com.soumik.mygrocery.rapository.GroceryRapository;
import com.soumik.mygrocery.rapository.OrderRapository;
import com.soumik.mygrocery.service.OrderService;

@Service
public class OrderServiceImp implements OrderService {

    @Autowired
    private OrderRapository orderRepository;
    @Autowired
    private CustomerRapository customerRapository;
    @Autowired
    private GroceryRapository groceryRapository ;

    @Override
    public Order createOrder(OrderRequest orderRequest) {
        Customer customer = customerRapository.findById(orderRequest.getCustomerId()).orElse(null);
        List<GroceryItem> products = groceryRapository.findAllById(orderRequest.getProductIds());
        
        if(customer != null) {
            Order order = new Order();
            order.setCustomer(customer);
            order.setItems(products);
            order.setOrderDate(LocalDateTime.now());
            return orderRepository.save(order);
        }

        return null ;
        
    }

    @Override
    public Order getOrderById(Long id) {
       return orderRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteOrderById(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
    
}
