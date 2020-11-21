package assignments.Methods_8;

import java.util.Scanner;

public class Question_08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		fib(a);

	}

	public static void fib(int n) {
		int num1 = 0, num2 = 1;
		System.out.println("Fibonacci series of " + n + " numbers");

		for (int i = 1; i <= n; i++) {
			System.out.print(num1 + " ");
			int sumOfPrevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfPrevTwo;

		}
	}

}
