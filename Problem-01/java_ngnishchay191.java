/*
Author : ngnishchay191 (Nishchay Gupta)
College : Maharaja Agrasen Institute of Technology
Year/Department : 2nd year CSE
E-Mail Id : ngnishchay191@gmail.com
*/
import java.util.*;

public class java_ngnishchay191 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printprimes(n);
	}

	public static void printprimes(int n) {

		for (int i = 2; i <= n; i++) {
			if (isprime(i)) {
				System.out.print(i + " ");
			}
		}

	}

	public static boolean isprime(int n) {
		int div = 2;
		int var = 0;
		while (div <= n - 1) {

			if (n % div == 0) {
				var = 1;
			}
			div++;
		}
		if (var == 0) {
			return true;
		} else {
			return false;
		}

	}

}