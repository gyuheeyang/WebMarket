package com.survivalcoding.domain.repository;

import java.util.List;
import com.survivalcoding.data.ProductRepositoryDBImpl;
import com.survivalcoding.data.dao.MySqlProductDaoImpl;
import com.survivalcoding.domain.model.Product;

public interface ProductRepository {
    
    public static ProductRepository getInstance() {
        return new ProductRepositoryDBImpl(new MySqlProductDaoImpl());
    }
    
    public List<Product> getAllProducts();
    
    public Product getProductById(String id);
    
    public void addProduct(Product product);
}