package RSA_Encryption;

import java.util.Scanner;
public class ExtendedEuclidean {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the value of a: ");
int a = input.nextInt();
System.out.print("Enter the value of b: ");
int b = input.nextInt();
int[] result = extendedEuclideanAlgorithm(a, b);
int gcd = result[0];
int x = result[1];
int y = result[2];
System.out.println("gcd(" + a + "," + b + ") = " + gcd + " = " + x + " * "
+ a + " + " + y + " * " + b);
}
public static int[] extendedEuclideanAlgorithm(int a, int b) {
if (b == 0) {
return new int[] { a, 1, 0 };
} else {
int[] result = extendedEuclideanAlgorithm(b, a % b);
int gcd = result[0];
int x = result[2];
int y = result[1] - (a / b) * result[2];
return new int[] { gcd, x, y };
}
}
}
