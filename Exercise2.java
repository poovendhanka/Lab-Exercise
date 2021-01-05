/**
 * simulates a traffic light. 
 * The program lets the user select one of three lights
 * : red, yellow, or green with radio buttons
 * @author Poovendhan
 *
 */
import java.util.*;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				
		System.out.println("1.Red\n2.Yellow\n3.Green");
       System.out.println("select one of three lights ");
       int ch=sc.nextInt();
		switch(ch)
		{ 
			case 1:
				System.out.print("STOP");
				break;

			case 2:
				System.out.print("READY");
				
				break;

			case 3:
				System.out.print("GO");
				
				break;       
       
       
	}

}
}
