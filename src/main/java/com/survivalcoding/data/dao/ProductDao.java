package com.survivalcoding.data.dao;

import java.util.List;
import com.survivalcoding.domain.model.Product;

//Data Access Obejct
//DB랑 연결할 놈! 
public interface ProductDao {
	//interface 안에 작성한 멤버 = public final static 이 생략 되어 있다 
//	String COLUMN_ID = "p_id";
//	String TABLE_NAME = "product";
	
//	interface 안에서는 public이 생략되어 있고 public만 됨!
	List<Product> getAll(); //다 가지고 오는 것
	
	//따로 따로 가져오기 
	void insert(Product product);
	void update(Product product);
	void delete(Product product);
	
}
