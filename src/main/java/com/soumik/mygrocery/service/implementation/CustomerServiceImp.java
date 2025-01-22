package com.soumik.mygrocery.service.implementation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soumik.mygrocery.Entity.Customer;
import com.soumik.mygrocery.rapository.CustomerRapository;
import com.soumik.mygrocery.service.CustomerService;

@Service
public class CustomerServiceImp implements  CustomerService {

    @Autowired
    private CustomerRapository customerRapository ;

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRapository.save(customer) ;
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRapository.findById(id).orElse(null) ;
    }

    @Override
    public Customer updateCustomerById(Long id, Customer customerDetails) {
        Customer customer = customerRapository.findById(id).orElse(null) ;
        if (customer != null) {
            customer.setName(customerDetails.getName());
            customer.setEmail(customerDetails.getEmail());
            customer.setPhNo(customerDetails.getPhNo());
            return customerRapository.save(customer) ;
        }

        return null ;
    }

    @Override
    public void deleteCustomerById(Long id) {
        customerRapository.deleteById(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRapository.findAll() ;
    }
    
}
