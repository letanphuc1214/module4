package com.codegym.repository;

import com.codegym.model.Smartphone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SmartphoneRepository extends PagingAndSortingRepository<Smartphone, Integer> {


}
