package strings_progs;

import java.util.*;

public class prog4 {

	public prog4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int phy, chem, math;
		phy = sc.nextInt();
		chem = sc.nextInt();
		math = sc.nextInt();

		int avg = (phy + chem + math) / 3;

		if (avg >= 70) {
			System.out.println("DISTINCTION");
		} else if (avg >= 60 && avg < 70) {

			System.out.println("FIRST");
		} else if (avg >= 50 && avg < 60) {

			System.out.println("SECOND");
		} else if (avg >= 40 && avg < 50) {

			System.out.println("THIRD");
		} else {
			System.out.println("FAIL");

		}

	}

}
