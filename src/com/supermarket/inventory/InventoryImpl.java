package com.supermarket.inventory;

import java.util.List;

import com.supermarket.constants.ProductData;
import com.supermarket.vo.Product;

public class InventoryImpl implements InventoryInterface {

	@Override
	public Product getProductInformation(String itemId) {
		ProductData pd= new ProductData();
		List<Product> p = pd.returnProducts();
		for(Product prod : p) {
			if(prod.getItemId().equals(itemId)) {
				return prod;
			}
		}
		return null;
	}

	@Override
	public int updateInventoryRequest(String itemId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
