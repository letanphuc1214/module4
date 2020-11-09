package com.codegym.service;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Iterable<Blog> findAll();


    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);

    Iterable<Blog> findAllByCategory(Category category);

    Page<Blog> findAll(Pageable pageable);

    Page<Blog> findAllByTitleContaining(String title, Pageable pageable);
}
