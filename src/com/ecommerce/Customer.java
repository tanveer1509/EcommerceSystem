package com.ecommerce;                                                                                                                          
                                                                                                                                                
public class Customer {                                                                                                                         
	private Product[] shoppingCart;                                                                                                             
	private String name;                                                                                                                        
	private int customerID;                                                                                                                     
                                                                                                                                                
	public Customer(String name, int customerID) {                                                                                              
		this.customerID = customerID;                                                                                                           
		this.name = name;                                                                                                                       
		this.shoppingCart = new Product[10];                                                                                                    
                                                                                                                                                
	}                                                                                                                                           
                                                                                                                                                
	public String getName() {                                                                                                                   
		return this.name;                                                                                                                       
	}                                                                                                                                           
                                                                                                                                                
	public Product[] getShoppingCart() {                                                                                                        
		return this.shoppingCart;                                                                                                               
	}                                                                                                                                           
                                                                                                                                                
	// Add product method                                                                                                                       
	public void addProduct(Product product) {                                                                                                   
		for (int i = 0; i < shoppingCart.length; i++) {                                                                                         
			if (shoppingCart[i] == null) {                                                                                                      
				shoppingCart[i] = product;                                                                                                      
				System.out.println(product.getName() + " added to cart.");                                                                      
				return;                                                                                                                         
			}                                                                                                                                   
		}                                                                                                                                       
		System.out.println("The cart is full");                                                                                                 
	}                                                                                                                                           
                                                                                                                                                
	// Remove product method                                                                                                                    
	public void removeProduct(Product product) {                                                                                                
		for (int i = 0; i < shoppingCart.length; i++) {                                                                                         
			if (shoppingCart[i] != null && shoppingCart[i] == product) {                                                                        
				shoppingCart[i] = null;                                                                                                         
				System.out.println("An item has been removed");                                                                                 
			}                                                                                                                                   
		}                                                                                                                                       
	}                                                                                                                                           
                                                                                                                                                
	// Calculating Total                                                                                                                        
	public double calculateTotal() {                                                                                                            
		double total = 0;                                                                                                                       
                                                                                                                                                
		for (int i = 0; i < shoppingCart.length; i++) {                                                                                         
			if (shoppingCart[i] != null) {                                                                                                      
				total += shoppingCart[i].getPrice();                                                                                            
			}                                                                                                                                   
                                                                                                                                                
		}                                                                                                                                       
                                                                                                                                                
		return total;                                                                                                                           
                                                                                                                                                
	}                                                                                                                                           
}                                                                                                                                               
                                                                                                                                                
