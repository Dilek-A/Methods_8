package assignments.Methods_8;

public class Question_16 {

	public static void main(String[] args) {

		System.out.println(simpleRoomBook(false, 2, 1, 2018));
		System.out.println(simpleRoomBook(true, 2, 1, 2018));
		System.out.println(simpleRoomBook(true, 7, 2, 2018));

	}

	public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
		boolean result = false;
		if (isAvailable == false) {
			result = false;
		} else if (month == 7 && day > 1 && day <= 8) {
			result = false;
		} else if (year > 2018) {
			result = false;
		} else {
			result = true;
		}
		return result;
	}

}
