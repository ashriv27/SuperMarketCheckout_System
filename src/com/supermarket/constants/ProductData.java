package com.supermarket.constants;

import java.util.ArrayList;
import java.util.List;

import com.supermarket.vo.Product;

public class ProductData {

	Product p1 = new Product("1","Milk",5.4,0,1);
	Product p2 = new Product("2","Bread",3.5,2.0,1);
	Product p3 = new Product("3","Juice",10,3.0,1);
    
	public List<Product> returnProducts(){
		List<Product> productList = new ArrayList<Product>();
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		
		return productList;
	}

}
