/**
 * Display String in reverse order word by word
 * @author panka
 *
 */
public class Assignment1 {

	public static void main(String[] args) {
		String str1 = "Hello Dear Friend";
		//Output as  :  Friends Dear Hello
		String output = reverseString(str1);
		System.out.println(output);
		

	}

	private static String reverseString(String str1) {
		 String s[] = str1.split(" "); 
	      String rev = ""; 
	      for (int i = s.length - 1; i >= 0; i--) { 
	        rev += s[i] + " "; 
	      } 
	      
	    return rev;
		
	}

}