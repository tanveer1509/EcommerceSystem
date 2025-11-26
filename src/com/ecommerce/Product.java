package com.ecommerce;                                                                                                                          
                                                                                                                                                
public class Product {                                                                                                                          
	private int productID;                                                                                                                      
	private String name;                                                                                                                        
	private double price;                                                                                                                       
                                                                                                                                                
	// Constructor                                                                                                                              
	public Product(int productID, String name, double price) {                                                                                  
		this.productID = productID;                                                                                                             
		this.name = name;                                                                                                                       
		this.price = price;                                                                                                                     
	}                                                                                                                                           
                                                                                                                                                
	public String getName() {                                                                                                                   
		return this.name;                                                                                                                       
	}                                                                                                                                           
                                                                                                                                                
	public double getPrice() {                                                                                                                  
		return this.price;                                                                                                                      
	}                                                                                                                                           
                                                                                                                                                
	public int getProductID() {                                                                                                                 
		return this.productID;                                                                                                                  
	}                                                                                                                                           
                                                                                                                                                
	public void setName(String name) {                                                                                                          
		this.name = name;                                                                                                                       
	}                                                                                                                                           
                                                                                                                                                
	public void setPrice(double price) {                                                                                                        
		this.price = price;                                                                                                                     
	}                                                                                                                                           
                                                                                                                                                
	public void setProductID(int productID) {                                                                                                   
		this.productID = productID;                                                                                                             
	}                                                                                                                                           
}                                                                                                                                               
                                                                                                                                                
