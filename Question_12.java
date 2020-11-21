package assignments.Methods_8;

public class Question_12 {
	
	/*
	 * hint: use the truth table for this one, 
	 * this can be done with one if and a logical operator.
	 */

	public static void main(String[] args) {

		System.out.println(hamletQuote(true, true));
		System.out.println(hamletQuote(true, false));
		System.out.println(hamletQuote(false, true));
		System.out.println(hamletQuote(false, false));

	}

	public static boolean hamletQuote(boolean t, boolean f) {
		if (t || f) {
			return true;
		} else {
			return false;
		}

	}

}
