package Array_list;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
import java.util.*;
public class prog1 {

	public prog1() {
		
	}

	public static void main(String[] args) {
		 int n,temp=0,random;
		 @SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		 n=sc.nextInt();
		 random=sc.nextInt();
		 int[] a=new int[n];
		 for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < random; i++) {
			for (int j = i+1; j < random; j++) {
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
		}
		for (int i = random; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		 for (int i = 0; i < n; i++) {
				System.out.print(a[i]+" ");
			}
	}
}
