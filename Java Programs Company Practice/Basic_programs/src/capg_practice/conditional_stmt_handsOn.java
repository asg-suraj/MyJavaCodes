//Tells Student Grade based on Marks
package capg_practice;
import java.util.*;
public class conditional_stmt_handsOn {

	public conditional_stmt_handsOn() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// Start Code
		Scanner sc = new Scanner(System.in);
			int phy, chem, math;
			phy = sc.nextInt();
			chem = sc.nextInt();
			math = sc.nextInt();
			sc.close();
			if(phy<0 ||phy >100 || chem <0 || chem >100 || math<0 ||math >100)
			{
			    System.out.println("INVALIDMARKS");
			   
			}
	    else{
			double avg = (phy + chem + math) / 3;

			if (avg >= 70) {
				System.out.println("DISTINCTION");
			} else if (avg >= 60 && avg < 70) {

				System.out.println("FIRST");
			} else if (avg >= 50 && avg < 60) {

				System.out.println("SECOND");
			} else if (avg >= 40 && avg < 50) {

				System.out.println("THIRD");
			} else {
				System.out.println("FAIL");

			}
	    }
//			End Code
	}

}
