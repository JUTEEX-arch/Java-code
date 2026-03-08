package Recursion;
public class Factorial {
	public static int factorialI(int n) {
		int fact = n;
		for (int i = n - 1; i > 0; i--) {
			fact = fact * i;
		}
		return fact;
	}
	public static int factorialR(int n ) {
		if (n == 1) {
			return 1;
		}
		return n * factorialR(n - 1);
	}
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			int f1 = factorialI(i);
			int f2 = factorialR(i);
			System.out.println(i + "! = " + f1 + ", " + f2);
		}

		int fact = factorialR(5);
		System.out.println(fact);
	}
}