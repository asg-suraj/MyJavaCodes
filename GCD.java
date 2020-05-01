//GCD Program Entire Logic Created By srjwhite


import java.util.*;


public class GCD{
	public static void main(String[] args) {
		int n,m,i=1,j=1;
		int[] D = new int[1000];
		n=m=0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int val1,val2;

		if(n>m)
		{
			val1=n;
			val2=m;
		}
		else
		{
			val1=m;
			val2=n;
		}
		
		while(i<=val2)
		{
			if(val1%i==0&&val2%i==0)
			{
				D[j]=i;
				j++;
			}
		i++;

		}
		j=2;
		int max=D[1];
		
		while(j<=val2)
		{
			if(D[j]> max)
			{
				max=D[j];
			}
			j++;
		}

		System.out.println("GCD of"+n+"&"+m+"="+max);

	}
}