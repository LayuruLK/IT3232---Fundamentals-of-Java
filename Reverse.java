//Print the numbers in reverse
 public class Reverse{
 	public static void main(String args[]){
 		int num = 12345678;
 		
 		while(num>0){
 			int n1 = num%10;
 			System.out.println(n1);
 			num=num/10;
 		}
 	}
 }