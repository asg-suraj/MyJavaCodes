import java.util.Scanner;

public class basic_calc {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double No1,No2,answer;   			//decration of variable
		
		System.out.println("Enter First number -");
		No1 =sc.nextDouble();  						// To take Double as input
		
		System.out.println("Enter Second number -");
		No2 =sc.nextDouble();
		answer= No1+No2;
		System.out.println(answer);
		
		
	}
}
