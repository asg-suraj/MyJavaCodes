package loops;

import java.util.Scanner;
import java.util.*;

public class do_while {

	public do_while() {
		// TODO Auto-generated constructor stub
	}

	static boolean isPrime(int number) {
		for (int i = 2, limit = number / 2; i < limit; i++) {
			if (number % i == 0) {
				return false;

			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc;
		
		String reply;
		do {
			sc = new Scanner(System.in);
			System.out.println("Enter a Number ");

			int num = sc.nextInt();
			if (isPrime(num)) {
				System.out.println("Number is Prime");
			} else {
				System.out.println("Number is not Prime");
			}
			sc = new Scanner(System.in);
			System.out.println("Enter Another Number say yes/no");
			reply = sc.nextLine();

		} while (reply.equalsIgnoreCase("yes"));

	}
}
