package assignments.Methods_8;

public class Question_14 {

	public static void main(String[] args) {

		System.out.println(threeLocks(true, false, true));
		System.out.println(threeLocks(true, false, false));
		System.out.println(threeLocks(true, true, true));

	}

	public static boolean threeLocks(boolean a, boolean b, boolean c) {
		if ((a == true && b == true) || c == true) {
			return true;
		} else {
			return false;
		}
	}

}
