class PrintedBooks extends Book{
     private int pages;
 
     public PrintedBooks(String title, String author,int pages) {
         super(title, author);
         this.pages = pages;
     }
 
     @Override
     public String getInfo() {
         return super.getInfo() + ", " + pages + " pages";
     }
 }