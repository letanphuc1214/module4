package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "pepsi", 7000, "pepsi"));
        products.put(2, new Product(2, "cocacola", 7000, "cocacola"));
        products.put(3, new Product(3, "sting", 7000, "sting"));
        products.put(4, new Product(4, "bear huda", 10000, "Huda"));
        products.put(5, new Product(5, "bear tiger", 12000, "tiger"));
        products.put(6, new Product(6, "redbull", 9000, "redbull"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
