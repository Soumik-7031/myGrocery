package com.soumik.mygrocery.service;

import java.util.List;

import com.soumik.mygrocery.Entity.Customer;

public interface CustomerService {
    
    // Create
    Customer createCustomer(Customer customer);
    // Read 
    Customer getCustomerById(Long id);
    // Update
    Customer updateCustomerById(Long id, Customer customerDetails) ;
    // Delete
    void deleteCustomerById(Long id);
    // get all customers
    List<Customer> getAllCustomers();

}
