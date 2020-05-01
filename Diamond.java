import java.util.*;

public class Diamond{
	public static void main(String[] args) {
		//int h[],w[];
		int t;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		int[] h=new int[100];
		int[] w=new int[100];
		int Diamond=0;

		for(int i=1;i<=t;i++)
		{
			h[i]=sc.nextInt();

			w[i]=sc.nextInt();
		}
		for(int i=1;i<=t;i++)
			{
				while(h[i]>=4 && w[i]>=2)
				{
					Diamond=Diamond+1;
					h[i]=h[i]-4;
					w[i]=w[i]-2;
					if(h[i]<4 && w[i]>=2 || w[i]<2 && h[i]>=4||h[i]>=4 && w[i]>=2)
					{
					Diamond=Diamond+1;
					h[i]=h[i]-4;
					w[i]=w[i]-2;
					}
				}
				System.out.println(Diamond);
			Diamond=0;
		}

	}
}