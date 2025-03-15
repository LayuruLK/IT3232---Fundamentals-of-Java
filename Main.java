public class Main {
     public static void main(String[] args) {
         Retail store = new Retail();
         store.addProduct("Orange", 50, 40);
         store.addProduct("leeks", 90, 200);
         store.addProduct("Flour", 200, 150);
 
         System.out.println("\nAvailable Products:");
         store.displayProducts();
     }
 }