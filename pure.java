import java.util.*;

public class pure{
	public static int reverse(int n)
{
	int rev=0, i;
	for(i=0;n%10!=0;i++)
	{
		rev=rev*10+n%10;
		n=n/10;
	}
	return rev;
}


	public static void arrmul (int n ) {
		int[] arr = new int[n];
		int i,j,k=1;
		int[] arrm =new int[n];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Numbers");
		for (i=0;i<n ;i++ ) {
			arr[i]=sc.nextInt();
		}
		for (i=0;i<n ;i++ ) {
			//System.out.println(arr[i]);
		
		for (j=0;j<n ;j++ ) {
	
			if(j!=i){

			k=k*arr[j];
			//System.ou.println("k= "+k );			
				}
				
	
	
		
		}
		arrm[i]=k;
		k=1;

// convert array to Vector
//Vector v = new Vector(Arrays.asList(arrm));






	}

	for (i=0;i<n ;i++ ) {
			System.out.println(arrm[i]);
		}
		

	} 



	public static void main(String[] args) {
		//System.out.println(match(102));
		arrmul(5);
		int j;
		j=reverse(321);
		System.out.println(j);
		System.out.println("96719db60d8e3f498c98d94155e1296aac105ck4923290c89eeeb3ba26d3eef92".length()-1);
	}
		
}
