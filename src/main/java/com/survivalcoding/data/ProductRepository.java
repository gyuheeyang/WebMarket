package com.survivalcoding.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import com.survivalcoding.domain.model.Product;

public class ProductRepository {
	public static void main(String[] args) {
		
//		삽입, 삭제가 빈번할 때 항상 동일 성능, but ArrayList보다 검색이 느리다 
//		메모리를 조금 더 차지한다 
		List<Product> products = new LinkedList<>();
//		크기가 커질수록 삽입, 삭제가 느려짐 내부적으로 배열이기 때문에 성능이 빠르다 
		List<Product> products2 = new ArrayList<>();
		
		Product[] products3 = new Product[3];
		sort(Arrays.asList(products3));
		
	}
	
//	List 인터페이스로 해야 다른 사람이 사용할 때 편리하다 
	public static List<Product> sort(List<Product> products){
		//정렬
		return new ArrayList();
	}
}
