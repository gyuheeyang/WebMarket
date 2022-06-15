package com.survivalcoding.data;

import java.util.Collections;
import java.util.List;
import com.survivalcoding.data.dao.ProductDao;
import com.survivalcoding.domain.model.Product;
import com.survivalcoding.domain.repository.ProductRepository;

public class ProductRepositoryDBImpl implements ProductRepository {
	private ProductDao dao;
	
	public ProductRepositoryDBImpl(ProductDao dao) {
		this.dao = dao;
	}
	
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public Product getProductById(String id) {
		// TODO Auto-generated method stub
		return getAllProducts().stream()
				.filter((product)-> product.getId().equals(id)) //조건
				.findFirst() //첫번째
				.get(); //얻어
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		dao.insert(product);
		
	}
//인터페이스는 강제하려고 사용!
	
}
