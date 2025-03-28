/*Reverse the left and right numbers like
 You must use only a loop
 input  9
 output 4 3 2 1 5 9 8 7 6
 
 input 13
 output 6 5 4 3 2 1 7 13 12 11 10 9 8*/
import java.util.Scanner;

public class ReverseLR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        
        
        for (int i = n / 2; i >= 1; i--) {
            System.out.print(i + " ");
        }
        
        
        if (n % 2 != 0) {
            System.out.print((n / 2) + 1 + " ");
        }
        
        
        for (int i = n; i > (n / 2) + (n % 2); i--) {
            System.out.print(i + " ");
        }
    }
}
