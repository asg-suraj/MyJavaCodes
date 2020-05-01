package Array_progs;

import java.util.Arrays;

public class Array_2d_1 {

	public Array_2d_1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		int[][] nums = new int[3][4];
		System.out.println(nums.length);
		
		int[][] nums1 = new int[3][];
		nums1[0]=new int[] {1,2,3,4,6};
		nums1[1]=new int[8];
		
		
		for (int i = 0; i < nums.length; i++) {
		
			System.out.println(Arrays.toString(nums1[i]));
		}
		
		@SuppressWarnings("unused")
		int[][] numsw = {
				{},
				{},
				{},
		};  //can be also written like this		
		
	}
}
