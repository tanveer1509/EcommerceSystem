package com.ecommerce.orders;                                                                                                                   
                                                                                                                                                
import com.ecommerce.Customer;                                                                                                                  
import com.ecommerce.Product;                                                                                                                   
                                                                                                                                                
public class Order {                                                                                                                            
	private int orderID;                                                                                                                        
	private Customer customer;                                                                                                                  
	private Product[] products;                                                                                                                 
	private double orderTotal;                                                                                                                  
	private String status;                                                                                                                      
                                                                                                                                                
	public Order(int orderID, Customer customer, Product[] products) {                                                                          
		this.orderID = orderID;                                                                                                                 
		this.customer = customer;                                                                                                               
		this.products = products;                                                                                                               
		this.status = "Pending";                                                                                                                
                                                                                                                                                
		// Calculating the total                                                                                                                
		this.orderTotal = 0;                                                                                                                    
		for (int i = 0; i < products.length; i++) {                                                                                             
			if (products[i] != null) {                                                                                                          
				this.orderTotal += products[i].getPrice();                                                                                      
			}                                                                                                                                   
		}                                                                                                                                       
	}                                                                                                                                           
                                                                                                                                                
	// Method for the summary                                                                                                                   
	public void getOrderSummary() {                                                                                                             
		System.out.println("Order ID: " + this.orderID);                                                                                        
		System.out.println("Customer: " + this.customer.getName());                                                                             
		System.out.println("Total: $" + this.orderTotal);                                                                                       
		System.out.println("Status: " + this.status);                                                                                           
	}                                                                                                                                           
                                                                                                                                                
	// Method for updating status                                                                                                               
	public void updateStatus(String newStatus) {                                                                                                
		this.status = newStatus;                                                                                                                
		System.out.println("Order status updated to: " + this.status);                                                                          
	}                                                                                                                                           
                                                                                                                                                
	public double getOrderTotal() {                                                                                                             
		return this.orderTotal;                                                                                                                 
	}                                                                                                                                           
                                                                                                                                                
}                                                                                                                                               
                                                                                                                                                
