/*Create a student class
 	-create 5 student objects and store it in a proper datastructure
     -find the average marks of the students*/
 
 import java.util.ArrayList;
 
 class Student {
     private String name;
     private int marks;

     public Student(String name, int marks) {
         this.name = name;
         this.marks = marks;
     }

     public String getName() {
         return name;
     }
     public void setName(String name) {
         this.name = name;
     }

     public int getMarks() {
         return marks;
     }
     public void setMarks(int marks) {
         if (marks >= 0 && marks <= 100) {
         this.marks = marks;
         
         }else{
              System.out.println("Invalid marks! Must be between 0 and 100.");
         }
     }
 }