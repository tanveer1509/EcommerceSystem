import com.ecommerce.Customer;                                                                                                                  
import com.ecommerce.Product;                                                                                                                   
import com.ecommerce.orders.Order;                                                                                                              
                                                                                                                                                
public class Main {                                                                                                                             
                                                                                                                                                
	public static void main(String[] args) {                                                                                                    
		// Adding a few products                                                                                                                
		Product p1 = new Product(101, "Laptop", 999.99);                                                                                        
		Product p2 = new Product(102, "Phone", 799);                                                                                            
		Product p3 = new Product(103, "Tablet", 499.99);                                                                                        
                                                                                                                                                
		// Adding a customer                                                                                                                    
		Customer c1 = new Customer("Fahim", 67);                                                                                                
		c1.addProduct(p1);                                                                                                                      
		c1.addProduct(p2);                                                                                                                      
                                                                                                                                                
		// Checking-out                                                                                                                         
		Order o1 = new Order(1, c1, c1.getShoppingCart());                                                                                      
		o1.updateStatus("Shipped");                                                                                                             
		o1.getOrderSummary();                                                                                                                   
                                                                                                                                                                                                                                                                 
                                                                                                                                                
	}                                                                                                                                           
                                                                                                                                                
}                                                                                                                                               
