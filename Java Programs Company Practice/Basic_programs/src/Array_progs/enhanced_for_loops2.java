/**
 * Code Explains Working of ForEach Loop
 */
package Array_progs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author win
 *
 */
public class enhanced_for_loops2 {

	public enhanced_for_loops2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Here we are using Enhanced For loop

		String names[] = { "jagjit", "priyanka", "Chanky", "Sanket", "Prakash", "Madhav" };
		
		for (String name : names) { //see how it is declared 
			System.out.println(name); //it will print all names of names array of String
		}
		
		//It can also work on any itrable item like List,Set,Vector in Same way
		
		List<String> list =Arrays.asList(names);
		
		for (String name : list) {
			System.out.println("Hola "+name);
		}

	}

}
