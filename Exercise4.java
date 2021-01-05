/**
 * then prints out all the prime numbers up to that Integer
 * @author Poovendhan
 *
 */
import java.util.*;
public class Exercise4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      
	      int num =0;
	      String  primeNumbers = "";
	      System.out.println("Enter the value of n:");
	      int n = sc.nextInt();
	      
	      for (int i = 1; i <= n; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
		    if(i%num==0)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    primeNumbers = primeNumbers + i + " ";
		 }	
	      }	
	      System.out.println("Prime numbers from 1 to n are :");
	      System.out.println(primeNumbers);
	}

}
