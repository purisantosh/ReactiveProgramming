package com.reactive.webflux.service;

import com.reactive.webflux.dao.CustomerDao;
import com.reactive.webflux.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public List<Customer> loadAllCustomer(){
        long start = System.currentTimeMillis();
        List<Customer> customers = customerDao.getCustomers();
        long end= System.currentTimeMillis();
        System.out.println("Total execution time: "+ (end - start));
        return customers;

    }
}
