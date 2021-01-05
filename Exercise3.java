/**
 * The Fibonacci sequence
 * @author Poovendhan
 *
 */
import java.util.*;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int givenNumber,previousNumber =0, nextNumber = 1;
		 
		    System.out.println("How many numbers you want in Fibonacci:");
	        Scanner sc= new Scanner(System.in);
	        givenNumber = sc.nextInt();
	        System.out.print("Fibonacci Series of "+givenNumber+" numbers:");
 
	        for (int i = 1; i <= givenNumber; ++i)
	        {
	            System.out.print(previousNumber+" ");
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }

	}
}

