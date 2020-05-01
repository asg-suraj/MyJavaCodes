// Sorting Arrays if odd the reverse Sort else Normal Sort


package capg_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_2 {

	public Arrays_2() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	int n;
	Scanner sc =new Scanner(System.in);
	n=sc.nextInt();
	if (n<1 || n>20) {
		System.out.println("INVALID_INPUT");
	}
	else {
	int[] nums = new int[n];
	for (int i = 0 , j=nums.length; i < j; i++) {
		nums[i]=sc.nextInt();
	}
	Arrays.sort(nums);
	
	if (n%2==0) {
		for (int i = 0, j= nums.length;i<j; i++) {
			System.out.print(nums[i]+" ");
		}
		
	} else {
		
		for (int i = 0, j= nums.length-1;j>=i; j--) {
			System.out.print(nums[j]+" ");
		}
	}
	
	}
	sc.close();

}
}
