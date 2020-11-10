package com.codegym.service;

import com.codegym.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Customer findOne(Long id) throws Exception;

    Page<Customer> findAll(Pageable pageable) throws Exception;

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
