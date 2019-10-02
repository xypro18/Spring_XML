/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.service;

import com.spring.model.Customer;
import com.spring.repository.CustomerRepository;
import java.util.List;

/**
 *
 * @author User01
 */
public class CustomerServiceImpl implements CustomerService {
    
    private CustomerRepository customerRepository;
    
    public CustomerServiceImpl() {
        
    }
    
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
    
}
