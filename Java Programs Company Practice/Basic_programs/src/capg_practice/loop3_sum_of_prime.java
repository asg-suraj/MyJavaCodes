package capg_practice;
//This program can find Sum of Prime Numbers between 3 to 1000
//
import java.util.Scanner;

public class loop3_sum_of_prime {

	public loop3_sum_of_prime() {
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
		// TODO Auto-generated method stub
		int no1, no2;
		Scanner sc = new Scanner(System.in);
		no1 = sc.nextInt();
		no2 = sc.nextInt();
		int sum = 0;
		if ((no1 < 3 || no1 > 1000 || no2 < 3 || no2 > 1000)||no1>no2) {
			System.out.println("INVALID_INPUT");
		} else {
			for (int i = no1; i <= no2; i++) {
				if (isPrime(i)) {
					sum = sum + i;
				}
			}
			System.out.println(sum);
		}

	}

}
