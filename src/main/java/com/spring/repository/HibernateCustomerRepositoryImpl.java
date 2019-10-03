/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.repository;

import com.spring.model.Customer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author User01
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    
    @Value("${dbUsername }")
    private String dbUsername;

//    public void setDbUsername(String dbUsername) {
//        this.dbUsername = dbUsername;
//    }
    
    @Override
    public List<Customer> findAll() {
        System.out.println(dbUsername);
        List<Customer> customers = new ArrayList<>();
        
        Customer customer = new Customer();
        customer.setFirstname("José");
        customer.setLastname("Oliveira");
        
        customers.add(customer);
        
        return customers;        
    }
    
}
