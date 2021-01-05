/**
	 * find the sum of the cubes of the digits of an n digit number
	 * @author Poovendhan
	 *
	 */
import java.util.*;

public class Exercise1 {
    public static int sum(int n)
    {
    	int sum=0;
    	for(int i=1;i<=n;i++)
    	{
    		sum+=i*i*i;
    	}
    	return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Sum of cubes on n number:"+ sum(n));
		
	}

}
