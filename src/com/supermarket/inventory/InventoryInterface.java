package com.supermarket.inventory;

import com.supermarket.vo.Product;

public interface InventoryInterface {
	
	Product getProductInformation(String itemId);
	int updateInventoryRequest(String itemId);

}
