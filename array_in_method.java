// Dynamic version must be seen or corrected given below
public class arrays_in_method {
	public static void main(String args[])
	{
		int bucky[]= {45,20,15,62,15};
		change (bucky);
		
		for(int y:bucky)
			System.out.println(y);
		
	}
	public static void change(int x[])
	{
		for(int i=0;i<x.length;i++)
			x[i]+=5;
	}
}





/*
import java.util.*;
public class array_in_method {
		public static void main(String[] args) {
			int Array_1[]=new int[10];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the array elements");
				for(int i=0;i<Array_1.length;i++)   //first index of array is 0    and Array_1.length will show the exact length of array without Counting
		{
			Array_1[i]=sc.nextInt();
		}
				System.out.println("Changed array elements");
				Array_1=change(Array_1);
				for(int i=0;i<Array_1.length;i++)
			{
					System.out.println(Array_1[i]);
			}

		}
		public static void change(int y[])
		{
			int i;
			for(i=0;i<=y.length;i++);
			{
					y[i]=y[i]+5;
					
					
			}
			
		}
	}
*/

	