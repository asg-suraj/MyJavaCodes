import java.util.*;

public class blotch{
	
	public static int[] countFreq(int arr[], int n) 
{ 
    boolean visited[] = new boolean[n]; 
      int[] count= new int[n];
    Arrays.fill(visited, false); 
  
    // Traverse through array elements and 
    // count frequencies 
    for (int i = 0; i < n; i++) { 
  
        // Skip this element if already processed 
        if (visited[i] == true) 
            continue; 
  
        // Count frequency 
        int counth = 1; 
        for (int j = i + 1; j < n; j++) { 
            if (arr[i] == arr[j]) { 
                visited[j] = true; 
                counth++; 
            } 
        } 
        count[i]=counth;
        //System.out.println(arr[i] + " " + count); 
    }
    return count; 
} 


	public static void main(String[] args) {
		int n;
		int t;
		int k;
		Scanner sc =new Scanner(System.in);
		t=sc.nextInt();
		int[] a =new int[t+1];
		


		for(int s=1;s<=t;s++){
			n=sc.nextInt();
			k=sc.nextInt();

			int[] arr =new int[n+1];  //Ai
			int[] count= new int[n+1]; //frequency

			for (int i=1;i<=n ;i++ ) {
				arr[i]=sc.nextInt();	
			}
			for (int i=1;i<=n ;i++ ) {
				count[i]=0;	
			}
			Arrays.sort(arr);
			count=countFreq(arr,n+1);
			
			Arrays.sort(count);
			
			int sum=0;
			

			for (int i=1;i<=count.length-k-1 ;i++ ) {
				sum=sum+count[i];
			
			}
			sum = sum -1;
			if(sum==-1)
			{
				sum=0;
			}

			a[s]=sum;

		}

	for (int i=1;i<=t ;i++ ) {
		System.out.println("Case #"+i+": "+a[i]);
	}
	}
}