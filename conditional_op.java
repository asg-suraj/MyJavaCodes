//also called as Ternary Operator 

import java.util.*;
public class conditional_op{
	public static void main(String[] args) {
				System.out.println("Enter any value");
				Scanner sc=new Scanner(System.in);
				int val=sc.nextInt();
				int age;
				
			age=val >30 ? 42:26;   //use of Conditional Operator.....
			
			System.out.println(age);
			
	}
}