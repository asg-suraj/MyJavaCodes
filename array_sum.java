import java.util.*;
public class array_sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Array_2[]=new int[10];  //we can just Declare aray in this way to store values in it we can use index values
				System.out.println("Enter the values in second array");
		for(int i=0;i<Array_2.length;i++) 
		{
			Array_2[i]=sc.nextInt();
			if(Array_2[i]==0)
				break;
		}
		System.out.println("Sum of all this Numbers is");  //   \t is for TAB space 
			int sum=0;
		for(int i=0;i<Array_2.length;i++)  {
			sum=sum+Array_2[i];
		}
		
			System.out.println(sum);

				//Enhanced For loop

				int total=0;
			for(int x : Array_2){  //this loop automatically saves value of loop one by one to variable x for each iteration    
					total=total+x;
			}
		
			System.out.println("The Sum by using Enhanced For Loop is "+total);
	
	}
}