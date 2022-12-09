package BasicPrograms;

public class Fibonacci {

	public static void main(String[] args) {

		int n = 20;
		System.out.println("Printing Fibonacci series till " + n + "th place......");
		System.out.println();
		printFibonacci(n);
		
	}

 static void printFibonacci(int n) {
		
		int f[] = new int[n+2];
		f[0]=0;
		f[1]=1;
		System.out.print(f[0] + " " + f[1]);
		for (int i=2; i<=n-1; i++) {
			f[i] = f[i-1] + f[i-2];
			System.out.print(" " + f[i]);
		}
}
}

