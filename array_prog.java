import java.util.*;
public class array_prog{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Array_1[]={1,2,3,4,5,7,8,345,9,12,34};
	  // 10 is correct no of elemnts present in array otherwise if loop have count value is greater than Number of elements it might show Exception 
		// in thread "main" java.lang.ArrayIndexOutOfBoundsException: 11
       // at array_prog.main(array_prog.java:8)
		for(int i=0;i<Array_1.length;i++)   //first index of array is 0    and Array_1.length will show the exact length of array without Counting
		{
			System.out.println(Array_1[i]);
		}
			//to Display Array Table 
				int Array_2[]=new int[10];  //we can just Declare aray in this way to store values in it we can use index values
				System.out.println("Enter the values in second array");
		for(int i=0;i<Array_2.length;i++) 
		{
			Array_2[i]=sc.nextInt();
			if(Array_2[i]==0)
				break;
		}
		System.out.println("index \t value");  //   \t is for TAB space 

		for(int i=0;i<Array_2.length;i++)  {
			System.out.println(i+" \t "+Array_2[i]);
		}

	}
}