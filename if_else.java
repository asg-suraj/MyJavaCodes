import java.util.*;


public class if_else {
	public static void main(String args[]) {
		int test;
		Scanner sc=new Scanner(System.in);
		test=sc.nextInt();
		if(test >75)  //use of if to check the condition if satisfies executes this block or move next block of else if
		{
			if(test<85)      							//this if-else inside if else is nothing but nested if-else...
			System.out.println("Distinction");

			else
			System.out.println("Excellent -First Class");
		}
		else if(test>45)   //if more conditions are there we can use multiple else if satements 
		{	
			if(test>60)
			System.out.print("Better....");
			
			else
			System.out.println("You should work hard");
		}
		else
		{
			if(test>40)
				System.out.println("Just passed Luck is with you....");
			
			else
				System.out.println("U r failed!!");

		}
	}
}
