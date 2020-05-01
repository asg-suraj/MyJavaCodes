package Suraj


import java.util.*;


//methods for Searching and Sorting

class sorter{
	

	boolean sortedornot(int a[])
	{
		if(a.length==0 || a.length ==1)
			{
				return true;
			}
		for (int i=1;i<a.length;i++ ) {
			if(a[i-1]>a[i])
				return false;
			
		}
		return true;
	}

	int[] selectionSort(int a[])
	{

		
    
      if (sortedornot(a)) {
      	return a;
      }
        int n = a.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (a[j] < a[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = a[min_idx]; 
            a[min_idx] = a[i]; 
            a[i] = temp; 
        } 
  
		return a;
	}

	int[] bubbleSort(int a[])
	{
	 if (sortedornot(a)) {
      	return a;
      }
		for (int i=1;i<a.length;i++ ) {
			for (int j=0;j<a.length ;j++ ) {
				if(a[j]>a[i])
					{
						int temp=a[j];
						a[j]=a[i];
						a[i]=temp;

					}
				
			}
		}
		return a;
	}

	int[] insertionSort(int a[])
	{
		if (sortedornot(a)) {
      	return a;
      }
//        9 8 7 6 5 4 3
      
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<=i;j++)
			if(a[j]>a[i])
			{
				int temp =a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		return a;
	}


}


public class Searcher{
	static boolean LinearSearch(int x ,int a[])  
	{
		for (int i=0;i<a.length ;i++ ) {
			if(a[i]==x)
			{
				return true;
			}
			
		}
		return false;
	}

	static boolean binarySearch(int x, int a[])
	{
		int max,min;
		max=a.length;
		min=0;
		int mid;
		sorter s =new sorter();
		if(s.sortedornot(a))
		{}
		else
		{
			System.out.println("Array Not Sorted No Binary Search can happen");
			System.exit(0);
		}
		for(int i=min;i<=max;i++)
		{
			mid=(min+max)/2;

			if(a[mid]==x)
			{
				return true;
			}
			else if (x>a[mid])
			{
				min=mid+1;
			}
			else{
				max=mid-1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] ={9,8,7,6,5,4,3};
		int arr2[]= {1,3,5,7,9,11,13};
		sorter so =new sorter();
		System.out.println("Unsorted Given below");
		for (int i=0;i<arr.length ;i++ ) {
			System.out.println(arr[i]);			
		}
		System.out.println("sorted Given below");
		int[] sortedArray =so.insertionSort(arr);
		
		for (int i=0;i<sortedArray.length;i++ ) {
			System.out.println(sortedArray[i]);
		}	

		
		
		System.out.println(so.sortedornot(arr2));
		System.out.println(LinearSearch(20,arr));
		System.out.println(binarySearch(9,arr2));
	}
}