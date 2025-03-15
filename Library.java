public class Library {
     public static void main(String[] args) {
         PrintedBooks printedBooks = new PrintedBooks("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", 100);
         EBook ebook = new EBook("The Lord of the Rings", "J.R.R Tolkien",  "PDF");
         AudioBook audiobook = new AudioBook("The Deep", "Rivers Solomon",  10.5);
 
         System.out.println(printedBooks.getInfo());
         System.out.println(ebook.getInfo());
         System.out.println(audiobook.getInfo());
     }
 }