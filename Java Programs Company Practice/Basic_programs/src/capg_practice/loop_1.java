
// Program to find Binary Number for Values between 1-999



package capg_practice;

import java.util.Scanner;

public class loop_1 {

	public loop_1() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		//int div=1;
		int[] Bin =new int[14];
		int count=0;
		if (num>0 &&num<1000) {
			
		for (int i = 0; num!=0 ; i++) {
			Bin[i]=num%2;
			num=num/2;
			
			count++;
		}	
			
		for (int i = count-1;i>=0 ; i--) {
			System.out.print(Bin[i]);
		}
			
			
			
		}
		else {
			System.out.println("INVALID_INPUT");
		}
				
		sc.close();

	}

}
