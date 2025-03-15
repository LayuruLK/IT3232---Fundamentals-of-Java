import java.util.ArrayList;

public class StudentApp {
     public static void main(String[] args) {
         ArrayList<Student> students = new ArrayList<>();

         students.add(new Student("Chamika", 85));
         students.add(new Student("Sanduni", 78));
         students.add(new Student("Lahiru", 91));
         students.add(new Student("Samanmali", 72));
         students.add(new Student("Tharushi", 88));

         int totalMarks = 0;
             for (Student s : students) {
                 totalMarks += s.getMarks();  // Using getter
             }
 
         double average = (double) totalMarks / students.size();
 
         System.out.println("Average Marks of Students: " + average);
     }
 }