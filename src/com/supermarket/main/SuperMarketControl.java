package com.supermarket.main;
import java.util.Scanner;

import com.supermarket.bill.BillTotal;
import com.supermarket.inventory.InventoryImpl;
import com.supermarket.vo.Product;

public class SuperMarketControl {

	public static void main(String[] args) {
		 String choice ="";
		 BillTotal bt = new BillTotal();
		while(true) {
			Scanner scannerName= new Scanner(System.in);
			System.out.println("Welcome to our SuperMaket checkout system\nPlease enter item id to checkout\nTo generate bill type/touch total");
		    choice = scannerName.next();
		if(choice.equals("total")) {
	 double totalBillAmount = bt.calculateTotal();
		              System.out.println("Total Amount = "+totalBillAmount);
		              System.out.println("Please complete payment by entering credit card details in swiper");
		              break;
		}else { 
			InventoryImpl in = new InventoryImpl();
		    Product p = in.getProductInformation(choice);
		    System.out.println("Product Information\nName:"+p.getName()+"\n"+"Price:"+p.getPrice()+"\nDiscount:"+p.getDiscount());
		    System.out.println("Please enter quantity of product:");
			int y = scannerName.nextInt();
			p.setQuantity(y);

		    bt.addItem(p);
		}		
		}}
	
}
