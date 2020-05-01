import Suraj.*;
import java.util.*;

public class UniqueNumbers{

	public static boolean match (int n) {
		int i,j,k=0,cnt=0;
		int p,q;
		int[] arr = new int[50];
		p=n;

		for (i=0;p>0 ;i++ ) {
			q=p%10;
			arr[i]=q;


			
			p=p/10;
			cnt=cnt+1;
		}
	

		for (i=0;i<cnt ;i++ ) {
			//System.out.println(arr[i]);
		
		for (j=0;j<cnt ;j++ ) {
	
			if(j!=i){
			if(arr[i]==arr[j]  )  
			{
				return true;
				
			}	
		}
		}
		}
		return false;

	} 



	public static void main(String[] args) {
		//System.out.println(match(102));
		
		System.out.println("Enter the Number Upto Which You need to find Unique Numbers");
		//unique Number 123,102,etc
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=100;i<=num;i++)
		{
			if(match(i))
			{

			}
			else
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
		int arr1[] ={1,2,3,4,5,6,7,8};
		sorter so =new sorter();
		so.insertionSort(arr1);
		for (int k=0;k<arr1.length ;k++ ) {
			System.out.println(arr1[k]);
		}
	}
}
