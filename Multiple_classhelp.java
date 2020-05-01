//while loop
import java.util.*;
public class Multiple_classhelp {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public void fact()
		{
		int i,n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		i=n-1;
		while(i>1)
		{
			n=n*i;	;
			i--;
		}
		System.out.println(n);

		}
	}

