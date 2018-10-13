package com.niit.services;

import java.util.List;

import com.niit.model.Product;



public interface ProductService {
public void addProducts(Product p);
public void updateProducts(Product p);
public void deleteProducts(int id);
public Product selectProducts(int id);
public List<Product> getAllProducts();
}
