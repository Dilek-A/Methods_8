package assignments.Methods_8;

public class Question_10 {

	public static void main(String[] args) {

		System.out.println(isEven(2));
		System.out.println(isEven(7));

	}

	public static boolean isEven(int num) {

		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
