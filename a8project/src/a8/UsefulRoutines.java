package a8;

public class UsefulRoutines {
	//This program computes factorial of any positive number
	public static long factorial(long n) {
		if (n == 0)
			return 1;
		return n*factorial(n-1);
	}
}
