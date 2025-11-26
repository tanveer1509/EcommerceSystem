# E-commerce System 🛒

A modular Java application that simulates the backend logic for an online store. This project demonstrates the use of **Java Packages** to organize code and **Encapsulation** to protect data integrity.

## 📂 Project Architecture
The project follows standard Java naming conventions and package structures:

* **`src/com/ecommerce`**
  * `Product.java`: Defines product attributes (ID, Name, Price) using private variables and public getters/setters.
  * `Customer.java`: Manages customer data and a shopping cart implementation using arrays.
* **`src/com/ecommerce/orders`**
  * `Order.java`: Handles transaction logic, automatic total calculation, and status updates.
* **`src/Main.java`**
  * The entry point that simulates a full shopping scenario (browsing, adding to cart, purchasing, and updating order status).

## Key Features
* **Encapsulation:** All data attributes are `private`, accessible only through controlled methods.
* **Shopping Cart Logic:** Custom logic to add/remove items from a fixed-size array.
* **Automated Calculations:** Order totals are calculated automatically upon object creation.
* **Cross-Package Access:** Demonstrates the use of `import` statements to connect classes across different packages.

## Sample Output
When running the Main program, the console demonstrates the lifecycle of an order:

```text
Laptop added to cart.
Phone added to cart.
Order status updated to: Shipped
Order ID: 1
Customer: Fahim
Total: $1798.99
Status: Shipped
An item has been removed
