package com.codegym.repository;

import com.codegym.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    //    Iterable<Customer> findAllByProvince(Province province);
//
//    Customer findOne(Long id);
//
//    void delete(Long id);
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
