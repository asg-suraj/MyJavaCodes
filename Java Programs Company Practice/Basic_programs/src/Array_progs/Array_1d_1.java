package Array_progs;

import java.util.*;

public class Array_1d_1 {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 4, 5, 6, 7 }; // one type of declration
		int[] nums = new int[5]; // initalization fashion all elements set to 0
		System.out.println("Numbers of Nums1" + Arrays.toString(nums1));

		nums[0] = 12;
		nums[2] = 43;

		System.out.println("Numbers of nums" + Arrays.toString(nums));
		System.out.println("Length of Nums1 Array " + nums1.length);

		// also
		int[] nos;

		nos = new int[] { 98, 8, 7, 65, 4, 32 }; // This is also Fine in Java

		int[] tmp = nos; // this is Also Applicable and
		// here we created 2 refrences for same array successfully

		System.out.println(tmp[2]); // it will print nos[2]
		System.out.println("Numbers of Nos Array  are" + Arrays.toString(nos));
		System.out.println("Length of Nos Array " + nos.length);

		// moving through Entire array using for loop
		for (int i = 0; i < nos.length; i++) {
			System.out.println(nos[i]);
		}
	}

}
