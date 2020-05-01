import java.util.*;
public class compound_int{
	public static void main(String[] args) {
			double amount=0;
			double principle;
			double rate;
			int no_of_months;
			System.out.println("Enter value of principle,rate");
				Scanner sc=new Scanner(System.in);
				
				principle=sc.nextDouble();
				rate=sc.nextDouble();
				no_of_months=sc.nextInt();
				for(int i=1;i<=no_of_months;i++)
				{
					amount=principle * Math.pow(1+rate ,i);  //math.pow represents here (1+R)^n
				}

				System.out.println(amount);
				//A=p (1+R)^n;

	}
}