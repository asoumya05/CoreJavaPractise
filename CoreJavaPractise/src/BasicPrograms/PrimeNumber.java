package BasicPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number : ");
			int n = sc.nextInt();
			System.out.println(n + " is a prime number - " +verifyPrime(n));
		}
		catch(Exception e) {
			System.out.println("Exception occured.." + e);
		}
	}

	private static boolean verifyPrime(int n) {
		
		boolean flag = true;
		for (int i=2; i<n; i++) {
			if((n%i==0)) {
				flag = false;
			}
		}
		return flag;
	}
}
