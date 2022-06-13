package com.survivalcoding.domain.model;

import java.util.Objects;

//1. 무지성 private 멤버 변수
//2. 필요하면 생성자 추가
//3. 무지성 getter / setter => 읽기 전용, 쓰기 전용 (인간이 실수할 수 잇는 버그를 차단)
//4. 무지성 toSring() => 객체를 tostring으로 재정의하여 디버깅 용도로 사용
//5. 필요하면 equals/ hashCode 재정의 (오버라이드)

//java의 모든 클래스는 object 상속을 받고 있다 
public class Product {
	public static void main(String[] args) {
		Product product = new Product("33", "33", 11); 
//		static이 붙어 잇으면 메모리가 다른 곳에 저장된다 => 정적인 애들과 동적인 애들과는 상관 없음!
		System.out.println(product);
		
		Product product2 = new Product("33", "33", 11);
		System.out.println(product2);
		
		
		System.out.println(product.hashCode());
		System.out.println(product2.hashCode());
		System.out.println(product == product2 ); // false: product와 product2는 같지 않다! 
		
		Object object = new Product("33", "33", 11);
	
		System.out.println(product.equals(product2)); //false but! hashcode equals 이후에는 true (id 가 같으면 같은 놈으로 보겠다고 설정함)
		System.out.println(product.hashCode() == product2.hashCode()); //true hashcode equals 이후에 hashcode가 같아짐 ! 
		
	}
// 속성들을 private으로 만든다
	private String id;
	private String name;
	private int unitPrice;
	private String descripstion;
	private String manufacturer;
	private String categoty;
	private long unitsInstock;
	private String condition;

////	똑같은 이름의 생성자 -> 오버로드
//	public Product() {
//		
//	}
	
	
//	생성자 source (오른쪽 우클릭) -> id, name, unitPrice
//	생성자를 만드는 이유-> 오류 없이 쉽게 사용하기 위해
	public Product(String id, String name, int unitPrice) {

		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}


//	getter, setter 생성 (source 메뉴에서 생성가능)
//	캡슐화!
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getDescripstion() {
		return descripstion;
	}


	public void setDescripstion(String descripstion) {
		this.descripstion = descripstion;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public String getCategoty() {
		return categoty;
	}


	public void setCategoty(String categoty) {
		this.categoty = categoty;
	}


	public long getUnitsInstock() {
		return unitsInstock;
	}


	public void setUnitsInstock(long unitsInstock) {
		this.unitsInstock = unitsInstock;
	}


	public String getCondition() {
		return condition;
	}


	public void setCondition(String condition) {
		this.condition = condition;
	}


//	toStirng (오른쪽 우클릭 source) 
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", unitPrice=" + unitPrice + ", descripstion=" + descripstion
				+ ", manufacturer=" + manufacturer + ", categoty=" + categoty + ", unitsInstock=" + unitsInstock
				+ ", condition=" + condition + "]";
	}

//	object class => class계의 신! 
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}
	

	
	
	
}
