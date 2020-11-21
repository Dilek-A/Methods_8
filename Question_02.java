package assignments.Methods_8;

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {

		System.out.println(cube());

	}

	public static int cube() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number:");
		int num = scan.nextInt();
		return num * num * num;
	}

}
