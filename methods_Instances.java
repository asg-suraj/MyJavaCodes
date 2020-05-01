import java.util.*;


class help{
	private int p;
	int padha(int q)
	{
		p=q;
		padhaprint(p);
		return 0;
	}
	int mul(int a,int b)
	{
		return a*b;
	}
	int padhaprint(int r)
	{
		int i;
		for(i=1;i<=10;i++)
			System.out.printf("%d * %d =%d \n",r,i,mul(r,i));   //we can take sysout.printf for this type of problems (just like in c ) but here we cant use system.out.println
		return 0;
	}
}
public class methods_Instances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					Scanner input =new Scanner(System.in);
					help ref =new help();
					System.out.println("Enter Number To see the Table");
					int n=input.nextInt();
					ref.padha(n);
					input.close();    //object is closed after use
	}

}
