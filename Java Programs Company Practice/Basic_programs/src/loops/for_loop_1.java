package loops;

import java.util.*;

public class for_loop_1 {

	public for_loop_1() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		boolean isPrime=true;
		System.out.println("Enter a number: ");
		num=sc.nextInt();
		
		for (int i = 2 , limit = num/2; i <limit; i++) {
			if(num%i==0) {
				isPrime=false;
			break;	
			}
			
		}
		if(isPrime) {
		System.out.println("Entered Number is prime");
		}
		else
		{
			System.out.println("Entered Number is Not prime");
		}
	}

}
