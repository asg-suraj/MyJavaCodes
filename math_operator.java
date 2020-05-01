import java.util.Scanner;
public class math_operator{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double No1,No2,answer;   			//decration of variable
		
		System.out.println("Enter First number -");
		No1 =sc.nextDouble();  						// To take Double as input
		
		System.out.println("Enter Second number -");
		No2 =sc.nextDouble();
		
		answer= No1+No2;						// answer will come in 
		System.out.println("Addition"+answer); //it adds both string and variable output simultaneously
		
		answer= No1-No2;
		System.out.println("Subtraction"+answer);
		
		answer= No1*No2;
		System.out.println("multiplication"+answer);
		
		answer= No1/No2;
		System.out.println("Division"+answer);
		
		
	}
}
