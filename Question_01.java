package assignments.Methods_8;

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {

		System.out.println(plus());

	}

	public static int plus() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number:");
		int num1 = scan.nextInt();
		System.out.println("enter second number:");
		int num2 = scan.nextInt();
		return num1 + num2;
	}

}
