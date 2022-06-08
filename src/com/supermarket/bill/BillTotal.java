package com.supermarket.bill;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.supermarket.vo.Product;

public class BillTotal {
	
	Map<String, Product> item = new HashMap<String, Product>();
	
	public void addItem(Product p) {
		item.put(p.getItemId(), p);
	}
	public void removeItem(Integer itemId) {
	if(item.containsKey(itemId)) {
		item.remove(itemId);
	}else {
		System.out.println("No Item Found in cart, Please enter again");
	}
	}
	public double calculateTotal() {
		double price = 0.0;
		Iterator it = item.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry mapElement = (Map.Entry)it.next();
			Product prod = (Product) mapElement.getValue();
			price = price + ((100-prod.getDiscount())/100)*prod.getPrice()*prod.getQuantity();
		}
		return price;
	}
			

}
