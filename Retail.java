class Retail{
     Product[] products = new Product[5];
     int count = 0;
 
     public void addProduct(String name, double price, int quantity) {
         products[count++] = new Product(name, price, quantity);
     }
 
     public void displayProducts() {
         for (int i = 0; i < count; i++) {
             System.out.println(products[i]);
         }
     }
 }